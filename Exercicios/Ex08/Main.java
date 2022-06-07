import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random(); // framework para preencher aleatoriamente
        long limite = 100; // 1mil de numeros
        long[] preenche = new long[(int) limite];// vetor auxiliar
        TDAVetor tdaVetor = new TDAVetor();// instancia do vetor

        for (int i = 0; i<limite; i++){
            tdaVetor.adiciona((int) (preenche[i] = random.nextLong(100)));
        }

        long inicial = System.currentTimeMillis();

        long tempoFinal = System.currentTimeMillis();
        System.out.printf(tdaVetor.imprime());

        //System.out.println(tdaVetor.imprime());
    }
}