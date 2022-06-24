public class Main {
    public static void main(String[] args) {
        IFila fvet = new FilaVet(10);

        //fvet.add("Mateus Balda");
        fvet.add(49);
        fvet.add("Balda");
        fvet.add(99);
        fvet.add(30);
        fvet.add(45);
        System.out.println(fvet.isEmpty());
        System.out.println(fvet.imprime());
        System.out.println(fvet.remove());
        System.out.println(fvet.remove());
        fvet.add(44);
        fvet.add(43);
        System.out.println(fvet.remove());
        System.out.println(fvet.size());
        System.out.println(fvet.imprime());
    }
}
