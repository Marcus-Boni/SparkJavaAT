package escolaApp.controller;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import escolaApp.Aluno;
import spark.Request;
import spark.Response;

public class AlunoController {
    private Map<Integer, Aluno> alunos = new HashMap<>();
    private int proximoId = 1;
    private Gson gson = new Gson();

    public String listarAlunos(Request request, Response response) {
        response.type("application/json");
        return gson.toJson(alunos.values());
    }

    public String obterAluno(Request request, Response response) {
        response.type("application/json");
        int id = Integer.parseInt(request.params(":id"));
        Aluno aluno = alunos.get(id);
        if (aluno != null) {
            return gson.toJson(aluno);
        } else {
            response.status(404);
            return gson.toJson(new ErrorMessage("Aluno não encontrado"));
        }
    }

    public String criarAluno(Request request, Response response) {
        response.type("application/json");
        Aluno aluno = gson.fromJson(request.body(), Aluno.class);
        aluno.setId(proximoId++);
        alunos.put(aluno.getId(), aluno);
        response.status(201);
        return gson.toJson(aluno);
    }

    public String atualizarAluno(Request request, Response response) {
        response.type("application/json");
        int id = Integer.parseInt(request.params(":id"));
        Aluno aluno = gson.fromJson(request.body(), Aluno.class);
        aluno.setId(id);
        alunos.put(id, aluno);
        return gson.toJson(aluno);
    }

    public String excluirAluno(Request request, Response response) {
        response.type("application/json");
        int id = Integer.parseInt(request.params(":id"));
        Aluno aluno = alunos.remove(id);
        if (aluno != null) {
            return gson.toJson(aluno);
        } else {
            response.status(404);
            return gson.toJson(new ErrorMessage("Aluno não encontrado"));
        }
    }

    private static class ErrorMessage {
        private String message;

        public ErrorMessage(String message) {
            this.message = message;
        }
    }
}
