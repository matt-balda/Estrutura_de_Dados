package Noh;

import Entidades.Cliente;

import java.io.Serializable;

public class NohClientes implements Serializable {
        private Cliente info;
        private NohClientes ant;
        private NohClientes prox;
        public NohClientes (Cliente info){
            this.info = info;
            this.ant = null;
            this.prox = null;
        }
        public Cliente getInfo() {
            return info;
        }
        public NohClientes getProx() {
            return prox;
        }
        public void setProx(NohClientes n) {
            this.prox = n;
        }
        public NohClientes getAnt() {
            return ant;
        }
        public void setAnt(NohClientes n) {
            this.ant = n;
        }
        public String getCpf(){
            return info.getCpf();
        }
        public String toStringCliente(){
            return info.toString();
        }
}

