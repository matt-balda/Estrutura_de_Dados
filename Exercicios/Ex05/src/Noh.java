public class Noh {
    private Object valor;
    private Noh proximo;

    public Noh(Object valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

}
