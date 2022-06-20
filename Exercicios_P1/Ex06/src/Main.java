import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ILista lde = new LDE();
        Random random = new Random();
        int limite = 10;
        int[] preenche = new int[limite];

        for (int i = 0; i < preenche.length; i++) {
            lde.insereInicio(preenche[i] = random.nextInt(limite));
        }

        lde.add_ordenado(50);
        lde.add_ordenado(25);
        lde.add_ordenado(28);
        System.out.println(lde.imprime());
    }
}