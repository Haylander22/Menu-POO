package menu;

import java.util.List;

public interface Alunos {
    void adicionar(Aluno aluno);
    Aluno buscarPorMatricula(String matricula);
    void remover(String matricula);
    List<Aluno> todos();
}
