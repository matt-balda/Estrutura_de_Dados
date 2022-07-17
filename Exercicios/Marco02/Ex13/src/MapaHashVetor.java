public class MapaHashVetor {
    private Aluno[] vetor;
    private int size;

    public MapaHashVetor(int size) {
        this.vetor = new Aluno[size];
        this.size = 0;
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        resizeAndRehash();
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                this.size++;
                return;
            }
            sondagem++;
        }
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash(chave)] = null;
        this.size--;
        return aluno;
    }

    private boolean isFull() {
        return size == vetor.length;
    }

    private boolean isEmpty() {
        return vetor.length == 0;
    }

    public int size() {
        return this.size;
    }

    public String print() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (Aluno aluno : vetor) {
            if (aluno != null) {
                stringBuilder.append(aluno).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    private void resizeAndRehash() {
        if (isFull()) {
            Aluno[] novoVetor = new Aluno[vetor.length * 2];
            this.size = 0;

            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = null;
            }

            for (int i = 0; i < novoVetor.length; i++) {
                if (novoVetor[i] != null) {
                    Aluno obj = novoVetor[i];
                    put(obj.getMatricula(), obj);
                }
            }
            this.vetor = novoVetor;
        }
    }

}
