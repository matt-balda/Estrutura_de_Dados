public class SelectionSort {
    public void selectionSort (int[] valor) {
        int fim = valor.length-1;
        for (int i = fim; i >= 0 ; i--) {
            int maior = this.posMaior(i, valor);
            if (maior != i)
                this.troca (i, maior, valor);
        }
    }
    /* Métodos auxiliares: */
    private int posMaior (int fim, int[] valor) {
        int maior = fim;
        for (int i = fim-1; i >= 0; i--)
            if (valor[i] > valor[maior])
                maior = i;
        return maior;
    }
    private void troca (int a, int b, int[] valor) {
        int aux;
        aux = valor[a];
        valor[a] = valor[b];
        valor[b] = aux;
    }
}
