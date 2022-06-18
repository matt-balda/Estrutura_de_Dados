import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int limite = 10;
        int preenche[] = new int[limite];
        IVetor vet1 = new TDAVetor();
        IVetor vet2 = new TDAVetor();

        for (int i = 0; i < preenche.length; i++) {
            vet1.adiciona(preenche[i] = random.nextInt(30));
            vet2.adiciona(preenche[i] = random.nextInt(30));
        }
        System.out.println("Vetor 1: " + vet1.imprime());
        System.out.println("Vetor 2: " + vet2.imprime());

        int[] result = Intersection.interseccaoDoisVetores(vet1.getNumeros(), vet2.getNumeros());

        System.out.print("Intersecção: ");
        for (int i = 0; i < vet1.tamanho(); i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + " ");
            }
        }
    }
}
