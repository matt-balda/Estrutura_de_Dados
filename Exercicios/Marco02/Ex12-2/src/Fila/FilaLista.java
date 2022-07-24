package Fila;

import Model.Aluno;

public class FilaLista implements IFila {
    private NohFila inicio;
    private NohFila fim;
    private int contElem;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean add(Aluno info) { //insere
        NohFila novo = new NohFila(info);
        if (this.isEmpty())
            inicio = novo;
        else
            fim.setProx(novo);
        fim = novo;
        contElem++;
        return true;
    }

    public boolean remove() { //remove
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else
                inicio = inicio.getProx();
            contElem--;
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return contElem;
    }

    public String imprime() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (NohFila i = inicio; i != null; i = i.getProx()) {
            stringBuilder.append(i.getInfo());
        }
        return stringBuilder.toString();
    }

    public NohFila getInicio() {
        return inicio;
    }
}
