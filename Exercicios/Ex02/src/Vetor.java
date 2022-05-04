public class Vetor {
    private Pessoa[] pessoas = new Pessoa[5];
    private int contPessoas = 0;

    public void adiciona(Pessoa pessoa){
        this.pessoas[this.contPessoas] = pessoa;
        this.contPessoas++;
    }
    public int tamanho(){
        return this.contPessoas;
    }
    public boolean contem(Pessoa pessoa){
            for (int i = 0; i < this.contPessoas; i++){
                if (pessoa.equals(this.pessoas[i])){
                    return true;
                }
            }
            return false;
    }
}
