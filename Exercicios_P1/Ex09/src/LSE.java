public class LSE implements ILista {
    private Noh inicio;
    private int contElementos;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(int valor) {
        Noh novo = new Noh(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
        contElementos++;
    }

    @Override
    public void insereFim(int valor) {
        Noh novo = new Noh(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
            contElementos++;
        }
    }

    @Override
    public boolean estahVazia() {
        for (Noh i = inicio; i == null; i = i.getProximo()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int valor) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && p.getValor() != valor) {
            ant = p;
            p = p.getProximo();
        }
        if (p == null) {
            return false;
        }
        if (ant == null) {
            inicio = p.getProximo();
        } else {
            ant.setProximo(p.getProximo());
        }
        contElementos--;
        return true;
    }

    @Override
    public int tamanho() {
        return contElementos;
    }

    public void bubbleSort() {
        Noh corrente, indice;
        int temp;
        for (corrente = inicio; corrente.getProximo() != null; corrente = corrente.getProximo()) {
            for (indice = corrente.getProximo(); indice != null; indice = indice.getProximo()) {
                if (corrente.getValor() > indice.getValor()) {
                    temp = corrente.getValor();
                    corrente.setValor(indice.getValor());
                    indice.setValor(temp);
                }
            }
        }
    }

    public String imprime() {
        final StringBuilder stringBuilder = new StringBuilder();
        estahVazia();
        for (Noh i = inicio; i != null; i = i.getProximo()) {
            stringBuilder.append(i.getValor() + " ");
        }
        return stringBuilder.toString();
    }
}
