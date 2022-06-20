import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ILista lse = new LSE();
        Random random = new Random();
        int limite = 20;
        int[] preenche = new int[limite];

        for (int i = 0; i < preenche.length; i++) {
            lse.insereInicio(preenche[i] = random.nextInt(limite));
        }
        System.out.println(lse.imprime());
        lse.imprime_rec1();
    }
}