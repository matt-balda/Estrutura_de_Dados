public class Main {
    public static void main(String[] args) {
        /**
         Instanciação do vetor genérico
         */
        IVetor vet = new VetorGenerico();
        int elemento1 = 100;
        double elemento2 = 95.5;
        vet.adiciona(30);
        vet.adiciona(5.5);
        vet.adiciona(elemento1);
        vet.adiciona(elemento2);
        Aluno a1 = new Aluno("Mateus",18,10);
        vet.adiciona(a1);

        System.out.println(vet.imprime());

        /**
         * Método para verificar tamanho atual do vetor
         */
        System.out.println(vet.tamanho());
        /**
         * Método booleano para verificar se contém o objeto
         */
        System.out.println(vet.contem(a1));
        /**
         * Método para remover um objeto do vetor
         */
        System.out.println(vet.remove(a1));
        System.out.println(vet.remove(elemento1));
        System.out.println(vet.remove(elemento2));
        System.out.println(vet.tamanho());

        /**
         * Método para printar na tela, todos elementos do vetor
         */
        System.out.println(vet.imprime());
    }
}