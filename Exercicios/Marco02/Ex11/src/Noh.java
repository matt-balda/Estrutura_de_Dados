public class Noh {
    private Aluno info;
    private Noh prox;

    public Noh(Aluno info) {
        this.info = info;
        this.prox = null;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public Noh getProx() {
        return prox;
    }

    public void setProx(Noh prox) {
        this.prox = prox;
    }
}
