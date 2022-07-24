package arvore;

public class Noh {
    private int valor;
    private Noh esq;
    private Noh dir;
    private Noh pai;

    Noh(int v) {
        this.valor = v;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Noh getEsq() {
        return esq;
    }

    public void setEsq(Noh esq) {
        this.esq = esq;
    }

    public Noh getDir() {
        return dir;
    }

    public void setDir(Noh dir) {
        this.dir = dir;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

    public boolean unicoFilhoAEsquerda() {
        return (this.esq != null && this.dir == null);
    }

    public boolean unicoFilhoADireita() {
        return (this.esq == null && this.dir != null);
    }

    public boolean ehFolha() {
        return this.esq == null && this.dir == null;
    }
}
