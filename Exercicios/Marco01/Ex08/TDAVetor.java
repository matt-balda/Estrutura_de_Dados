public class TDAVetor implements IVetor{
    private int[] numeros = new int[10];
    private int totalnumeros = 0;
    private static int num;

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
            num = 0;
            num++; // adicionado um incrementador para quando estiver cheio o vetor, ir incrementando de 1, solucionando com sucesso a busca binaria
            int[] novonumeros = new int[this.numeros.length + num];
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

    public static int busca(int[] v, int valor) {
        return buscaBinariaRecursiva(v, 0, v.length - 1, valor);
    }

    public static int buscaBinariaRecursiva(int[] v, int inicio, int fim, int valor) {
        BubbleSort.ordenar(v);
        int media = (fim + inicio) / 2;
        int valorMeio = v[media];

        if (inicio > fim)
            return -1;
        else if (valorMeio == valor)
            return media;
        else if (valorMeio < valor)
            return buscaBinariaRecursiva(v, media + 1, fim, valor);
        else
            return buscaBinariaRecursiva(v, inicio, media - 1, valor);
    }

    public int buscaBinariaIter(int[] v, int valor) {
        BubbleSort.ordenar(v);
        int inicio = 0;
        int fim = v.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (v[meio] == valor) {
                return meio;
            } else if (v[meio] > valor) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public String imprime() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) { // garante que a impressao dos elementos do vetor, nao sejam nulos
                stringBuilder.append(numeros[i] + " ");
            }
        }
        return stringBuilder.toString();
    }

    public String imprimeOrdenado() {
        StringBuilder stringBuilder = new StringBuilder();
        BubbleSort.ordenar(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) { // garante que a impressao dos elementos do vetor, nao sejam nulos
                stringBuilder.append(numeros[i] + " ");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Metodo para acessar o vetor da TDAVetor
     *
     * @return vetor numeros
     */
    public int[] getNumeros() {
        return numeros;
    }
}