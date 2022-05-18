public class Main {
    public static void main(String[] args) {
        /**
         Instanciação da lista duplamente encadeada genérica, aluno e declaração de variáveis
         */
        LDE lista = new LDE();
        int elemento1 = 100;
        int elemento2 = 95;
        int elemento3 = 23;
        Aluno a1 = new Aluno("Mateus", 18, 10);
        Aluno a2 = new Aluno("Gabriel", 22, 9);

        /**
         * Insere no inicio
         */
        lista.insereInicio(5);
        lista.insereInicio(30);
        lista.insereInicio(elemento1);
        lista.insereInicio(a1);
        lista.insereInicio(a2);
        lista.insereInicio(elemento3);
        /**
         * Insere no fim
         */
        lista.insereFim(15);
        lista.insereFim(elemento2);
        /**
         * Remove um elemento
         */
        System.out.println("Removeu: " + lista.remove(elemento2));
        /**
         * Verifica se a lista está vazia
         */
        System.out.println("Lista vazia: " + lista.estahVazia());
        System.out.println("Lista inversa vazia: "+lista.estahVaziaInverso());
        /**
         * Verifica o tamanho da lista
         */
        System.out.printf("Tamanho: " + lista.tamanho() + "\n\n");

        /**
         * Imprime lista
         */
        System.out.println(lista.imprime());
        System.out.printf(lista.imprimeInverso());;
        /**
         * Busca um elemento em especifico
         */
        System.out.printf("Buscou: "+lista.busca(a1));
    }
}