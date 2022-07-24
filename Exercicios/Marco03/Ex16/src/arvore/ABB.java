package arvore;

import fila.FilaVet;

import java.io.PrintStream;

/**
 * Esta classe serve de representacao de uma arvore binaria
 *
 * @Since 23/07/2022
 * @Author Mateus Balda
 */
public class ABB {
    private Noh raiz;
    private final PrintStream p = new PrintStream(System.out);
    private int size;

    public ABB() {
        this.raiz = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    /**
     * Este metodo serve para adicionar na arvore um elemento
     *
     * @param element para receber o valor do elemento
     */
    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
            this.size++;
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.getValor()) {
                    if (aux.getEsq() == null) {
                        Noh newNode = new Noh(element);
                        aux.setEsq(newNode);
                        newNode.setPai(aux);
                        this.size++;
                        return;
                    }
                    aux = aux.getEsq();
                } else {
                    if (aux.getDir() == null) {
                        Noh newNode = new Noh(element);
                        aux.setDir(newNode);
                        newNode.setPai(aux);
                        this.size++;
                        return;
                    }
                    aux = aux.getDir();
                }
            }
        }
    }

    /**
     * @param v passa como parametro o valor do elemento a ser procurado
     * @return o retorno e o objeto dessa procura
     */
    public Noh get(int v) {
        return get(this.raiz, v);
    }

    private Noh get(Noh node, int v) {
        if (node == null) return null;
        if (v == node.getValor()) return node;
        if (v < node.getValor())
            return get(node.getEsq(), v);
        else
            return get(node.getDir(), v);
    }

    public Noh getIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.getValor() == element) return aux;
            if (element < aux.getValor()) aux = aux.getEsq();
            if (element > aux.getValor()) aux = aux.getDir();
        }
        return null;
    }

    public void preOrdem() {
        preOrdem(getRaiz());
    }

    private void preOrdem(Noh node) {
        if (node != null) {
            p.print(node.getValor() + " ");
            preOrdem(node.getEsq());
            preOrdem(node.getDir());
        }
    }

    public void emOrdem() {
        emOrdem(getRaiz());
    }

    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.getEsq());
            p.print(node.getValor() + " ");
            emOrdem(node.getDir());
        }
    }

    public void posOrdem() {
        posOrdem(this.raiz);
    }

    private void posOrdem(Noh node) {
        if (node != null) {
            posOrdem(node.getEsq());
            posOrdem(node.getDir());
            p.print(node.getValor() + " ");
        }
    }

    public void imprimeLargura() { //algoritmo BFS
        FilaVet f = new FilaVet(100);
        if (!isEmpty()) {
            f.add(this.raiz);
            while (!f.isEmpty()) {
                Noh atual = f.remove();
                p.print(atual.getValor()+" ");
                if (atual.getEsq() != null)
                    f.add(atual.getEsq());
                if (atual.getDir() != null)
                    f.add(atual.getDir());
            }
        }
    }

    private Noh min(Noh node) {
        if (node.getEsq() == null) return node;
        else return min(node.getEsq());
    }

    public Noh sucessor(Noh node) {
        if (node == null) return null;

        if (node.getDir() != null)
            return min(node.getDir());
        else {
            Noh aux = node.getPai();

            while (aux != null && aux.getValor() < node.getValor())
                aux = aux.getPai();

            return aux;
        }
    }

    public void remove(int valor) {
        Noh remover = get(valor);
        if (remover != null) {
            remove(remover);
            this.size--;
        }

    }


    private void remove(Noh remover) {

        // Primeiro caso
        if (remover.ehFolha()) {
            if (remover == this.raiz)
                this.raiz = null;
            else {
                if (remover.getValor() < remover.getPai().getValor())
                    remover.getPai().setEsq(null);
                else
                    remover.getPai().setDir(null);
            }

            // Segundo caso
        } else if (remover.unicoFilhoAEsquerda()) {
            if (remover == this.raiz)  {
                this.raiz = remover.getEsq();
                this.raiz.setPai(null);
            } else {
                remover.getEsq().setPai(remover.getPai());
                if (remover.getValor() < remover.getPai().getValor())
                    remover.getPai().setEsq(remover.getEsq());
                else
                    remover.getPai().setDir(remover.getEsq());
            }
        } else if (remover.unicoFilhoADireita()) {
            if (remover == this.raiz) {
                this.raiz = remover.getDir();
                this.raiz.setPai(null);
            } else {
                remover.getDir().setPai(remover.getPai());
                if (remover.getValor() < remover.getPai().getValor())
                    remover.getPai().setEsq(remover.getDir());
                else
                    remover.getPai().setPai(remover.getDir());
            }

            // Terceiro caso
        } else {
            Noh sucessor = sucessor(remover);
            remover.setValor(sucessor.getValor());
            remove(sucessor);
        }

    }

    public Noh getRaiz() {
        return raiz;
    }

    public int getSize() {
        return size;
    }
}
