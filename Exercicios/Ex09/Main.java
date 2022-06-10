import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // framework para preencher aleatoriamente
        BubbleSort bs = new BubbleSort();
        SelectionSort ss = new SelectionSort();
        InsertionSort is = new InsertionSort();
        long limite = 1000; // 10 de numeros
        long limite1 = 10000; // 100 de numeros
        long limite2 = 100000; // 1000 de numeros
        long limite3 = 1000000; // 10000 de numreos

        long[] preenche = new long[(int) limite];// vetor auxiliar
        long[] preenche1 = new long[(int) limite1];
        long[] preenche2 = new long[(int) limite2];
        long[] preenche3 = new long[(int) limite3];

        TDAVetor tdaVetor = new TDAVetor();// instancia do vetor
        TDAVetor tdaVetor1 = new TDAVetor(); // instancia do vetor 2
        TDAVetor tdaVetor2 = new TDAVetor();
        TDAVetor tdaVetor3 = new TDAVetor(); // instancia do vetor 3

        for (int i = 0; i < limite; i++) {
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(limite)));
        }
        for (int i = 0; i < limite1; i++) {
            tdaVetor1.adiciona((int) (preenche1[i] = random.nextLong(limite1)));
        }
        for (int i = 0; i < limite2; i++) {
            tdaVetor2.adiciona((int) (preenche2[i] = random.nextLong(limite2)));
        }
        for (int i = 0; i < limite2; i++) {
            tdaVetor3.adiciona((int) (preenche3[i] = random.nextLong(limite3)));
        }

        System.out.println("Bubble Sort");
        long tempoInicio = System.currentTimeMillis();
        bs.ordenar(tdaVetor.getNumeros());
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal-tempoInicio));
        long tempoInicio1 = System.currentTimeMillis();
        bs.ordenar(tdaVetor1.getNumeros());
        long tempoFinal1 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos : "+ (tempoFinal1-tempoInicio1));
        long tempoInicio2 = System.currentTimeMillis();
        bs.ordenar(tdaVetor2.getNumeros());
        long tempoFinal2 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal2-tempoInicio2));
        long tempoInicio3 = System.currentTimeMillis();
        bs.ordenar(tdaVetor3.getNumeros());
        long tempoFinal3 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal3-tempoInicio3));

        System.out.println("--------------------------------");
        System.out.println("Selecion sort");
        long tempoInicio4 = System.currentTimeMillis();
        ss.ordenarSelection(tdaVetor.getNumeros());
        long tempoFinal4 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal4-tempoInicio4));
        long tempoInicio5 = System.currentTimeMillis();
        ss.ordenarSelection(tdaVetor1.getNumeros());
        long tempoFinal5 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos : "+ (tempoFinal5-tempoInicio5));
        long tempoInicio6 = System.currentTimeMillis();
        ss.ordenarSelection(tdaVetor2.getNumeros());
        long tempoFinal6 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal6-tempoInicio6));
        long tempoInicio7 = System.currentTimeMillis();
        ss.ordenarSelection(tdaVetor3.getNumeros());
        long tempoFinal7 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal7-tempoInicio7));

        System.out.printf("Insertion sort");
        System.out.printf("---------------------------------");
        long tempoInicio8 = System.currentTimeMillis();
        is.ordenarInsertion(tdaVetor.getNumeros());
        long tempoFinal8 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal8-tempoInicio8));
        long tempoInicio9 = System.currentTimeMillis();
        is.ordenarInsertion(tdaVetor1.getNumeros());
        long tempoFinal9 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos : "+ (tempoFinal9-tempoInicio9));
        long tempoInicio10 = System.currentTimeMillis();
        is.ordenarInsertion(tdaVetor2.getNumeros());
        long tempoFinal10 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal10-tempoInicio10));
        long tempoInicio11 = System.currentTimeMillis();
        is.ordenarInsertion(tdaVetor3.getNumeros());
        long tempoFinal11 = System.currentTimeMillis();
        System.out.println("Tempo em milesgundos: "+ (tempoFinal11-tempoInicio11));
    }
}