public class Main {
    public static void main(String[] args) {

        // Instanciando mapa
        MapaHashVetor mapH = new MapaHashVetor(10);

        // Instanciando objetos de alunos e inicializando
        Aluno a1 = new Aluno(2110102950,"Mateus",10,30);
        Aluno a2 = new Aluno(2110102949,"Bruna",9,30);
        Aluno a3 = new Aluno(2110102948,"Silvia",8,30);
        Aluno a4 = new Aluno(2110102947,"Taus",7,30);
        Aluno a5 = new Aluno(2110102946,"Tulao",7.5,30);
        Aluno a6 = new Aluno(2110102945,"Tulio",6,30);
        Aluno a7 = new Aluno(2110102944,"Tulia",6.8,30);
        Aluno a8 = new Aluno(2110102943,"Ralio",9.8,30);
        Aluno a9 = new Aluno(2110102942,"Silvres",7.5,30);
        Aluno a10 = new Aluno(2110102941,"Jasper",8.7,30);
        Aluno a11 = new Aluno(2110102939,"Jasper1",8.7,30);
        Aluno a12 = new Aluno(2110102938,"Jasper2",8.7,30);
        Aluno a13 = new Aluno(2110102937,"Jasper3",8.7,30);
        Aluno a14 = new Aluno(2110102936,"Jasper4",8.7,30);
        Aluno a15 = new Aluno(2110102935,"Jasper5",8.7,30);
        Aluno a16 = new Aluno(2110102934,"Jasper6",8.7,30);

        // Insercao dos objetos alunos, com key matricula e value object student
        mapH.put(a1.getMatricula(), a1);
        mapH.put(a2.getMatricula(), a2);
        mapH.put(a3.getMatricula(), a3);
        mapH.put(a4.getMatricula(), a4);
        mapH.put(a5.getMatricula(), a5);
        mapH.put(a6.getMatricula(), a6);
        mapH.put(a7.getMatricula(), a7);
        mapH.put(a8.getMatricula(), a8);
        mapH.put(a9.getMatricula(), a9);
        mapH.put(a10.getMatricula(), a10);
        mapH.put(a11.getMatricula(), a11);
        mapH.put(a12.getMatricula(), a12);
        mapH.put(a13.getMatricula(), a13);
        mapH.put(a14.getMatricula(), a14);
        mapH.put(a15.getMatricula(), a15);
        mapH.put(a16.getMatricula(), a16);



        // Get de objeto
        Aluno aux = mapH.get(2110102950);
        System.out.println("Buscado: "+aux.toString());
        Aluno aux1 = mapH.get(2110102949);
        System.out.println("Buscado: "+aux1.toString());
        Aluno aux2 = mapH.get(2110102947);
        System.out.println("Buscado: "+aux2.toString());
        Aluno aux3 = mapH.get(2110102946);
        System.out.println("Buscado: "+aux3.toString());

        // Printando os elementos do vetor
        System.out.println("\nElementos do vetor: \n"+mapH.print());

        //Remocao de um elemento do vetor, atraves da key matricula
        mapH.remove(2110102950);
        mapH.remove(2110102949);

        // Printando os elementos do vetor atualizados, para verificar se removeu
        System.out.println("\nElementos atualizados: \n"+mapH.print());

        //Printando a quantidade de elementos no vetor
        int size = mapH.size();
        System.out.println(size);
    }
}
