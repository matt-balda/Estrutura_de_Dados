public class Aluno {
    private String nome;
    private int idade;
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Método não necessário, porque o equals consegui comparar a referência do objeto e identificar qual o pesquisado.
     *
     */
    //public boolean equalsNome(Aluno a){
    //    return this.nome.equals(a.getNome());
    //}

    @Override
    public String toString() {
        return "Nome = "+nome+
                " Idade = "+idade+
                " Nota = " + nota+"\n";
    }
}
