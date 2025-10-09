package menu;

import java.util.ArrayList;
import java.util.List;

public class Matricular {
    private List <Aluno> alunos;

    public Matricular(){
        this.alunos = new ArrayList<>();
    }
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

}
