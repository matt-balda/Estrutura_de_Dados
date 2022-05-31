package Arquivo;

import Entidades.Categoria;
import Listas.LDECategorias;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Classe que permite a manipulação de arquivos csv.
 * @author Wellyngton Wilton
 * @date 24/05/2022
 * @since 2.0
 */
public class ArquivoCatg {

    /**
     * Método que permite o carregando do arquivo csv
     * @param file String a ser inserido
     * @return objeto LDE de categorias
     */
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
