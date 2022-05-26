package UI;

import Arquivo.Arquivo1;
import Arquivo.Arquivo2;
import Entidades.Veiculo;
import Listas.LDEVeiculos;

import java.io.File;
import java.util.Scanner;

public class UIVeiculo {
    private LDEVeiculos lista;

    public UIVeiculo(LDEVeiculos lista) {
        this.lista = lista;
    }

    public void menuGerenciarVeiculos() {
        if(new File("Veiculos.csv").exists()){
            try{
                lista = new Arquivo1().loader("Veiculos.csv");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
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

            switch (opcao){
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
                    listarReservo();
                    break;
                case 0:
                    return;
                default:
                    System.err.println("ERRO, Opção inválida!");
            }
        }while (opcao != 0);
    }

    public void adicionar(){
        Scanner sc = new Scanner(System.in);
        String placa, modelo, marca;
        int ano, potencia, numDeLugares;

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

        Veiculo v1 = new Veiculo(placa, modelo, marca, ano, potencia, numDeLugares);
        lista.insereInicio(v1);

        System.out.println("Veículo cadastrado com sucesso!");
    }
    public void consultar()  {
        Scanner sc = new Scanner(System.in);
        String placa;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        System.out.println(lista.buscaPlaca(placa));
    }
    public void alterar(){
        Scanner sc = new Scanner(System.in);
        Veiculo v;
        String placa, modelo, marca;
        int ano, potencia, numDeLugares;
        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        v = lista.buscaPlacaObj(placa);

        if (!lista.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println("Veículo localizado:\n Placa: "+v.getPlaca()+" Marca: "+v.getMarca());

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
        System.out.println("Veículo alterado com sucesso: "+ v.toString());
    }
    public void excluir(){
        Scanner sc = new Scanner(System.in);
        String placa;
        Veiculo v;

        System.out.print("Digite a placa do veículo a ser pesquisado: ");
        placa = sc.nextLine();
        v = lista.buscaPlacaObj(placa);

        if (!lista.existe(placa)) {
            System.err.println("\nO veículo não foi encontrado!");
        } else {
            System.out.println(v.toString());
            lista.remove(v);
            System.out.println("Veículo removido com sucesso.");
        }
    }
    public void listarReservo(){
        System.out.println(lista.imprimeInverso());
    }
    public void listar(){
        System.out.println(lista.imprime());
    }

}
