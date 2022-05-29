package UI;

import Arquivo.ArquivoCatg;
import Entidades.Categoria;
import Listas.LDECategorias;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class UICategoria {
    private Categoria categoria;

    public UICategoria() {

    }

    public void menuGerenciarCategorias() throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println(":: GENRENCIAR CATEGORIA ::\n");
            System.out.println("Escolha a opção desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar");
            System.out.println("5 - Listar reservo");
            System.out.println("0 - Voltar Menu Anterior");
            System.out.print("Sua opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    adicionar();
                    break;
                case 2:
                    alterar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    listar();
                    break;
                case 5:
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
        String nome;
        int id;

        System.out.print("ID: ");
        id = sc.nextInt();
        System.out.print("Nome: ");
        nome = sc.nextLine();

        Categoria cat = new Categoria(nome, id);
        LDECategorias.INSTANCE.insereInicio(cat);

        System.out.println("Categoria cadastrado.");
    }

    public void alterar () {
        Scanner sc = new Scanner(System.in);
        String nome;
        int id;

        System.out.print("Digite o id da categoria: ");
        id = sc.nextInt();
        categoria = LDECategorias.INSTANCE.buscaIdObj(id);

        if (!LDECategorias.INSTANCE.existe(id)) {
            System.err.println("\nA categoria não foi encontrada!");
        } else {
            System.out.println("Categoria encontrada:\n ID: " + categoria.getId() + " Nome: " + categoria.getNome());

            System.out.print("ID: ");
            id = sc.nextInt();
            categoria.setId(id);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            categoria.setNome(nome);
        }
        System.out.println("Categoria alterada com sucesso: " +categoria.toString());
    }
    public void excluir () {
        Scanner sc = new Scanner(System.in);
        int id;
        Categoria cat;

        System.out.print("Digite o id da categoria: ");
        id = sc.nextInt();
        cat = LDECategorias.INSTANCE.buscaIdObj(id);

        if (!LDECategorias.INSTANCE.existe(id)) {
            System.err.println("\nCategoria não encontrada.");
        } else {
            System.out.println(cat.toString());
            LDECategorias.INSTANCE.remove(cat);
            System.out.println("Categoria removida com sucesso.");
        }
    }
    public void listarReverso () {
        LDECategorias.INSTANCE.imprimeFim();
    }
    public void listar () {
        LDECategorias.INSTANCE.imprime();
    }
}