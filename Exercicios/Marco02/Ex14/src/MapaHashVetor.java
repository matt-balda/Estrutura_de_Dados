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

    // metodo para fazer o hash, atraves da multiplicacao
//    private int hashMultiplicacao(int chave) {
//        double a = 0.617648934;
//        double hash = chave*a;
//        hash = (hash % 1) * this.vetor.length;
//        return (int)hash;
//    }

    public Aluno get(int chave) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            while (vetor[hash] == null) {
                hash = (hash(chave) + sondagem) % vetor.length;
                sondagem++;
                if (sondagem == vetor.length) {
                    sondagem = 0;
                }
            }
            if (vetor[hash].getMatricula() == chave) {
                return vetor[hash];
            }
            sondagem++;
            if (hash == 0) {
                sondagem--;
            }
        }
        return null;
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        resize();
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
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;

            if (vetor[hash] != null && vetor[hash].getMatricula() == chave) {
                Aluno aluno = vetor[hash];
                vetor[hash] = null;
                this.size--;
                return aluno;
            }
            sondagem++;
        }
        return null;
    }

    private boolean isFull() {
        return size == vetor.length;
    }

    private boolean isEmpty(){
        return vetor.length == 0;
    }

    public int size() {
        return this.size;
    }

    private void fill(Aluno[] aux) {
        for (int i = 0; i < aux.length; i++) {
            aux[i] = null;
        }
    }

    private void resize() {
        if (isFull()) {
            Aluno[] novoVetor = new Aluno[this.vetor.length * 2];
            this.size = 0;

            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }
            fill(vetor);
            rehash(novoVetor);
            this.vetor = novoVetor;
        }
    }

    private void rehash(Aluno[] rehash) {
        for (int i = 0; i < rehash.length; i++) {
            if (rehash[i] != null) {
                Aluno obj = rehash[i];
                put(obj.getMatricula(), obj);
            }
        }
    }

    public String print() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                stringBuilder.append(vetor[i]).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
