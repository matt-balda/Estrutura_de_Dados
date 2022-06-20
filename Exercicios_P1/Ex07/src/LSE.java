public class LSE implements ILista{
    private Noh inicio;
    private int contElementos;

    public LSE() {
        this.inicio = null;
    }

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

    public boolean estahVazia() {
        for (Noh i = inicio; i == null; i = i.getProximo()) {
            return true;
        }
        return false;
    }

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

    public int tamanho() {
        return contElementos;
    }

    public String imprime() {
        final StringBuilder stringBuilder = new StringBuilder();
        estahVazia();
        for (Noh i = inicio; i != null; i = i.getProximo()) {
            stringBuilder.append(i.getValor() + " ");
        }
        return stringBuilder.toString();
    }

    public void imprime_rec1(){
        imprime_rec(inicio);
    }

    public void imprime_rec(Noh node) {
        if(node==null) {
            return;
        } else {
            imprime_rec(node.getProximo());
            System.out.print(node.getValor()+" ");
        }
    }
}

