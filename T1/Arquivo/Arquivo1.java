package Arquivo;

import Entidades.Veiculo;
import Listas.LDEVeiculos;

import java.nio.file.Paths;
import java.util.Scanner;

public class Arquivo1 {
    private static Scanner input;
    private static LDEVeiculos valores = new LDEVeiculos();

    public LDEVeiculos loader(String file){
        try {
            input = new Scanner(Paths.get(file));
            input.nextLine();
            while (input.hasNext()){
                String[] data = input.nextLine().split(";");
                Veiculo dados = new Veiculo();
                dados.setPlaca(data[0]);
                dados.setModelo(data[1]);
                dados.setMarca(data[2]);
                dados.setAno(Integer.parseInt(data[3]));
                dados.setPotencia(Integer.parseInt(data[4]));
                dados.setNumDeLugares(Integer.parseInt(data[5]));
                valores.insereInicio(dados);
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return valores;
    }
}
