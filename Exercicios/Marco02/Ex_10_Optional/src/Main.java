import java.util.Scanner;

public class Main {
    private static final FilaVet filaVet = new FilaVet();
    public static void main(String[] args) {
        Main main = new Main();
        main.menuPrincipal();
    }
    public void menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("== Atendimento Bad-Boy-Student ==");
            System.out.println("1. Realizar Atendimento");
            System.out.println("2. Excluir Atendimento");
            System.out.println("3. Imprimir Atendimentos");
            System.out.println("4. Número de Atendimentos");
            System.out.println("0. Sair do programa");
            System.out.print("Sua opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> realizarAtendimento();
                case 2 -> excluirAtendimento();
                case 3 -> imprimirAtendimentos();
                case 4 -> numeroAtendimentos();
                case 0 -> System.exit(0);
            }
        }while (true);
    }
    public void realizarAtendimento(){
        Scanner sc = new Scanner(System.in);
        String nome, descricao;
        double nota;
        int idade, opStatus;
        Status status;
        System.out.print("Qual o nome: ");
        nome = sc.nextLine();
        System.out.print("Qual a idade: ");
        idade = sc.nextInt();
        System.out.print("Qual nota: ");
        nota = sc.nextDouble();

        Aluno a1 = new Aluno(nome,idade,nota);

        sc.nextLine();
        System.out.print("Qual a descricao do atendimento: ");
        descricao = sc.nextLine();
        System.out.print("Qual o status do atendimento [1]-Andamento, [2]-Concluido, [3]-Cancelado: ");
        opStatus = sc.nextInt();

        if (opStatus == 1){
            status = Status.ANDAMENTO;
        }else if(opStatus == 2){
            status = Status.CONCLUIDO;
        }else {
            status = Status.CANCELADO;
        }
        Atendimento atendimento = new Atendimento(a1, descricao, status);

        filaVet.add(atendimento);
        System.out.println(atendimento.toString());
    }
    public void excluirAtendimento(){
        filaVet.remove();
    }
    public void imprimirAtendimentos(){
        System.out.println(filaVet.imprime());
    }
    public void numeroAtendimentos(){
        System.out.println("Numero: "+filaVet.size());
    }
}
