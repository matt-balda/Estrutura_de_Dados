public class Main {
    public static void main(String[] args) {
        //Instanciando o mapa
        MapaHashVetor mapaH = new MapaHashVetor(2);

        //Instanciando os objetos de alunos e inicializando
        Aluno a1 = new Aluno(2110102950,"Mateus",10,30);
        Aluno a2 = new Aluno(2110102949,"Elias",10,30);
        Aluno a3 = new Aluno(2110102948,"Bruna",10,30);
        Aluno a4 = new Aluno(2110102947,"Bruno",10,30);

        // Adicionando os objetos alunos na tabela hash
        mapaH.put(a1.getMatricula(), a1);
        mapaH.put(a2.getMatricula(), a2);
        mapaH.put(a3.getMatricula(), a3);
        mapaH.put(a4.getMatricula(), a4);

        // Buscando um objeto atraves do hash com o metodo get que retorna um objeto
        Aluno obj = mapaH.get(2110102950);
        System.out.println(obj.toString());

        // Printando os elementos do vetor
        String print = mapaH.print();
        System.out.println("\nTodos os elementos: \n"+print);

        // Removendo um objeto atraves do hash
        mapaH.remove(2110102949);

        // Printando os elementos atualizados
        String print2 = mapaH.print();
        System.out.println("\nAtualizados: \n"+print2);

        // Printando a quantidade de elementos no vetor
        int size = mapaH.size();
        System.out.println("Tamanho: "+size);
    }
}
