package Listas;
import Entidades.Cliente;
import Interfaces.ICliente;
import Noh.NohClientes;

import java.io.Serializable;

public class LDEClientes implements ICliente, Serializable {
        private NohClientes inicio;
        private NohClientes fim;
        private int totalInfo;
        private Cliente c;
        public static LDEClientes INSTANCE;

        public LDEClientes() {
            this.inicio = null;
            this.fim = null;
            INSTANCE = this;
        }

        public void insereClienteInicio(Cliente info) {
            NohClientes novo = new NohClientes(info);
            if (inicio == null) {
                inicio = novo;
                fim = novo;
            } else {
                novo.setProx(inicio);
                inicio.setAnt(novo);
                inicio = novo;
            }
            totalInfo++;
        }

        public void insereClienteFim(Cliente info) {
            NohClientes novo = new NohClientes(info);
            if (fim == null)
                fim = novo;
            else {
                novo.setAnt(fim);
                fim.setProx(novo);
                fim = novo;
            }
            totalInfo++;
        }

        public boolean busca(Cliente info) {
            NohClientes p = inicio;
            while (p != null && p.getInfo() != info)
                p = p.getProx();
            if (p == null) {
                return false;
            }
            return true;
        }

        public boolean removeCliente(Cliente info) {
            busca(info);
            NohClientes p = inicio;
            if (p == null) {
                return false;
            }
            if (p.getAnt() == null) {
                inicio = p.getProx();
                inicio.setAnt(null);
            } else if (p.getProx() == null) {
                p.getAnt().setProx(null);
                fim = p.getAnt();
            } else {
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
            }
            totalInfo--;
            return true;
        }

        public void imprime() {
            for (NohClientes i = inicio; i != null; i = i.getProx()) {
                System.out.println(i.getInfo());
            }
        }

        public void imprimeFim() {
            for (NohClientes i = fim; i != null; i = i.getAnt()) {
                System.out.println(i.getInfo());
            }
        }

        public int tamanho() {
            return this.totalInfo;
        }

        public boolean estahVazia(Cliente info) {
            if (inicio == null) {
                return true;
            } else {
                return false;
            }
        }
        public String buscaCpf(String cpf) {
            for (NohClientes i = inicio; i != null; i = i.getProx()) {
                if (i.getCpf().equals(cpf)) {
                    return i.toStringCliente();
                }
            }
            return null;
        }
        public Cliente buscaCpfObj(String cpf){
            for (NohClientes i = inicio; i != null; i = i.getProx()){
                if (i.getCpf().equals(cpf)) {
                    c = i.getInfo();
                    return c;
            }
        }
        return null;
    }
    public boolean existeCliente(String cpf){
        for (NohClientes i = inicio; i != null; i = i.getProx()){
            if (i.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
}

