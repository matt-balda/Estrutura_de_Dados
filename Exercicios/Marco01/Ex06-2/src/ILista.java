public interface ILista {
    public void insereInicio(Object valor);

    public void insereFim(Object valor);

    public boolean estahVazia();

    public boolean estahVaziaInverso();

    public boolean remove(Object valor);

    public boolean busca(Object valor);

    public int tamanho();

    public String imprime();

    public String imprimeInverso();
}