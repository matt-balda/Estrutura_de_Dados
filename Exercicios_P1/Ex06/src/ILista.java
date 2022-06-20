public interface ILista {
    public void insereInicio(int valor);

    public void insereFim(int valor);

    public boolean estahVazia();

    public boolean estahVaziaInverso();

    public boolean remove(int valor);

    public int tamanho();

    public void ordenarLDE();

    public void add_ordenado(int valor);

    public String imprime();

    public String imprimeInverso();

}