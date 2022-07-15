public class MapaHashVetor {
    private Aluno[] vetor;
    private int contElem;

    public MapaHashVetor() {
        this.vetor = new Aluno[20];
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
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null ||
                    vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
        }
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash(chave)] = null;
        return aluno;
    }

    public boolean isFull() {
        if (contElem == vetor.length) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(){
        for (int i = 0; i< vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }

}
