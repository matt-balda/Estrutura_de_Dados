package Noh;

import Entidades.Veiculo;
import java.io.Serializable;

public class NohVeiculos implements Serializable {
    private Veiculo valor;
    private NohVeiculos ant;
    private NohVeiculos proximo;

    public NohVeiculos(Veiculo valor) {
        this.valor = valor;
        this.ant = null;
        this.proximo = null;
    }

    public Veiculo getValor() {
        return valor;
    }

    public void setValor(Veiculo valor) {
        this.valor = valor;
    }

    public NohVeiculos getAnt() {
        return ant;
    }

    public void setAnt(NohVeiculos ant) {
        this.ant = ant;
    }

    public NohVeiculos getProximo() {
        return proximo;
    }

    public void setProximo(NohVeiculos proximo) {
        this.proximo = proximo;
    }

    public String getPlaca() {
        return valor.getPlaca();
    }

    public int getPotencia() {
        return valor.getPotencia();
    }

    public int getNumDeLugares() {
        return valor.getNumDeLugares();
    }

    public String toStringVeiculo() {
        return valor.toString();
    }

    public int getRestricaoId() {
        return valor.getCategoria().getId();
    }
}
