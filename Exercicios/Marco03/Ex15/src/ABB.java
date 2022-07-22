import java.io.PrintStream;

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

    public Noh get(int v){
        return get2(this.raiz, v);
    }
    private Noh get2(Noh raiz, int v){
        if (isEmpty()){
            return null;
        }else if (raiz.getValor() > v){
            return get2(raiz.esq, v);
        }else if(raiz.getValor() < v){
            return get2(raiz.dir, v);
        }
        return raiz;
    }

    public void imprimir(){
        imprimir2(this.raiz);
    }
    private void imprimir2(Noh aux) {
        PrintStream p = new PrintStream(System.out);
        if (aux != null) {
            imprimir2(aux.esq);
            p.print(aux.valor+" ");
            imprimir2(aux.dir);
        }
    }

    public Noh getRaiz() {
        return raiz;
    }
}
