package Pilha;

import Model.Aluno;

public class NohPilha {
    private Aluno info;
    private NohPilha prox;

    public NohPilha(Aluno info) {
        this.info = info;
        this.prox = null;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public NohPilha getProx() {
        return prox;
    }

    public void setProx(NohPilha prox) {
        this.prox = prox;
    }
}
