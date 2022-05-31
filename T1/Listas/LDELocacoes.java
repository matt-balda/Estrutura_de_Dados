package Listas;

import Interfaces.ILocacao;
import Entidades.Categoria;
import Entidades.Locacao;
import Noh.NohLocacoes;
import Noh.NohVeiculos;

public class LDELocacoes implements ILocacao {
    private NohLocacoes inicio;
    private NohLocacoes fim;
    private NohLocacoes p;
    private Locacao loc;
    private Categoria categoria;
    public static LDELocacoes INSTANCE;


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
            if (inicio != null) {
                inicio.setAnt(null);
            }
        } else if (p.getProximo() == null) {
            p.getAnt().setProximo(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProximo(p.getProximo());
            p.getProximo().setAnt(p.getAnt());
        }
        veiculosNaoLocados(LDEVeiculos.INSTANCE).insereFim(info.getVeiculo());
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

    public boolean estahVazia(Locacao info) {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existeCliente(String cpf){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getRestricaoCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    public boolean existeVeiculo(String placa){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getRestricaoPlaca().equals(placa)){
                return true;
            }
        }
        return false;
    }

    public boolean existeLocacao(String placa){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getRestricaoLocacao().equals(placa)){
                return true;
            }
        }
        return false;
    }
    public Locacao buscaPlacaLoc(String placa){
        for (NohLocacoes i = inicio; i != null; i = i.getProximo()){
            if (i.getRestricaoLocacao().equals(placa)) {
                loc = i.getValor();
                return loc;
            }
        }
        return null;
    }
    public LDEVeiculos veiculosNaoLocados(LDEVeiculos veiculos){
        LDEVeiculos naoLocados = new LDEVeiculos();
        for (NohVeiculos veiculo =veiculos.getInicio();veiculo!=null;veiculo=veiculo.getProximo()) {
            boolean locado = false;
            for (NohLocacoes i = inicio; i != null; i = i.getProximo()) {
                if (veiculo.getPlaca().equals(i.getRestricaoPlaca())) {
                    locado = true;
                }
            }
            if (!locado) {
                if (naoLocados.estahVazia()) {
                    naoLocados.insereInicio(veiculo.getValor());
                } else {
                    naoLocados.insereFim(veiculo.getValor());
                }
            }
        }
        return naoLocados;
    }

}
