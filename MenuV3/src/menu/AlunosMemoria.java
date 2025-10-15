package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunosMemoria implements Alunos{
   private Map<String, Aluno> alunos;

   public AlunosMemoria(){
       this.alunos = new HashMap<>();
   }

    @Override
    public void adicionar(Aluno aluno) {
        this.alunos.put(aluno.matricula(),aluno);
    }

    @Override
    public Aluno buscarPorMatricula(String matricula) {
        return this.alunos.get(matricula);
    }

    @Override
    public void remover(String matricula) {
       this.alunos.remove(matricula);

    }

    @Override
    public List<Aluno> todos() {
        return new ArrayList<>((alunos.values()));
    }
}
