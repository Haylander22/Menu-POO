package menu;

import input.Input;

import java.util.ArrayList;
import java.util.List;

public class OpcaoLancarNota implements Opcao{
    private List<Nota> notas;
    private String descricao;
    private int numero;

    public OpcaoLancarNota(String descricao, int numero){
        this.notas = new ArrayList<>();
        this.descricao = descricao;
        this.numero = numero;
    }

    @Override
    public void executar() {
        double valorNota;
        System.out.println("");
        System.out.println("Menu Lancar Nota");
        valorNota = Input.inD("Digite a nota a ser lancada: ");

        Nota nota = new NotaSimples(valorNota);

        lancarNota(nota);
        mostrarNotas();
    }
    public void lancarNota(Nota nota){
        notas.add(nota);
    }
    public String descricao(){
        return this.descricao;
    }
    public int numero(){
        return this.numero;
    }
    public void mostrarNotas() {
        System.out.println("Lista de notas");
        for (Nota n : notas) {
            System.out.println(n.valor() + " ");
        }
    }
}
