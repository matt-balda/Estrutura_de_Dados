import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // framework para preencher aleatoriamente
        long limite = 1000; // 1mil de numeros
        long[] preenche = new long[(int) limite];// vetor auxiliar
        long[] preenche1 = new long[(int) limite];
        IVetor tdaVetor = new TDAVetor();// instancia do vetor
        IVetor tdaVetor1 = new TDAVetor();

        for (int i = 0; i < limite; i++) {
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(limite)));
        }
        for (int i = 0; i < limite; i++) {
            tdaVetor1.adiciona((int) (preenche1[i] = random.nextLong(limite)));
        }

        System.out.println("Desordenado 1: " + tdaVetor.imprime());
        System.out.println("Desordenado 2: " + tdaVetor1.imprime());
        System.out.println("Tamanho do vetor1: " + tdaVetor.getNumeros().length);
        System.out.println("Tamanho do vetor2: " + tdaVetor1.getNumeros().length);
        System.out.print("Valor buscado: ");
        int valor = sc.nextInt();
        System.out.println();
        System.out.println(">Busca Binaria Iterativa<");
        long tempoInicio = System.nanoTime();
        int valorBuscIte = tdaVetor.buscaBinariaIter(tdaVetor.getNumeros(), valor);
        long tempoFinal = System.nanoTime();
        System.out.println("Tempo em nanosegundo: " + (tempoFinal - tempoInicio));
        System.out.println("Indice do valor iterativo: " + valorBuscIte);
        System.out.println("-------------------------------------------------");
        System.out.println(">Busca Binaria Recursiva<");
        long tempoInicio1 = System.nanoTime();
        int valorBuscRecur = TDAVetor.busca(tdaVetor1.getNumeros(), valor);
        long tempoFinal1 = System.nanoTime();
        System.out.println("Tempo em nanosegundo: " + (tempoFinal1 - tempoInicio1));
        System.out.println("Indice do valor recursivo: " + valorBuscRecur);

    }
}