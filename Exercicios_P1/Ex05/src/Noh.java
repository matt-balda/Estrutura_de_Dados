public class Noh {
    private int valor;
    private Noh ant;
    private Noh proximo;

    public Noh(int valor) {
        this.valor = valor;
        this.ant = null;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh ant) {
        this.ant = ant;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}
