public class Fibonacci {
    private static int k;

    public static long fibo(int n, int[] vet) {
        k = 1; // inicializa k
        return recursao(n, vet);
    }

    private static long recursao(int n, int[] vet) {
         if (n < 0) {
            return vet[0];
        } else {
            if (k < 3) {
                vet[n] = k - 1;
                k++;
            } else {
                vet[n] = vet[n + 1] + vet[n + 2];
            }
            return recursao(n - 1, vet);
        }
    }

}
