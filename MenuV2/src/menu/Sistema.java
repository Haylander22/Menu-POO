package menu;

public class Sistema {
    public static void main(String[] args) {
        int op;

        AlunosMemoria alunosMemoria = new AlunosMemoria();

        MenuPrincipal menu = new MenuPrincipal();
        Opcao opl = new OpcaoLancarNota("Menu",2);
        OpcaoMatricular opcaoMatricular = new OpcaoMatricular(1,"Menu",alunosMemoria);
    do{
        op = menu.opcao();

            switch (op) {
                case 1:
                    opl.executar();
                    break;

                case 2:
                    opcaoMatricular.executar();
                    break;
            }
        }while (op != 3);







    }
}
