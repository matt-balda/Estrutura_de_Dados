import Fila.FilaLista;
import Fila.NohFila;
import Model.Aluno;
import Pilha.PilhaLista;

public class Main {
    public static void main(String[] args) {
        FilaLista fila = new FilaLista();
        PilhaLista pilha = new PilhaLista();

        Aluno a1 = new Aluno("Pafuncia",59,9.9);
        Aluno a2 = new Aluno("Gilbertão",57,8.0);
        Aluno a3 = new Aluno("Robertão",15,6.0);
        Aluno a4 = new Aluno("Lirico",19,6.5);
        Aluno a5 = new Aluno("Liriel", 25, 7.5);
        Aluno a6 = new Aluno("Quezia", 28, 10.0);

        fila.add(a1);
        fila.add(a2);
        fila.add(a3);
        fila.add(a4);
        fila.add(a5);
        fila.add(a6);

        System.out.println("Estado da Fila Inicial:\n"+fila.imprime());

        for (NohFila i = fila.getInicio(); i!=null; i = i.getProx()){
            pilha.push(i.getInfo());

        }
        System.out.println("Estado da Pilha:\n"+pilha.imprimir());
        while (!pilha.isEmpty()) {
            fila.remove(a1);
            fila.add(pilha.pop());
            fila.remove(a2);
            fila.add(pilha.pop());
            fila.remove(a3);
            fila.add(pilha.pop());
            fila.remove(a4);
            fila.add(pilha.pop());
            fila.remove(a5);
            fila.add(pilha.pop());
            fila.remove(a6);
            fila.add(pilha.pop());
        }
        System.out.println("Fila invertida:\n"+fila.imprime());
    }
}
