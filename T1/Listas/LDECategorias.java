package Listas;

import Entidades.Categoria;
import Interfaces.ICategoria;
import Noh.NohCategorias;

import java.io.Serializable;

public class LDECategorias implements ICategoria, Serializable {

    private NohCategorias inicio;
    private NohCategorias fim;
    private Categoria cat;
    public static LDECategorias INSTANCE;

    public LDECategorias() {
        this.inicio = null;
        this.fim = null;
        INSTANCE = this;
    }

    public void insereInicio(Categoria info) {
        NohCategorias novo = new NohCategorias(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }

    public void insereFim(Categoria info) {
        NohCategorias novo = new NohCategorias(info);
        if (fim == null) {
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

//    public boolean busca(Categoria info) {
//        NohCategorias p = inicio;
//        while (p != null && p.getInfo() != info)
//            p = p.getProx();
//        if (p == null) {
//            return false;
//        }
//        return true;
//    }

    public boolean remove(Categoria info) {
        NohCategorias p = inicio;
        while (p != null && p.getInfo() != info) {
            p = p.getProx();
        }
        if (p == null) {
            return false;
        }
        if (p.getAnt() == null) {
            inicio = p.getProx();
            if (inicio != null) {
                inicio.setAnt(null);
            }
        } else if (p.getProx() == null) {
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    public void imprime() {
        if (!estahVazia()) {
            for (NohCategorias i = inicio; i != null; i = i.getProx()) {
                System.out.println(i.getInfo());
            }
        }
    }

    public void imprimeFim() {
        for (NohCategorias i = fim; i != null; i = i.getAnt()) {
            System.out.println(i.getInfo());
        }
    }

    public boolean estahVazia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public Categoria buscaIdObj(int id) {
        for (NohCategorias i = inicio; i != null; i = i.getProx()) {
            if (i.getId() == id) {
                cat = i.getInfo();
                return cat;
            }
        }
        return null;
    }

    public boolean existe(int id) {
        for (NohCategorias i = inicio; i != null; i = i.getProx()) {
            if (i.getId() == (id)) {
                return true;
            }
        }
        return false;
    }
}




