package menu;

public class Sistema {
    public static void main(String[] args) {
        int op;

        Nota nota = new NotaSimples(10);
        Nota nota2 = new NotaSimples(5.5);
        Aluno joao = new AlunoSimples("Joao","123");
        Aluno maria = new AlunoSimples("Maria","123");
        MenuPrincipal menu = new MenuPrincipal();
        MenuLancarNota ml = new MenuLancarNota();
        Matricular matricular = new Matricular();
        LancarNota lancar = new LancarNota();
    do{
        op = menu.opcao();

            switch (op) {
                case 1:
                    ml.menuLancarNota();
                    ml.mostraNotas();
                    break;
            }
        }while (op != 3);


        matricular.adicionarAluno(joao);
        matricular.adicionarAluno(maria);






    }
}
