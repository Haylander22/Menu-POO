package menu;

import input.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuLancarNota {
    private LancarNota lancar;
    private List<Nota> notas;

    public MenuLancarNota() {
        this.lancar = new LancarNota();
        this.notas = new ArrayList<>();
    }

    public void menuLancarNota() {
        double valorNota;
        System.out.println("");
        System.out.println("Menu Lancar Nota");
        valorNota = Input.inD("Digite a nota a ser lancada: ");

        Nota nota = new NotaSimples(valorNota);

        lancarNota(nota);

    }

    public void mostraNotas() {
        for (Nota n : notas) {
            System.out.println("Notas: "+n.valor());
        }

    }
    public void lancarNota(Nota nota){
        notas.add(nota);
    }
}
