public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Mateus",19,8.5);
        Pessoa p2 = new Pessoa("Bruno",22,9.0);
        Pessoa p3 = new Pessoa("Julia",15,9.5);
        Vetor v = new Vetor();
        v.adiciona(p1);
        v.adiciona(p2);
        v.adiciona(p3);
        System.out.println(p1+"\n"+p2);
        System.out.println(v.tamanho());
        System.out.println(v.contem(p3));
    }
}
