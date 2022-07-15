public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapaHashVetor = new MapaHashVetor();
        Aluno a1 = new Aluno("Mateus",10,30);
        Aluno a2 = new Aluno("Matteus",10,30);
        mapaHashVetor.put(65656, a1);
        mapaHashVetor.put(65656, a2);
        mapaHashVetor.imprimir();
    }
}
