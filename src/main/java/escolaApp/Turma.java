package escolaApp;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private double notaFinal;

    // Construtor
    public Turma(Disciplina disciplina) {
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarAlunos() {
        return alunos;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}