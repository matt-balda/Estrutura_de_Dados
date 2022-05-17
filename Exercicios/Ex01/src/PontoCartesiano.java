public class PontoCartesiano {
    private int x;
    private int y;

    public PontoCartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double calcularDistancia(PontoCartesiano segundoCartesiano) {
        double valorx = this.x - segundoCartesiano.x;
        double valory = this.y - segundoCartesiano.y;

        double distancia = Math.pow(valorx, 2) + Math.pow(valory, 2);
        return Math.sqrt(distancia);
    }
}
