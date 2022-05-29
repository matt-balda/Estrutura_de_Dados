package Entidades;

import java.util.Date;

public class Locacao {
    private static int numeroGeral = 1000;
    private int codLocacao;
    private double valorDiaria;
    private Date dataInicial;
    private Date dataFinal;
    private Cliente cliente;
    private Veiculo veiculo;

    public Locacao(double valorDiaria, Date dataInicial, Date dataFinal, Cliente cliente, Veiculo veiculo) {
        this.codLocacao = numeroGeral++;
        this.valorDiaria = valorDiaria;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }
    public Locacao(){

    }

    public static int getNumeroGeral() {
        return numeroGeral;
    }

    public static void setNumeroGeral(int numeroGeral) {
        Locacao.numeroGeral = numeroGeral;
    }

    public int getCodLocacao() {
        return codLocacao;
    }

    public void setCodLocacao(int codLocacao) {
        this.codLocacao = codLocacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "codLocacao=" + codLocacao +
                ", valorDiaria=" + valorDiaria +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", cliente=" + cliente +
                ", veiculo=" + veiculo +
                '}';
    }
}