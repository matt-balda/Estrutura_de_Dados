package Interfaces;

import Entidades.Veiculo;

public interface IVeiculo {

        public void insereInicio(Veiculo valor);
        public void insereFim(Veiculo valor);
        public boolean estahVazia();
        public boolean estahVaziaInverso();
        public boolean remove(Veiculo valor);
       // public boolean busca(Veiculo valor);
        public String buscaPlaca(String valor);
        public Veiculo buscaPlacaObj(String valor);
        public String buscaPotencia(int valor);
        public String buscaNLugares(int valor);
        public boolean existe(String valor);
        public boolean existeCategoria(int valor);
        public String imprime();
        public String imprimeReverso();
        public String procuraVeiculos();
        public int tamanho();
        public String buscaPotenciaECategoria(int potencia, int id);
        public String buscaNLugaresECategoria(int nLugares, int id);
}

