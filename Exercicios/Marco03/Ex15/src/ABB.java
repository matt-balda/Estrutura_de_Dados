public class ABB {
    private Noh raiz;

    public ABB() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty())
            this.raiz = new Noh(element);
        else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                    if (aux.dir == null) {
                        Noh newNode = new Noh(element);
                        aux.dir = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.dir;
                }
            }
        }
    }

    public Noh get(Noh raiz, int v){
        if (isEmpty()){
            return null;
        }else if (raiz.getValor() > v){
            return get(raiz.esq, v);
        }else if(raiz.getValor() < v){
            return get(raiz.dir, v);
        }
        return raiz;
    }

    public String imprimir(Noh aux) {
        final StringBuilder stringBuilder = new StringBuilder();
        aux = getRaiz();
        if (aux != null) {
            imprimir(aux.esq);
            stringBuilder.append(aux.valor).append("\n");
            imprimir(aux.dir);
        }
        return stringBuilder.toString();
    }

    public Noh getRaiz() {
        return raiz;
    }
}
