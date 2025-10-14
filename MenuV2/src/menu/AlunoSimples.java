package menu;

public class AlunoSimples implements Aluno{
    private String nome;
    private String matricula;

    public AlunoSimples(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String nome() {
        return this.nome;
    }

    @Override
    public String matricula() {
        return this.matricula;
    }
}
