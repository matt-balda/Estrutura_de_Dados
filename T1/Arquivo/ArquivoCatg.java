package Arquivo;

import Entidades.Categoria;
import Listas.LDECategorias;

import java.nio.file.Paths;
import java.util.Scanner;

public class ArquivoCatg {

    private static Scanner input;

    public LDECategorias carregarCsvCategorias(String file) {
        try {
            input = new Scanner(Paths.get(file));
            input.nextLine();
            while (input.hasNext()) {
                String[] data = input.nextLine().split(";");
                Categoria dados = new Categoria();
                dados.setId(Integer.parseInt(data[0]));
                dados.setNome(data[1]);

                LDECategorias.INSTANCE.insereInicio(dados);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return LDECategorias.INSTANCE;
    }
}
