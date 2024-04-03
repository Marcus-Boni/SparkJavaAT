package escolaApp;
import escolaApp.controller.AlunoController;
import spark.Spark;

public class App {
    public static void main(String[] args) {
        /*
        AlunoService alunoService = new AlunoService();

        get("/alunos", (req, res) -> alunoService.getAllAlunos(), new JsonTransformer());

        // Rota para obter um aluno pelo ID
        get("/alunos/:id", (req, res) -> {
            String id = req.params(":id");
            return alunoService.getAlunoById(id);
        }, new JsonTransformer());

        // Rota para adicionar um novo aluno
        post("/alunos", (req, res) -> {
            Aluno aluno = new Gson().fromJson(req.body(), Aluno.class);
            return alunoService.addAluno(aluno);
        }, new JsonTransformer());

        // Rota para atualizar um aluno existente
        put("/alunos/:id", (req, res) -> {
            String id = req.params(":id");
            Aluno aluno = new Gson().fromJson(req.body(), Aluno.class);
            return alunoService.updateAluno(id, aluno);
        }, new JsonTransformer());

        // Rota para excluir um aluno
        delete("/alunos/:id", (req, res) -> {
            String id = req.params(":id");
            return alunoService.deleteAluno(id);
        }, new JsonTransformer());

        staticFiles.location("/public"); */

        Spark.port(8080);

        Spark.get("/", (req, res) -> {return App.class.getResourceAsStream("/index.html");});

        AlunoController alunoController = new AlunoController();

        // Rota para listar todos os alunos (GET)
        Spark.get("/alunos", alunoController::listarAlunos);

        // Rota para obter detalhes de um aluno específico (GET)
        Spark.get("/alunos/:id", alunoController::obterAluno);

        // Rota para criar um novo aluno (POST)
        Spark.post("/alunos", alunoController::criarAluno);

        // Rota para atualizar os dados de um aluno existente (PUT)
        Spark.put("/alunos/:id", alunoController::atualizarAluno);

        // Rota para excluir um aluno (DELETE)
        Spark.delete("/alunos/:id", alunoController::excluirAluno);

        /*
        get("/", (req, res) -> {
            // Obter o CEP fornecido pelo usuário
            String cep = req.queryParams("cep");

            // Verificar se o CEP foi fornecido
            if (cep != null && !cep.isEmpty()) {
                // Fazer uma requisição HTTP para a API ViaCEP
                String url = "https://viacep.com.br/ws/" + cep + "/json/";
                String responseData = Request.Get(url).execute().returnContent().asString();

                // Retornar os dados obtidos como resposta para o cliente
                return responseData;
            } else {
                // Se o CEP não foi fornecido, retornar uma mensagem de erro
                res.status(400);
                return "Por favor, forneça um CEP válido.";
            }
        }); */
    }
}