package Fila;

import Model.Aluno;

public class NohFila {
    private Aluno info;
    private NohFila prox;

    public NohFila(Aluno info) {
        this.info = info;
        this.prox = null;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public NohFila getProx() {
        return prox;
    }

    public void setProx(NohFila prox) {
        this.prox = prox;
    }
}
