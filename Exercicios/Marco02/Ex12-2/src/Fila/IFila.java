package Fila;

import Model.Aluno;

public interface IFila {
    public boolean add(Aluno info);

    public boolean remove(Aluno info);

    public boolean isEmpty();

    public int size();

    public String imprime();
}
