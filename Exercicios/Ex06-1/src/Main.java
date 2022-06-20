public class Main {
    public static void main(String[] args) {
        /**
         Instanciação da lista duplamente encadeada inteiros e declaração de variáveis
         */
        ILista lista = new LDE();
        int elemento1 = 100;
        int elemento2 = 95;
        int elemento3 = 23;

        /**
         * Insere no inicio
         */
        lista.insereInicio(5);
        lista.insereInicio(30);
        lista.insereInicio(elemento1);

        /**
         * Insere no fim
         */
        lista.insereFim(elemento3);
        lista.insereFim(elemento2);
        /**
         * Remove um elemento
         */
        System.out.println("Removeu: " + lista.remove(elemento2));
        /**
         * Verifica se a lista está vazia
         */
        System.out.println("Lista vazia: " + lista.estahVazia());
        System.out.println("Lista inversa vazia: " + lista.estahVaziaInverso());
        /**
         * Verifica o tamanho da lista
         */
        System.out.print("Tamanho: " + lista.tamanho() + "\n\n");

        /**
         * Imprime lista
         */
        System.out.println(lista.imprime());
        System.out.println(lista.imprimeInverso());

        /**
         * Busca um elemento em especifico
         */
        System.out.print("Buscou: " + lista.busca(elemento2));
    }
}