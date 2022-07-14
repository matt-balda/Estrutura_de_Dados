public enum Status {
    ANDAMENTO(1), CONCLUIDO(2), CANCELADO(3);
    private final int valor;
    Status(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
