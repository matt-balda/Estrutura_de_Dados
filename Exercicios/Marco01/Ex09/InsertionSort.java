public class InsertionSort {
    public void ordenarInsertion(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && chave < v[j]) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }
    }
}
