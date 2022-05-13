public class Main {
    public static void main(String[] args) {
        /**
         Instanciação da lista genérica, aluno e declaração de variáveis
         */
        LSE lista = new LSE();
        int elemento1 = 100;
        double elemento2 = 95.5;
        Aluno a1 = new Aluno("Mateus", 18, 10);
        Aluno a2 = new Aluno("Gabriel", 22, 9);

        /**
         * Insere no inicio
         */
        lista.insereInicio(5);
        lista.insereInicio(30);
        lista.insereInicio(elemento1);
        lista.insereInicio(elemento2);
        /**
         * Insere no fim
         */
        lista.insereFim(a1);
        lista.insereFim(a2);
        /**
         * Remove um elemento
         */
        System.out.println("Removeu: " + lista.remove(elemento1));
        /**
         * Verifica se a lista está vazia
         */
        System.out.println("Lista vazia: " + lista.estahVazia());
        /**
         * Verifica o tamanho da lista
         */
        System.out.printf("Tamanho: " + lista.tamanho() + "\n\n");

        /**
         * Imprime lista
         */
        System.out.println(lista.imprime());
    }
}