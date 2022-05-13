public class Main {
    public static void main(String[] args) {
        /**
         Instanciação do lista genérica
         */
        ILista lista = new LSE();
        Aluno a1 = new Aluno("Mateus",18,10);
        int elemento1 = 100;
        double elemento2 = 95.5;
        lista.insereInicio(5);
        lista.insereFim(30);
        lista.insereFim(a1);
        lista.insereInicio(elemento1);
        lista.insereInicio(elemento2);
        lista.remove(elemento1);
        System.out.printf("Tamanho: "+lista.tamanho());


        /**
         * Método para verificar tamanho atual do vetor
         */

        /**
         * Método booleano para verificar se contém o objeto
         */

        /**
         * Método para remover um objeto do vetor
         */


        /**
         * Método para printar na tela, todos elementos do vetor
         */

    }
}