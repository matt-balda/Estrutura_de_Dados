public interface IVetor {
    public void adiciona(int numero);

    public boolean cheio();

    public void garanteEspaco();

    public boolean contem(int numero);

    public int tamanho();

    public boolean remove(int numero);

    public static int busca(int[] v, int valor) {
        return 0;
    }

    public static int buscaBinariaRecursiva(int[] v, int inicio, int fim, int valor) {
        return 0;
    }

    public int buscaBinariaIter(int[] v, int valor);

    public String imprime();

    public String imprimeOrdenado();

    public int[] getNumeros();
}