package UI;

import Listas.LDECategorias;
import Listas.LDEClientes;
import Listas.LDEVeiculos;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UILocadora {

    public static void menuPrincipal() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        UIVeiculo uiVeiculo = new UIVeiculo();
        UICliente uiCliente = new UICliente();
        UICategoria uiCategoria = new UICategoria();
        UILocacao uiLocacao = new UILocacao();
        int op;
        do {
            System.out.println("|||||||||||||||||||||||||||||||||||");
            System.out.println("||||   Bem-vindo a PampaLoca   ||||");
            System.out.println("||||   1 - Menu veículos       ||||");
            System.out.println("||||   2 - Menu clientes       ||||");
            System.out.println("||||   3 - Menu categoria      ||||");
            System.out.println("||||   4 - Menu locação        ||||");
            System.out.println("||||   0 - Para sair           ||||");
            System.out.println("|||||||||||||||||||||||||||||||||||");
            System.out.print("Sua opção: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    uiVeiculo.menuGerenciarVeiculos();
                    break;
                case 2:
                    uiCliente.menuGerenciarClientes();
                    break;
                case 3:
                    uiCategoria.menuGerenciarCategorias();
                    break;
                case 4:
                    uiLocacao.menuGerenciarLocacoes();
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
        } while (op != 0);
    }
}
