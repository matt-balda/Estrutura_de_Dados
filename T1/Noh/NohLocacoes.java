package Noh;

import Entidades.Locacao;

public class NohLocacoes {
    private Locacao valor;
    private NohLocacoes ant;
    private NohLocacoes proximo;

    public NohLocacoes(Locacao valor) {
        this.valor = valor;
        this.ant = null;
        this.proximo = null;
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

    public int getCodLocacao(){
        return valor.getCodLocacao();
    }
    public String toStringLocacao(){
        return valor.toString();
    }
    public String getRestricaoCpf(){
        return valor.getCliente().getCpf();
    }
    public String getRestricaoPlaca(){
        return valor.getVeiculo().getPlaca();
    }
    public String getRestricaoLocacao(){ return valor.getVeiculo().getPlaca();}

}
