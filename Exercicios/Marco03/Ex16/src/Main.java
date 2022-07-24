import arvore.ABB;
import arvore.Noh;

public class Main {
    public static void main(String[] args) {
        // Instancia da arvore
        ABB abb = new ABB();

        // Insercao dos valores na arvore
        abb.add(52);
        abb.add(22);
        abb.add(85);
        abb.add(8);
        abb.add(43);
        abb.add(11);
        abb.add(26);
        abb.add(81);
        abb.add(96);
        abb.add(69);

        // Acesso ao Noh exato da arvore
        Noh aux = abb.get(52);
        System.out.println(aux.getValor());

        //Impressao da arvore, de forma ordenada
        abb.preOrdem();
        System.out.println();

        abb.emOrdem();
        System.out.println();

        //Impressao da arvore, em pos ordem
        abb.posOrdem();
        System.out.println();

        //Impressao da arvore, em largura por nivel
        abb.imprimeLargura();
        System.out.println();

        //Remover elementos da arvore
        abb.remove(52);
        abb.remove(69);
        abb.remove(8);
        abb.remove(11);
        abb.remove(22);
        abb.remove(26);
        abb.remove(43);
        abb.remove(81);
        abb.remove(85);

        abb.emOrdem();
        System.out.print("\nSize of tree: "+abb.getSize());
    }
}
