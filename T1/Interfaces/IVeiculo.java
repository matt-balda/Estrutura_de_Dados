package Interfaces;

import Entidades.Veiculo;

public interface IVeiculo {

        public void insereInicio(Veiculo valor);

        public void insereFim(Veiculo valor);

        public boolean estahVazia();

        public boolean remove(Veiculo valor);

        public int tamanho();
}

