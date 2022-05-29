package Entidades;

import java.io.Serializable;

public class Veiculo implements Serializable {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private int potencia;
    private int numDeLugares;
    private Categoria categoria;

    public Veiculo(String placa, String modelo, String marca, int ano, int potencia, int numDeLugares, Categoria categoria) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.numDeLugares = numDeLugares;
        this.categoria = categoria;
    }

    public Veiculo() {

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumDeLugares() {
        return numDeLugares;
    }

    public void setNumDeLugares(int numDeLugares) {
        this.numDeLugares = numDeLugares;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Placa: " + placa +
                " | Modelo: " + modelo +
                " | Marca: " + marca +
                " | Ano: " + ano +
                " | Potencia: " + potencia +
                " | Número de Lugares: " + numDeLugares+
                " | Categoria: " + categoria;
    }
}
