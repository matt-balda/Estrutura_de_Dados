package Entidades;

public class Cliente {
    private String nome;
    private long cnh;
    private String cpf;
    private long telefone;

    public Cliente(String nome, String cpf, long cnh, long telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnh() {
        return cnh;
    }

    public void setCnh(long cnh) {
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", CNH=" + cnh +
                ", CPF=" + cpf +
                ", Telefone=" + telefone +
                '}';
    }
}