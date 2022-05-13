public class LSE implements ILista {
    private Noh inicio;
    private int contElementos;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }else{
            novo.setProx(inicio);
            inicio = novo;

        }
        contElementos++;
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }else {
            Noh ultimo = null;
            for (Noh i=inicio; i != null; i=i.getProx()){
                ultimo = i;
            }
            ultimo.setProx(novo);
            contElementos++;
        }
    }

    @Override
    public boolean estahvazia() {
        return false;
    }

    @Override
    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while(p!=null && p.getInfo() != info){
            ant = p;
            p = p.getProx();
        }
        if (p==null){
            return false;
        }
        if (ant == null){
            inicio = p.getProx();
        }else{
            ant.setProx(p.getProx());
        }
        contElementos--;
        return true;
    }

    @Override
    public int tamanho() {
        return contElementos;
    }
}
