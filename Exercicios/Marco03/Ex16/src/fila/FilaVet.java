package fila;

import arvore.Noh;

public class FilaVet  {
    private int size; //elementos do vetor
    private int inicio; // inicio
    private int fim;
    private final Noh[] vetFila;

    public FilaVet(int tamFila) { //construtor
        this.size = 0;
        this.inicio = 0;
        this.vetFila = new Noh[tamFila];
    }

    public boolean add(Noh info) { //método que insere na fila
        if (this.size == vetFila.length) {
            throw new IllegalArgumentException("Capacidade da fila esgotou");
        }
        fim = (this.inicio + this.size) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.size++;
        return true;
    }

    public Noh remove() { //método que retira da fila
        if (isEmpty()) { //como verificar se está vazia?
            throw new IllegalArgumentException("Fila estah vazia");
        }
        var aux = this.inicio;
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.size--;
        return vetFila[aux];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public String imprime() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.inicio; i < this.vetFila.length; i++) {
            if (vetFila[i] != null) {
                stringBuilder.append(vetFila[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
