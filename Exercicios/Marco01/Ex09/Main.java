import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // framework para preencher aleatoriamente
        BubbleSort bs = new BubbleSort(); // instanciacao do bubblesort
        SelectionSort ss = new SelectionSort(); // instanciacao do selectionsort
        InsertionSort is = new InsertionSort(); // instanciacao do insertionsort

        long limite = 10; // 10 de numeros
        long limite1 = 100; // 100 de numeros
        long limite2 = 1000; // 1000 de numeros
        long limite3 = 10000; // 10000 de numreos

        long[] preenche = new long[(int) limite];// vetor auxiliar
        long[] preenche1 = new long[(int) limite1];
        long[] preenche2 = new long[(int) limite2];
        long[] preenche3 = new long[(int) limite3];
        long[] preenche4 = new long[(int) limite3];
        long[] preenche5 = new long[(int) limite3];
        long[] preenche6 = new long[(int) limite3];
        long[] preenche7 = new long[(int) limite3];
        long[] preenche8 = new long[(int) limite3];
        long[] preenche9 = new long[(int) limite3];
        long[] preenche10 = new long[(int) limite3];
        long[] preenche11 = new long[(int) limite3];



        TDAVetor tdaVetor = new TDAVetor();// instancia do vetor
        TDAVetor tdaVetor1 = new TDAVetor(); // instancia do vetor 2
        TDAVetor tdaVetor2 = new TDAVetor(); // instancia do vetor 3
        TDAVetor tdaVetor3 = new TDAVetor(); // instancia do vetor 4
        TDAVetor tdaVetor4 = new TDAVetor();
        TDAVetor tdaVetor5 = new TDAVetor();
        TDAVetor tdaVetor6 = new TDAVetor();
        TDAVetor tdaVetor7 = new TDAVetor();
        TDAVetor tdaVetor8 = new TDAVetor();
        TDAVetor tdaVetor9 = new TDAVetor();
        TDAVetor tdaVetor10 = new TDAVetor();
        TDAVetor tdaVetor11 = new TDAVetor();

        for (int i = 0; i < limite; i++) {
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(limite)));
            tdaVetor4.adiciona((int) (preenche4[i] = random.nextLong(limite)));
            tdaVetor8.adiciona((int) (preenche8[i] = random.nextLong(limite)));
        }
        for (int i = 0; i < limite1; i++) {
            tdaVetor1.adiciona((int) (preenche1[i] = random.nextLong(limite1)));
            tdaVetor5.adiciona((int) (preenche5[i] = random.nextLong(limite1)));
            tdaVetor9.adiciona((int) (preenche9[i] = random.nextLong(limite1)));
        }
        for (int i = 0; i < limite2; i++) {
            tdaVetor2.adiciona((int) (preenche2[i] = random.nextLong(limite2)));
            tdaVetor6.adiciona((int) (preenche6[i] = random.nextLong(limite2)));
            tdaVetor10.adiciona((int) (preenche10[i] = random.nextLong(limite2)));
        }
        for (int i = 0; i < limite3; i++) {
            tdaVetor3.adiciona((int) (preenche3[i] = random.nextLong(limite3)));
            tdaVetor7.adiciona((int) (preenche7[i] = random.nextLong(limite3)));
            tdaVetor11.adiciona((int) (preenche11[i] = random.nextLong(limite3)));
        }
        System.out.println("--------------------------------");
        System.out.println(">BUBBLE SORT<");
        long tempoInicio = System.nanoTime();
        bs.ordenarBubble(tdaVetor.getNumeros());
        long tempoFinal = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10 numeros]: "+(tempoFinal-tempoInicio));
        System.out.println("Tamanho do vetor: "+tdaVetor.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor.imprime());

        long tempoInicio1 = System.nanoTime();
        bs.ordenarBubble(tdaVetor1.getNumeros());
        long tempoFinal1 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [100 numeros]: "+ (tempoFinal1-tempoInicio1));
        System.out.println("Tamanho do vetor: "+tdaVetor1.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor1.imprime());

        long tempoInicio2 = System.nanoTime();
        bs.ordenarBubble(tdaVetor2.getNumeros());
        long tempoFinal2 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [1000 numeros]: "+ (tempoFinal2-tempoInicio2));
        System.out.println("Tamanho do vetor: "+tdaVetor2.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor2.imprime());

        long tempoInicio3 = System.nanoTime();
        bs.ordenarBubble(tdaVetor3.getNumeros());
        long tempoFinal3 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10000 numeros]: "+ (tempoFinal3-tempoInicio3));
        System.out.println("Tamanho do vetor: "+tdaVetor3.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor3.imprime());

        System.out.println("--------------------------------");
        System.out.println(">SELECTION SORT<");
        long tempoInicio4 = System.nanoTime();
        ss.ordenarSelection(tdaVetor4.getNumeros());
        long tempoFinal4 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10 numeros]: "+ (tempoFinal4-tempoInicio4));
        System.out.println("Tamanho do vetor: "+tdaVetor4.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor4.imprime());

        long tempoInicio5 = System.nanoTime();
        ss.ordenarSelection(tdaVetor5.getNumeros());
        long tempoFinal5 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [100 numeros]: "+ (tempoFinal5-tempoInicio5));
        System.out.println("Tamanho do vetor: "+tdaVetor5.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor5.imprime());

        long tempoInicio6 = System.nanoTime();
        ss.ordenarSelection(tdaVetor6.getNumeros());
        long tempoFinal6 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [1000 numeros]: "+ (tempoFinal6-tempoInicio6));
        System.out.println("Tamanho do vetor: "+tdaVetor6.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor6.imprime());

        long tempoInicio7 = System.nanoTime();
        ss.ordenarSelection(tdaVetor7.getNumeros());
        long tempoFinal7 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10000 numeros]: "+ (tempoFinal7-tempoInicio7));
        System.out.println("Tamanho do vetor: "+tdaVetor7.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor7.imprime());

        System.out.println("---------------------------------");
        System.out.println(">INSERTION SORT");
        long tempoInicio8 = System.nanoTime();
        is.ordenarInsertion(tdaVetor8.getNumeros());
        long tempoFinal8 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10 numeros]: "+ (tempoFinal8-tempoInicio8));
        System.out.println("Tamanho do vetor: "+tdaVetor8.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor8.imprime());

        long tempoInicio9 = System.nanoTime();
        is.ordenarInsertion(tdaVetor9.getNumeros());
        long tempoFinal9 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [100 numeros]: "+ (tempoFinal9-tempoInicio9));
        System.out.println("Tamanho do vetor: "+tdaVetor9.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor9.imprime());

        long tempoInicio10 = System.nanoTime();
        is.ordenarInsertion(tdaVetor10.getNumeros());
        long tempoFinal10 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [1000 numeros]: "+ (tempoFinal10-tempoInicio10));
        System.out.println("Tamanho do vetor: "+tdaVetor10.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor10.imprime());

        long tempoInicio11 = System.nanoTime();
        is.ordenarInsertion(tdaVetor11.getNumeros());
        long tempoFinal11 = System.nanoTime();
        System.out.println("Tempo em nanosegundos - [10000 numeros]: "+ (tempoFinal11-tempoInicio11));
        System.out.println("Tamanho do vetor: "+tdaVetor11.getNumeros().length);
        System.out.println("Vetor: "+tdaVetor11.imprime());
    }
}