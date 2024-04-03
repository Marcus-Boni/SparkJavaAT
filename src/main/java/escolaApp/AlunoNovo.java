package escolaApp;

import java.util.ArrayList;
import java.util.List;

public class AlunoNovo extends Pessoa {
    private int matricula;
    private List<Turma> turmas;

    public AlunoNovo(String nome, String endereco, int matricula) {
        super(nome, endereco);
        this.matricula = matricula;
        this.turmas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> listarTurmas() {
        return turmas;
    }

    public boolean verificarAprovacao() {
        for (Turma turma : turmas) {
            if (turma.getNotaFinal() < 7.0) {
                return false;
            }
        }
        return true;
    }
}
