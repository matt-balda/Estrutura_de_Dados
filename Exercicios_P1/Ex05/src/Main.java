import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ILista lde = new LDE();
        int limite = 20;
        int[] preenche = new int[limite];

        for (int i = 0; i<preenche.length; i++){
            lde.insereInicio(preenche[i] = random.nextInt(limite));
        }

        System.out.println(lde.imprime());
        int result = lde.nroPares();
        System.out.println("Quantidades de Pares: "+result);
    }
}