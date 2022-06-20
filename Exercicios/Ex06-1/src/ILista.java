public interface ILista {
    public void insereInicio(int valor);

    public void insereFim(int valor);

    public boolean estahVazia();

    public boolean estahVaziaInverso();

    public boolean remove(int valor);

    public boolean busca(int valor);

    public int tamanho();

    public String imprime();

    public String imprimeInverso();
}