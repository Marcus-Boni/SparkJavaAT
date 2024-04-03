package escolaApp.service;

import escolaApp.Aluno;

import java.util.HashMap;
import java.util.Map;

public class AlunoService {
    private static Map<String, Aluno> alunos = new HashMap<>();

    public Map<String, Aluno> getAllAlunos() {
        return alunos;
    }

    public Aluno getAlunoById(String id) {
        return alunos.get(id);
    }

    public Aluno addAluno(Aluno aluno) {
        alunos.put(String.valueOf(aluno.getId()), aluno);
        return aluno;
    }

    public Aluno updateAluno(String id, Aluno aluno) {
        if (alunos.containsKey(id)) {
            alunos.put(id, aluno);
            return aluno;
        } else {
            return null;
        }
    }

    public Aluno deleteAluno(String id) {
        return alunos.remove(id);
    }
}
