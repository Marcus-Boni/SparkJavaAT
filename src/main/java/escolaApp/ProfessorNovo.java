package escolaApp;

import escolaApp.Disciplina;
import escolaApp.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ProfessorNovo extends Pessoa {
    private String areaAtuacao;
    private List<Disciplina> disciplinas;

    public ProfessorNovo(String nome, String endereco, String areaAtuacao) {
        super(nome, endereco);
        this.areaAtuacao = areaAtuacao;
        this.disciplinas = new ArrayList<>();
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }
}
