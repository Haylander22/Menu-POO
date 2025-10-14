package menu;

import input.Input;

import java.util.ArrayList;
import java.util.List;

public class OpcaoMatricular implements Opcao{
    private Alunos alunos;
    private int numero;
    private String descricao;

    public OpcaoMatricular(int numero, String descricao, Alunos alunos){
        this.alunos = alunos;
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public void executar() {
        String matricula = Input.inS("Digite a matricula: ");

        String nome = Input.inS("Digite o nome: ");

        Aluno alunoNovo = new AlunoSimples(nome, matricula);

        alunos.adicionar(alunoNovo);
    }
}
