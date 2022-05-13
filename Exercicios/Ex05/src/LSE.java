public class LSE implements ILista {
    private Noh inicio;
    private int contElementos;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object valor) {
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
    public void insereFim(Object valor) {
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
    public boolean remove(Object valor) {
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

    public String imprime() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        estahVazia();
        for (Noh i = inicio; i != null; i = i.getProximo()) {
            j++;
            stringBuilder.append("Elemento " + j + ": ");
            stringBuilder.append(i.getValor());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}


