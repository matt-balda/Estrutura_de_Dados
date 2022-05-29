package Interfaces;
import Entidades.Categoria;

public interface ICategoria {

    public void insereInicio(Categoria info);
    public void insereFim(Categoria  info);
    public boolean estahVazia(Categoria  info);
    public boolean remove(Categoria  info);
    public boolean busca(Categoria  info);
    public Categoria  buscaIdObj(int info);
    //public int buscaId(String info);
    public void imprime();
    public void imprimeFim();
}
