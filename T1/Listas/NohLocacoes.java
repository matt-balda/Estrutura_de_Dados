package Listas;

import Entidades.Locacao;

import java.io.Serializable;

public class NohLocacoes implements Serializable {
    private Locacao valor;
    private NohLocacoes ant;
    private NohLocacoes proximo;

    public NohLocacoes(Locacao valor) {
        this.valor = valor;
        this.ant = ant;
        this.proximo = proximo;
    }

    public Locacao getValor() {
        return valor;
    }

    public void setValor(Locacao valor) {
        this.valor = valor;
    }

    public NohLocacoes getAnt() {
        return ant;
    }

    public void setAnt(NohLocacoes ant) {
        this.ant = ant;
    }

    public NohLocacoes getProximo() {
        return proximo;
    }

    public void setProximo(NohLocacoes proximo) {
        this.proximo = proximo;
    }
}
