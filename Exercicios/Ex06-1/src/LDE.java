public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;
    private Noh p; // noh auxiliar para ser utilizado no metodo busca e remove, sem alteracao do mesmo
    private int contElementos;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(int valor) {
        Noh novo = new Noh(valor);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnt(novo);
            inicio = novo;

        }
        contElementos++;
    }

    @Override
    public void insereFim(int valor) {
        Noh novo = new Noh(valor);
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        contElementos++;
    }

    @Override
    public boolean estahVazia() {
        for (Noh i = inicio; i == null; i = i.getProximo()) {
            return true;
        }
        return false;
    }

    public boolean estahVaziaInverso() {
        for (Noh i = fim; i == null; i = i.getAnt()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(int valor) {
        if (busca(valor)) {
            if (p.getAnt() == null) {
                inicio = p.getProximo();
                if (inicio != null) {
                    inicio.setAnt(null);
                } else {
                    fim = null;
                }
            } else if (p.getProximo() == null) {
                p.getAnt().setProximo(null);
                fim = p.getAnt();
            } else {
                p.getAnt().setProximo(p.getProximo());
                p.getProximo().setAnt(p.getAnt());
            }
        }
        contElementos--;
        return true;
    }

    public boolean busca(int valor) {
        p = inicio;
        while (p != null && p.getValor() != valor) {
            p = p.getProximo();
        }
        if (p == null) {
            return false;
        }
        return true;
    }

    @Override
    public int tamanho() {
        return contElementos;
    }

    public String imprime() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        if (!estahVazia()) {
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                j++;
                stringBuilder.append("Elemento " + j + ": ");
                stringBuilder.append(i.getValor());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String imprimeInverso() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        if (!estahVaziaInverso()) {
            for (Noh i = fim; i != null; i = i.getAnt()) {
                j++;
                stringBuilder.append("Elemento " + j + ": ");
                stringBuilder.append(i.getValor());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}


