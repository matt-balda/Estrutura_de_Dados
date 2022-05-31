package Interfaces;

import Entidades.Cliente;
import Entidades.Locacao;

public interface ILocacao {

    public void insereInicio(Locacao info);
    public void insereFim(Locacao info);
    public boolean estahVazia(Locacao info);
    public boolean remove(Locacao info);
    public boolean busca(Locacao info);
    public void imprime();
    public void imprimeFim();
    public boolean existeCliente(String valor);
    public boolean existeVeiculo(String valor);
    public boolean existeLocacao(String valor);
    //public Locacao buscaPlacaLoc(Locacao valor);
    //public void veiculosNaoLocados();

}
