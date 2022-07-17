package Pilha;

import Model.Aluno;

public interface IPilha {
    public boolean push(Aluno info);

    public Object pop();

    public Object top(); //retorna sem removê-lo

    public boolean isEmpty();

    public int size();
}
