package menu;

import java.util.List;

public interface Menu {
    void adicionar(Opcao op);
    List<Opcao> opcoes();
    String titulo();
    void exibir();
}
