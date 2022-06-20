import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número para somatória: ");
        int n = sc.nextInt();
        System.out.print("Resultado: "+Somatorio.somatorio(n));
    }
}
