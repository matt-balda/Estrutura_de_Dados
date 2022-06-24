public interface IVetor {
    public void adiciona(Aluno aluno);

    public int tamanho();

    public boolean contem(Aluno aluno);

    public boolean cheio();

    public boolean remove(Aluno aluno);

    public void garanteEspaco();

    public int getTotalAlunos();

    public void imprime();
}