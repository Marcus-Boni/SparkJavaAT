package escolaApp;

public class Professor {
    private int matricula;
    private String nome;
    private String areaAtuacao;

    public Professor(int matricula, String nome, String areaAtuacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}