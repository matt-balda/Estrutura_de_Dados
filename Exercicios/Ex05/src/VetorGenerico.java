public class VetorGenerico{
    private Object[] elementos = new Object[3];
    private int totalElementos = 0;

    public void adiciona(Object o) {
        this.garanteEspaco();
        this.elementos[this.totalElementos] = o;
        this.totalElementos++;
    }

    public boolean cheio() {
        if (totalElementos == this.elementos.length) {
            return true;
        }
        return false;
    }

    public void garanteEspaco() {
        if (this.cheio()) {
            Object[] novoObject = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novoObject[i] = this.elementos[i];
            }
            this.elementos = novoObject;
        }
    }

    public boolean contem(Object o) {
        for (int i = 0; i < this.totalElementos; i++) {
            if (o.equals(this.elementos[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalElementos;
    }

    public boolean remove(Object o) {
        int indice = -1;
        for (int i = 0; i < totalElementos; i++) //faz a busca
            if (o.equals(this.elementos[i])) {
                indice = i;
                break;
            }
        if (indice != -1) { //achou o elemento
            for (int i = indice; i < (totalElementos - 1); i++) {
                elementos[i] = elementos[i + 1];
            }
            totalElementos--;
            return true;
        }
        return false;
    }

    public int getTotalAlunos() {
        return totalElementos;
    }

    public String imprime() {
        int i;
        final StringBuilder stringBuilder = new StringBuilder();
        for (i = 0; i<elementos.length; i++) {
            if (this.elementos[i] == null) {
                return "Lista vazia!";
            } else {
                for (i = 0; i < totalElementos; i++) {
                    stringBuilder.append("Elemento " + (i + 1) + ": ");
                    stringBuilder.append(elementos[i]);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}


