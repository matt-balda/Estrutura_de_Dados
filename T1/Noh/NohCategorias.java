package Noh;

import Entidades.Categoria;

import java.io.Serializable;

public class NohCategorias implements Serializable {
    private Categoria info;
    private NohCategorias ant;
    private NohCategorias prox;

    public NohCategorias(Categoria info) {
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public Categoria getInfo() {
        return info;
    }

    public NohCategorias getProx() {
        return prox;
    }

    public void setProx(NohCategorias n) {
        this.prox = n;
    }

    public NohCategorias getAnt() {
        return ant;
    }

    public void setAnt(NohCategorias n) {
        this.ant = n;
    }

    public int getId() {
        return info.getId();
    }

    public String toString() {
        return info.toString();
    }
}

