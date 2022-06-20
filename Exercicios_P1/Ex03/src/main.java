import java.util.Random;

public class main {
    public static void main(String[] args) {
        TDAVetor vetor = new TDAVetor();
        for (int i = 0; i < 50; i++) {
            System.out.println("(" + i + "): " + Fibonacci.fibo(i, vetor.getNumeros()) + " ");
        }
        
        int n = 12;
        System.out.println(Fibonacci.fibo(n, vetor.getNumeros()));
    }
}
