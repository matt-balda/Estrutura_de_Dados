package Entidades;

/**
 * Classe que permite acessos e modificações nos atributos da categoria
 * @author Wellyngton Wilton
 * @date 21/05/2022
 * @since 1.0
 */
public class Categoria {
    private String nome;
    private int id;

    public Categoria(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Categoria() {

    }

    public int getId() {
        return id;
    }

    public Categoria setId(int id) {
        this.id = id;
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return ("Id: " + id +
                " | Nome: " + nome);
    }
}
