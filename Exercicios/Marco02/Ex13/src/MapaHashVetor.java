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
        int hash = hash(chave);
            if (vetor[hash] == null) {
                this.vetor[hash] = valor;
                contElem++;
            } else {
                for (int i = 0; i<vetor.length; i++){
                    if (vetor[i] == valor){

                    }
                }
            }
        }
    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash(chave)] = null;
        return aluno;
    }

   public boolean isFull(){
        if (contElem == vetor.length){
            return true;
        }else {
            return false;
        }
   }

   public void procurarIndice(int hash){
        for (int i = 0; i<vetor.length;i++){
            if (vetor[hash] == null){

            }
        }
   }
}
