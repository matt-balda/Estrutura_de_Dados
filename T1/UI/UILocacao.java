package UI;

import Entidades.Cliente;
import Entidades.Locacao;
import Entidades.Veiculo;
import Listas.LDEClientes;
import Listas.LDELocacoes;
import Listas.LDEVeiculos;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UILocacao {
    private Cliente cliente;
    private Veiculo veiculo;
    private Locacao locacao;

    public UILocacao() {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.locacao = new Locacao();
    }

    public void menuGerenciarLocacoes() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println(":: GENRENCIAR LOCACOES ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Locar veículo");
            System.out.println("2 - Devolver veículo");
            System.out.println("3 - Listar locações");
            System.out.println("4 - Filtro");
            System.out.println("0 - Voltar menu anterior");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    locarVeiculo();
                    break;
                case 2:
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    menuFiltro();
                    break;
                case 0:
                    UILocadora.menuPrincipal();
                    break;
                default:
                    System.err.println("ERRO, digite uma opção válida");
            }
        } while (opcao != 0);
    }

    public void locarVeiculo() throws ParseException {
        Scanner sc = new Scanner(System.in);
        String cpf, placa;
        Date dataInicial = null, dataFinal = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String dataRecebida1, dataRecebida2;
        double valorDiaria;

        LDEClientes.INSTANCE.imprime();
        System.out.println();
        System.out.print("Digite o CPF do cliente: ");
        cpf = sc.nextLine();
        cliente = LDEClientes.INSTANCE.buscaCpfObj(cpf);
        if (!LDEClientes.INSTANCE.existeCliente(cpf)) {
            System.err.println("\nO cliente não foi encontrado!");
        } else {
            System.out.println(cliente.toString());
        }
        System.out.println(LDEVeiculos.INSTANCE.imprime());
        System.out.println();
        System.out.print("Digite a placa do veículo: ");
        placa = sc.nextLine();
        veiculo = LDEVeiculos.INSTANCE.buscaPlacaObj(placa);
        if (!LDEVeiculos.INSTANCE.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println(veiculo.toString());
        }
        System.out.print("Valor da diária: ");
        valorDiaria = sc.nextDouble();
        sc.nextLine();
        System.out.print("Data Retirada (dd/mm/aaaa): ");
        dataRecebida1 = sc.nextLine();
        if (dataRecebida1 != null && dataRecebida1.trim().length() > 0) {
            dataInicial = format.parse(dataRecebida1);
        }
        System.out.print("Data Devolução (dd/mm/aaaa): ");
        dataRecebida2 = sc.nextLine();
        if (null != dataRecebida2 && dataRecebida2.trim().length() > 0) {
            dataFinal = format.parse(dataRecebida2);
        }

        Locacao l = new Locacao(valorDiaria, dataInicial, dataFinal, cliente, veiculo);

        LDELocacoes.INSTANCE.insereInicio(l);

        System.out.println("Locação criada com sucesso!");
    }

    public void listar() {
        LDELocacoes.INSTANCE.imprime();
    }

    public void menuFiltro() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n:: FILTRO ::");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Listar por potência");
            System.out.println("2 - Listar por número de lugares");
            System.out.println("3 - Listar por categoria");
            System.out.println("0 - Voltar ");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    return;
                default:
                    System.err.println("ERRO, digite uma opção válida");
            }
        } while (opcao != 0);
    }
}

