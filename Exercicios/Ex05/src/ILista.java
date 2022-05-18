public interface ILista {
    public void insereInicio(Object valor);

    public void insereFim(Object valor);

    public boolean estahVazia();

    public boolean remove(Object valor);

    public int tamanho();
    public String imprime();
}