import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // framework para preencher aleatoriamente
        long limite = 1000; // 1000 numeros
        long[] preenche = new long[(int) limite];// vetor auxiliar
        IVetor tdaVetor = new TDAVetor();// instancia do vetor

        for (int i = 0; i<limite; i++){
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(limite)));
        }

        long inicial = System.nanoTime();
        int maior = TDAVetor.maiorRecursivo(tdaVetor.getNumeros(), 0,tdaVetor.tamanho()-1);
        long tempoFinal = System.nanoTime();

        System.out.println("Maior número recursivo: "+maior);
        int menor = TDAVetor.menorRecursivo(tdaVetor.getNumeros(), 0, tdaVetor.tamanho());
        System.out.println("Menor número recursivo: "+menor);
        System.out.println("Tamanho: "+tdaVetor.tamanho());
        System.out.println("Tempo em Nanosegundo: "+(tempoFinal-inicial));
        System.out.println("-------------------------------------------------------");
        long inicial1 = System.nanoTime();
        tdaVetor.maiorIterativo();
        long tempoFinal1 = System.nanoTime();
        System.out.println("Maior número iterativo: "+tdaVetor.maiorIterativo());
        System.out.println("Tamanho: "+tdaVetor.tamanho());
        System.out.println("Tempo em Nanosegundo: "+(tempoFinal1-inicial1));

        //System.out.println(tdaVetor.imprime());
    }
}