public class Main {
    public static void main(String[] args) {
        IFila iFila = new FilaLista();
        Aluno a1 = new Aluno("Mateus", 38, 6.5);
        Aluno a2 = new Aluno("Bruno1", 58, 9.0);
        Aluno a3 = new Aluno("Bruno2", 59, 9.0);
        Aluno a4 = new Aluno("Bruno3", 45, 9.3);
        Aluno a5 = new Aluno("Bruno4", 37, 9.1);
        iFila.add(a1);
        iFila.add(a2);
        iFila.add(a3);
        iFila.add(a4);
        iFila.add(a5);
        System.out.println(iFila.isEmpty());
        System.out.println(iFila.remove(a1));
        System.out.println(iFila.size());
        System.out.println(iFila.imprime());
    }
}
