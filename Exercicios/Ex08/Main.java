import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // framework para preencher aleatoriamente
        long limite = 1000; // 1mil de numeros
        long[] preenche = new long[(int) limite];// vetor auxiliar
        IVetor tdaVetor = new TDAVetor();// instancia do vetor

        for (int i = 0; i < limite; i++) {
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(limite)));
        }

        System.out.println("Desordenado: " + tdaVetor.imprime());
        System.out.println("Ordenado: " + tdaVetor.imprimeOrdenado());
        System.out.println("Tamanho do vetor: " + tdaVetor.getNumeros().length);
        System.out.print("Valor buscado: ");
        int valor = sc.nextInt();
        System.out.println();
        System.out.println(">Busca Binaria Iterativa<");
        long tempoInicio = System.currentTimeMillis();
        int valorBuscIte = tdaVetor.buscaBinariaIter(tdaVetor.getNumeros(), valor);
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo em milesegundos: " + (tempoFinal - tempoInicio));
        System.out.println("Indice do valor iterativo: " + valorBuscIte);
        System.out.println("-------------------------------------------------");
        System.out.println(">Busca Binaria Recursiva<");
        long tempoInicio1 = System.currentTimeMillis();
        int valorBuscRecur = TDAVetor.busca(tdaVetor.getNumeros(), valor);
        long tempoFinal1 = System.currentTimeMillis();
        System.out.println("Tempo em milesegundos: " + (tempoFinal1 - tempoInicio1));
        System.out.println("Indice do valor recursivo: " + valorBuscRecur);

    }
}