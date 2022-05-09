import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IVetor alunos = new VetorAlunos();
        /**
        Instanciação dos alunos, da classe Aluno
         */
        Aluno a1 = new Aluno("Mateus",20,10);
        Aluno a2 = new Aluno("Rafaela",25,9.5);
        Aluno a3 = new Aluno("Bruna",19,8.0);
        Aluno a4 = new Aluno("Agata",18,7.5);
        /**
         *  Adicionar os objetos instanciados, no vetorAlunos
         */
        alunos.adiciona(a1);
        alunos.adiciona(a2);
        alunos.adiciona(a3);
        alunos.adiciona(a4);
        /**
         * Método para verificar tamanho atual do vetor
         */
        System.out.println(alunos.tamanho());
        /**
         * Método booleano para verificar se contém o objeto
         */
        System.out.println(alunos.contem(a1));
        /**
         * Método para remover um objeto do vetor
         */
        System.out.println(alunos.remove(a3));
        System.out.println(alunos.tamanho());

        /**
         * Método para printar na tela, todos elementos do vetor
         */
        System.out.println(alunos.toString());
    }
}