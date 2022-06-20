public class Main {
    public static void main(String[] args) {
        ILista lde = new LDE();
        ILista lde1 = new LDE();
        lde.insereInicio(30);
        lde.insereInicio(45);
        lde.insereInicio(57);
        lde.insereInicio(58);
        lde1.insereInicio(69);
        lde1.insereInicio(54);
        lde1.insereInicio(88);


        Main.concatena(lde.getInicio(), lde1.getInicio());
        lde.ordenarLDE();
        System.out.println(lde.imprime());
    }

    public static Noh concatena(Noh l1, Noh l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            Noh aux = l1;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }

            aux.setProximo(l2);
            l2.setAnt(aux);
            return l1;
        }
    }
}