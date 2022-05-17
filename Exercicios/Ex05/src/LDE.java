public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;
    private int contElementos;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object valor) {
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
    public void insereFim(Object valor) {
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

    @Override
    public boolean remove(Object valor) {
        Noh p = inicio;
        busca(valor);
        if (p.getAnt() == null){
            inicio = p.getProximo();
            inicio.setAnt(null);
        } else if (p.getProximo() == null){
            p.getAnt().setProximo(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProximo(p.getProximo());
            p.getProximo().setAnt(p.getAnt());
        }
        return true;
    }

    public boolean busca(Object valor){
        Noh p = inicio;
        while (p!=null && p.getValor()!=valor) {
           p = p.getProximo();
        }
        if (p == null){
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
        estahVazia();
        for (Noh i = inicio; i != null; i = i.getProximo()) {
            j++;
            stringBuilder.append("Elemento " + j + ": ");
            stringBuilder.append(i.getValor());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
    public String imprimeInverso() {
        int j = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        estahVazia();
        for (Noh i = fim; i != null; i = i.getAnt()) {
            j++;
            stringBuilder.append("Elemento " + j + ": ");
            stringBuilder.append(i.getValor());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}


