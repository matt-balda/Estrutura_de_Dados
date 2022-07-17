package Pilha;

import Model.Aluno;

public class PilhaLista implements IPilha {
    private NohPilha topo;
    private int numElem;

    public PilhaLista(){ //construtor
        this.topo = null;
    }

    public boolean push(Aluno info){ //empilha
        NohPilha novo = new NohPilha(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        numElem++;
        return true;
    }

    public Aluno pop(){ //desempilha
        Aluno info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProx();
        }
        numElem--;
        return info;
    }

    public int size() {
        return numElem;
    }

    public boolean isEmpty() {
        if (topo == null){
            return true;
        }
        return false;
    }

    public Aluno top() {
        return topo.getInfo();
    }

    public String imprimir() {
        StringBuilder stringBuilder = new StringBuilder();
        for (NohPilha i = topo; i != null; i = i.getProx()) {
            if (i.getInfo() != null) {
                stringBuilder.append(i.getInfo()+" ");
            }
        }
        return stringBuilder.toString();
    }
}
