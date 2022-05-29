package UI;

import Arquivo.ArquivoCatg;
import Arquivo.ArquivoVeiculo;
import Entidades.Categoria;
import Entidades.Veiculo;
import Listas.LDECategorias;
import Listas.LDEVeiculos;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UIVeiculo {
    private Categoria categoria;

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
        if (!LDECategorias.INSTANCE.existe(idCat)){
            System.out.println("\n Categoria não encontrada!");
        }else{
            System.out.println(categoria.getNome());
        }

        Veiculo v1 = new Veiculo(placa, modelo, marca, ano, potencia, numDeLugares, categoria);
        LDEVeiculos.INSTANCE.insereInicio(v1);

        System.out.println("Veículo cadastrado com sucesso!");
    }

    public void consultar() {
        Scanner sc = new Scanner(System.in);
        String placa;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        System.out.println(LDEVeiculos.INSTANCE.buscaPlaca(placa));
    }

    public void alterar() {
        Scanner sc = new Scanner(System.in);
        Veiculo v;
        String placa, modelo, marca;
        int ano, potencia, numDeLugares;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        v = LDEVeiculos.INSTANCE.buscaPlacaObj(placa);

        if (!LDEVeiculos.INSTANCE.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println("Veículo localizado:\n Placa: " + v.getPlaca() + " Marca: " + v.getMarca());

            System.out.print("Placa: ");
            placa = sc.nextLine();
            v.setPlaca(placa);
            System.out.print("Modelo: ");
            modelo = sc.nextLine();
            v.setModelo(modelo);
            System.out.print("Marca: ");
            marca = sc.nextLine();
            v.setMarca(marca);
            System.out.print("Ano: ");
            ano = sc.nextInt();
            v.setAno(ano);
            System.out.print("Potência: ");
            potencia = sc.nextInt();
            v.setPotencia(potencia);
            System.out.print("Número de lugares: ");
            numDeLugares = sc.nextInt();
            v.setNumDeLugares(numDeLugares);

        }
        System.out.println("Veículo alterado com sucesso: " + v.toString());
    }

    public void excluir() {
        Scanner sc = new Scanner(System.in);
        String placa;
        Veiculo v;

        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        v = LDEVeiculos.INSTANCE.buscaPlacaObj(placa);

        if (!LDEVeiculos.INSTANCE.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println(v.toString());
            LDEVeiculos.INSTANCE.remove(v);
            System.out.println("Veículo removido com sucesso.");
        }
    }

    public void listarReverso() {
        System.out.println(LDEVeiculos.INSTANCE.imprimeInverso());
    }

    public void listar() {
        System.out.println(LDEVeiculos.INSTANCE.imprime());
    }

}
