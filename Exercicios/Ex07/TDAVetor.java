public class TDAVetor implements IVetor {
    private int[] numeros = new int[10];
    private int totalnumeros = 0;

    public void adiciona(int numero) {
        this.garanteEspaco();
        this.numeros[this.totalnumeros] = numero;
        this.totalnumeros++;
    }

    public boolean cheio() {
        if (totalnumeros == this.numeros.length) {
            return true;
        }
        return false;
    }

    public void garanteEspaco() {
        if (this.cheio()) {
            int[] novonumeros = new int[this.numeros.length * 2];
            for (int i = 0; i < this.numeros.length; i++) {
                novonumeros[i] = this.numeros[i];
            }
            this.numeros = novonumeros;
        }
    }

    public boolean contem(int numero) {
        for (int i = 0; i < this.totalnumeros; i++) {
            if (numero == this.numeros[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalnumeros;
    }

    public boolean remove(int numero) {
        int indice = -1;
        for (int i = 0; i < totalnumeros; i++) //faz a busca
            if (numero == this.numeros[i]) {
                indice = i;
                break;
            }
        if (indice != -1) { //achou o elemento
            for (int i = indice; i < (totalnumeros - 1); i++) {
                numeros[i] = numeros[i + 1];
            }
            totalnumeros--;
            return true;
        }
        return false;
    }

    public static int maiorRecursivo(int[] v, int i, int f) {
        if (i == f) {
            return v[i];
        } else {
            int meio = (i + f) / 2;
            int max1 = maiorRecursivo(v, i, meio);
            int max2 = maiorRecursivo(v, meio + 1, f);
            if (max1 > max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }
    public static int menorRecursivo(int[] v, int i, int f){
        if (i == f) {
            return v[i];
        } else {
            int meio = (i + f) / 2;
            int max1 = menorRecursivo(v, i, meio);
            int max2 = menorRecursivo(v, meio + 1, f);
            if (max1 < max2) {
                return max1;
            } else {
                return max2;
            }
        }
    }
    public int maiorIterativo(){
        int maior = 0;
        for (int i = 0; i < this.numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public String imprime() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) { // garante que a impressao dos elementos do vetor, nao sejam nulos
                stringBuilder.append(numeros[i]);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Metodo para acessar o vetor da TDAVetor
     * @return vetor numeros
     */
    public int[] getNumeros() {
        return numeros;
    }
}