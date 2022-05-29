package Listas;

import Entidades.Categoria;
import Entidades.Cliente;
import Entidades.Locacao;
import Noh.NohLocacoes;


public class LDELocacoes {
    private NohLocacoes inicio;
    private NohLocacoes fim;
    private NohLocacoes p;
    private Locacao loc;
    private Categoria categoria;
    public static LDELocacoes INSTANCE;
    private int totalInfo;


    public LDELocacoes() {
        this.inicio = null;
        this.fim = null;
        INSTANCE = this;
    }

    public void insereInicio(Locacao info) {
        NohLocacoes novo = new NohLocacoes(info);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
        totalInfo++;
    }

    public void insereFim(Locacao info) {
        NohLocacoes novo = new NohLocacoes(info);
        if (fim == null)
            fim = novo;
        else {
            novo.setAnt(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        totalInfo++;
    }

    public boolean busca(Locacao info) {
        p = inicio;
        while (p != null && p.getValor() != info)
            p = p.getProximo();
        if (p == null) {
            return false;
        }
        return true;
    }

    public boolean remove(Locacao info) {
        busca(info);
        if (p == null) {
            return false;
        }
        if (p.getAnt() == null) {
            inicio = p.getProximo();
            inicio.setAnt(null);
        } else if (p.getProximo() == null) {
            p.getAnt().setProximo(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProximo(p.getProximo());
            p.getProximo().setAnt(p.getAnt());
        }
        totalInfo--;
        return true;
    }

    public void imprime() {
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()) {
            System.out.println(i.getValor());
        }
    }

    public void imprimeFim() {
        for (NohLocacoes i = fim; i != null; i = i.getAnt()) {
            System.out.println(i.getValor());
        }
    }

    public int tamanho() {
        return this.totalInfo;
    }

    public boolean estahVazia(Cliente info) {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    public String buscaCodLocacao(int cod) {
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()) {
            if (i.getCodLocacao() == cod) {
                return i.toStringLocacao();
            }
        }
        return null;
    }
    public Locacao buscaCodLocacaoObj(int cod){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getCodLocacao() == cod) {
                loc = i.getValor();
                return loc;
            }
        }
        return null;
    }

    public boolean existeCliente(String cpf){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getRestricaoCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
//    public boolean existeVeiculo(String cpf){
//        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
//            if (i.getCpf().equals(cpf)){
//                return true;
//            }
//        }
//        return false;
//    }
}
