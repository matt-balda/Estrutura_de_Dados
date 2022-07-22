public class Main {
    public static void main(String[] args) {
        // Instancia da arvore
        ABB abb = new ABB();

        // Insercao dos valores na arvore
        abb.add(50);
        abb.add(40);
        abb.add(35);
        abb.add(2);
        abb.add(9);
        abb.add(5);
        abb.add(11);

        // Acesso ao Noh exato da arvore
        Noh aux = abb.get(50);
        System.out.println(aux.getValor());

        //Impressao da arvore, de forma ordenada
        abb.imprimir();
    }
}
