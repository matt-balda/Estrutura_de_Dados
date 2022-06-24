public class FilaVet implements IFila {
    private int nElemFila; //elementos do vetor
    private int inicio; // inicio
    private int fim;
    private Object[] vetFila;

    public FilaVet(int tamFila) { //construtor
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    public boolean add(Object info) { //método que insere na fila
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public boolean remove() { //método que retira da fila
        if (this.isEmpty()) { //como verificar se está vazia?
            System.out.println("Fila estah vazia");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    public boolean isEmpty() {
        if (this.nElemFila == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.nElemFila;
    }

    public String imprime() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = this.inicio; i < this.vetFila.length; i++) {
            if (vetFila[i] != null) {
                stringBuilder.append(vetFila[i] + " ");
            }
        }
        return stringBuilder.toString();
    }
}
