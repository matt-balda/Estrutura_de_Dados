package UI;

import Entidades.Categoria;
import Entidades.Veiculo;
import Listas.LDECategorias;
import Listas.LDELocacoes;
import Listas.LDEVeiculos;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UIVeiculo {
    private Categoria categoria;
    private Veiculo veiculo;

    public UIVeiculo() {
    }

    public void menuGerenciarVeiculos() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println(":: GENRENCIAR VEICULOS ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar");
            System.out.println("6 - Listar reservo");
            System.out.println("0 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
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
        } while (opcao != 0);
    }

    public void adicionar() {
        Scanner sc = new Scanner(System.in);
        String placa, modelo, marca;
        int ano, potencia, numDeLugares, idCat;

        System.out.print("Placa: ");
        placa = sc.nextLine();
        System.out.print("Modelo: ");
        modelo = sc.nextLine();
        System.out.print("Marca: ");
        marca = sc.nextLine();
        System.out.print("Ano: ");
        ano = sc.nextInt();
        System.out.print("Potência: ");
        potencia = sc.nextInt();
        System.out.print("Número de lugares: ");
        numDeLugares = sc.nextInt();

        LDECategorias.INSTANCE.imprime();
        System.out.print("Categoria: ");
        idCat = sc.nextInt();
        categoria = LDECategorias.INSTANCE.buscaIdObj(idCat);
        if (!LDECategorias.INSTANCE.existe(idCat)) {
            System.err.println("\n Categoria não encontrada!");
        } else {
            System.out.println(categoria.getNome());
        }

        Veiculo v1 = new Veiculo(placa, modelo, marca, ano, potencia, numDeLugares, categoria);
        LDEVeiculos.INSTANCE.insereFim(v1);

        System.out.println("Veículo cadastrado com sucesso!");
    }

    public void consultar() {
        Scanner sc = new Scanner(System.in);
        String placa;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        if (LDEVeiculos.INSTANCE.existe(placa)) {
            System.out.println(LDEVeiculos.INSTANCE.buscaPlaca(placa));
        } else {
            System.err.println("Veículo não encontrado!");
        }
    }

    public void alterar() {
        Scanner sc = new Scanner(System.in);
        String placa, modelo, marca;
        int ano, potencia, numDeLugares, idCat, op = 0;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        veiculo = LDEVeiculos.INSTANCE.buscaPlacaObj(placa);

        if (!LDEVeiculos.INSTANCE.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println("Veículo localizado:\n Placa: " + veiculo.getPlaca() + " Marca: " + veiculo.getMarca());

            System.out.println("Qual item deseja alterar: 1.Placa | 2.Modelo | 3.Marca | 4.Ano" +
                    " | 5.Potência | 6.Número de lugares | 7.Categoria");
            System.out.print("- ");
            op = sc.nextInt();
            if (op == 1) {
                sc.nextLine();
                System.out.print("Placa: ");
                placa = sc.nextLine();
                veiculo.setPlaca(placa);
            } else if (op == 2) {
                sc.nextLine();
                System.out.print("Modelo: ");
                modelo = sc.nextLine();
                veiculo.setModelo(modelo);
            } else if (op == 3) {
                sc.nextLine();
                System.out.print("Marca: ");
                marca = sc.nextLine();
                veiculo.setMarca(marca);
            } else if (op == 4) {
                System.out.print("Ano: ");
                ano = sc.nextInt();
                veiculo.setAno(ano);
            } else if (op == 5) {
                System.out.print("Potência: ");
                potencia = sc.nextInt();
                veiculo.setPotencia(potencia);
            } else if (op == 6) {
                System.out.print("Número de lugares: ");
                numDeLugares = sc.nextInt();
                veiculo.setNumDeLugares(numDeLugares);
            } else if (op == 7) {
                LDECategorias.INSTANCE.imprime();
                System.out.print("Digite o id da Categoria: ");
                idCat = sc.nextInt();
                veiculo.setCategoria(LDECategorias.INSTANCE.buscaIdObj(idCat));
            }
        }
        System.out.println("Veículo alterado com sucesso: " + veiculo.toString());
    }

    public void excluir() {
        Scanner sc = new Scanner(System.in);
        String placa;

        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        veiculo = LDEVeiculos.INSTANCE.buscaPlacaObj(placa);

        if (!LDEVeiculos.INSTANCE.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println(veiculo.toString());
            if (LDELocacoes.INSTANCE.existeVeiculo(placa)) {
                System.out.println("Veiculo não pode ser removido!");
            } else {
                LDEVeiculos.INSTANCE.remove(veiculo);
                System.out.println("Veiculo removido com sucesso.");
            }
        }
    }

    public void listarReverso() {
        System.out.println(LDEVeiculos.INSTANCE.imprimeReverso());
    }

    public void listar() {
        System.out.println(LDEVeiculos.INSTANCE.imprime());
    }

}
