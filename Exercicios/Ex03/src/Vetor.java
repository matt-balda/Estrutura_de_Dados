public class Vetor implements IVetor {
    private Pessoa[] pessoas = new Pessoa[3];
    private int contPessoas = 0;

    @Override
    public void adiciona(Pessoa pessoa){
        this.garanteEspaco();
        this.pessoas[this.contPessoas] = pessoa;
        this.contPessoas++;
    }

    @Override
    public int tamanaho() {
        return this.contPessoas;
    }

    @Override
    public boolean contem(Pessoa pessoa) {
        for (int i = 0; i < this.contPessoas; i++){
            if (pessoa.equals(this.pessoas[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean cheio() {
        if (contPessoas == this.pessoas.length){
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Pessoa pessoa) {
        int indice = -1;
        for (int i =0; i<contPessoas; i++){
            if (pessoa.equals(this.pessoas[i])){
                indice = i;
                break;
            }
        }
        if (indice != -1){
            for (int i = indice; i<(contPessoas-1); i++){
                pessoas[i] = pessoas[i+1];
                contPessoas--;
                return true;
            }
        }
        return false;
    }

    private void garanteEspaco(){
        if (this.cheio()){
            Pessoa[] novaPessoas = new Pessoa[this.pessoas.length * 2];
            for (int i = 0; i<this.pessoas.length; i++){
                novaPessoas[i] = this.pessoas[i];
                this.pessoas = novaPessoas;
            }
        }
    }
}
