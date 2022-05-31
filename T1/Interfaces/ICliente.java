package Interfaces;
import Entidades.Cliente;

public interface ICliente {

        public void insereClienteInicio(Cliente info);
        public void insereClienteFim(Cliente info);
        public boolean estahVazia();
        public boolean removeCliente(Cliente info);
        public boolean busca(Cliente info);
        public Cliente buscaCpfObj(String info);
        public String buscaCpf(String info);
        public void imprime();
        public void imprimeFim();
        public boolean existeCliente(String info);

}

