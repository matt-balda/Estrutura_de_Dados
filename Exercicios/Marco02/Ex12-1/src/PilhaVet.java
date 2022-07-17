public class PilhaVet implements IPilha {
    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) { //construtor
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean push(Object info) { //empilha
        if (this.numElem == pilha.length) {
            System.out.println("pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    public Object pop() { //desempilha
        Object o;
        if (this.isEmpty()) {
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public int size() {
        return numElem;
    }

    public boolean isEmpty() {
        if (pilha.length == 0) {
            return true;
        }
        return false;
    }

    public Object top() {
        return pilha[numElem];
    }

    public String imprimir() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] != null) {
                stringBuilder.append(pilha[i]);
            }
        }
        return stringBuilder.toString();
    }

    public boolean palindromo(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            push(palavra.charAt(i));
        }
        StringBuilder palavraInversa = new StringBuilder();
        System.out.print("Estado pilha: "+imprimir()+" - "); // mostra o estado da pilha no push, porque depois de efetuar o pop, a pilha fica vazia / null
        while (!isEmpty()) {
            palavraInversa.append(pop());
        }
        if (palavraInversa.toString().equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}
