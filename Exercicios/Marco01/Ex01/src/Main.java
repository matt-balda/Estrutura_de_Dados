import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("\n====PROGRAMA PARA CALCULAR A DISTÂNCIA " +
                            "ENTRE DOIS PONTOS CARTESIANOS====\n");

        System.out.print("Informe X, do primeiro cartesiano: ");
        x = sc.nextInt();
        System.out.print("Informe Y:");
        y = sc.nextInt();

        PontoCartesiano primeiroCartesiano = new PontoCartesiano(x,y);

        System.out.print("Informe X, do segundo cartesiano: ");
        x = sc.nextInt();
        System.out.print("Informe Y: ");
        y = sc.nextInt();

        PontoCartesiano segundoCartesiano = new PontoCartesiano(x,y);

        System.out.printf("A DISTÂNCIA ENTRE OS " +
                "PONTOS CARTESIANO É IGUAL À: %.2f%n",primeiroCartesiano.calcularDistancia(segundoCartesiano));

    }
}
