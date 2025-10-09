package menu;

public class NotaSimples implements Nota{
    private double nota;

    public NotaSimples(double nota) {
        this.nota = nota;
    }

    @Override
    public double valor() {
        return this.nota;
    }
}
