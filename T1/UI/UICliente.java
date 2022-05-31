package UI;

import Entidades.Cliente;
import Listas.LDEClientes;
import Listas.LDELocacoes;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UICliente {
    private Cliente c;

    public UICliente() {

    }

    public void menuGerenciarClientes() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println(":: GENRENCIAR CLIENTES ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar");
            System.out.println("6 - Listar reverso");
            System.out.println("0 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    listar();
                    break;
                case 6:
                    listarReverso();
                    break;
                case 0:
                    UILocadora.menuPrincipal();
                    break;
                default:
                    System.err.println("ERRO, Opção inválida!");
            }
        } while (op != 0);
    }
        public void adicionar() {
            Scanner sc = new Scanner(System.in);
            String cpf, nome;
            long telefone, cnh;

            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("CPF: ");
            cpf = sc.nextLine();
            System.out.print("CNH: ");
            cnh = sc.nextLong();
            System.out.print("Telefone: ");
            telefone = sc.nextLong();

            Cliente c1 = new Cliente(nome, cpf, cnh, telefone);
            LDEClientes.INSTANCE.insereClienteFim(c1);

            System.out.println("Cliente cadastrado com sucesso.");
        }
        public void consultar () {
            Scanner sc = new Scanner(System.in);
            String cpf;
            System.out.print("Digite o cpf do cliente: ");
            cpf = sc.nextLine();
            if(LDEClientes.INSTANCE.existeCliente(cpf)) {
                System.out.println(LDEClientes.INSTANCE.buscaCpf(cpf));
            }
            else{
                System.err.println("Cliente não encontrado!");
            }
        }
        public void alterar () {
            Scanner sc = new Scanner(System.in);
            String nome, cpf;
            long cnh, telefone;
            System.out.print("Digite o cpf do cliente a ser consultado: ");
            cpf = sc.nextLine();
            c = LDEClientes.INSTANCE.buscaCpfObj(cpf);

            if (!LDEClientes.INSTANCE.existeCliente(cpf)) {
                System.err.println("\nO cliente não foi encontrado!");
            } else {
                System.out.println("Cliente encontrado:\n CPF: " + c.getCpf() + " Nome: " + c.getNome());

                System.out.print("CPF: ");
                cpf = sc.nextLine();
                c.setCpf(cpf);
                System.out.print("Nome: ");
                nome = sc.nextLine();
                c.setNome(nome);
                System.out.print("CNH: ");
                cnh = sc.nextLong();
                c.setCnh(cnh);
                System.out.print("Telefone: ");
                telefone = sc.nextLong();
                c.setTelefone(telefone);
            }
            System.out.println("Cliente alterado com sucesso: " + c.toString());
        }
        public void excluir () {
            Scanner sc = new Scanner(System.in);
            String cpf;

            System.out.print("Digite o cpf do cliente: ");
            cpf = sc.nextLine();
            c = LDEClientes.INSTANCE.buscaCpfObj(cpf);

            if (!LDEClientes.INSTANCE.existeCliente(cpf)) {
                System.err.println("\nCliente não encontrado.");
            } else {
                System.out.println(c.toString());
                if (LDELocacoes.INSTANCE.existeCliente(cpf)){
                    System.out.println("Cliente não pode ser removido!");
                }else {
                    LDEClientes.INSTANCE.removeCliente(c);
                    System.out.println("Cliente removido com sucesso.");
                }
            }
        }
        public void listarReverso () {
            LDEClientes.INSTANCE.imprimeFim();
        }
        public void listar () {
            LDEClientes.INSTANCE.imprime();
        }
    }





