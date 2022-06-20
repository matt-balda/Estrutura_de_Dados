import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        TDAVetor vetor = new TDAVetor();
        SelectionSort selectionSort = new SelectionSort();
        int limite = 20;
        int[] preencher = new int[limite];
        for (int i = 0; i<preencher.length; i++){
            vetor.adiciona(preencher[i] = random.nextInt(limite));
        }
        System.out.println(vetor.imprime());
        selectionSort.selectionSort(vetor.getNumeros());
        System.out.println(vetor.imprime());
    }
}
