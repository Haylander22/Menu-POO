package menu;

import java.util.Scanner;

public class MenuPrincipal{
    public int opcao() {
        System.out.println("Menu Principal\n"+
                           "1. Lancar nota\n"+
                           "2. Matricular\n"+
                           "3. Sair");
        return new Scanner(System.in).nextInt();
    }
}
