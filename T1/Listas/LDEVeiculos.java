package Listas;

import Entidades.Veiculo;
import Interfaces.ILista;

public class LDEVeiculos implements ILista {
    private NohVeiculos inicio;
    private NohVeiculos fim;
    private NohVeiculos p;
    private Veiculo v;
    private int contElementos;

    public LDEVeiculos() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Veiculo valor) {
        NohVeiculos novo = new NohVeiculos(valor);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnt(novo);
            inicio = novo;

        }
        contElementos++;
    }

    @Override
    public void insereFim(Veiculo valor) {
        NohVeiculos novo = new NohVeiculos(valor);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProximo(novo);
            fim = novo;
            }
            contElementos++;
        }

    @Override
    public boolean estahVazia() {
        for (NohVeiculos i = inicio; i == null; i = i.getProximo()) {
            return true;
        }
        return false;
    }
    public boolean estahVaziaInverso(){
        for (NohVeiculos i = fim; i == null; i = i.getAnt()){
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Veiculo valor) {
        if (busca(valor)) {
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
            contElementos--;
        }
        return false;
    }

    public boolean busca(Veiculo valor){
        p = inicio;
        while (p!=null && !p.getValor().equals(valor)) {
           p = p.getProximo();
        }
        if (p == null){
            return false;
        }
        return true;
    }
    public String buscaPlaca(String placa) {
        for (NohVeiculos i = inicio; i != null; i = i.getProximo()) {
            if (i.getPlaca().equals(placa)){
                return i.toStringVeiculo();
            }
        }
        return null;
    }
    public Veiculo buscaPlacaObj(String placa){
        for (NohVeiculos i = inicio; i != null; i = i.getProximo()){
            if (i.getPlaca().equals(placa)) {
                v = i.getValor();
                return v;
            }
        }
        return null;
    }
    public boolean existe(String placa){
        for (NohVeiculos i = inicio; i != null; i = i.getProximo()){
            if (i.getPlaca().equals(placa)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int tamanho() {
        return contElementos;
    }

    public String imprime() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        if (!estahVazia()) {
            for (NohVeiculos i = inicio; i != null; i = i.getProximo()) {
                j++;
                stringBuilder.append("Elemento " + j + ": ");
                stringBuilder.append(i.getValor());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public String imprimeInverso() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        if (!estahVaziaInverso()) {
            for (NohVeiculos i = fim; i != null; i = i.getAnt()) {
                j++;
                stringBuilder.append("Elemento " + j + ": ");
                stringBuilder.append(i.getValor());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}


