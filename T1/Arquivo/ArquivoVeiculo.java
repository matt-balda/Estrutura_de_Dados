package Arquivo;

import Entidades.Veiculo;
import Listas.LDECategorias;
import Listas.LDEVeiculos;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Classe que permite a manipulação de arquivos csv.
 * @author Mateus Balda
 * @date 24/05/2022
 * @since 2.0
 */
public class ArquivoVeiculo {
    private static Scanner input;

    /**
     * Método que permite o carregando do arquivo csv
     * @param file String a ser inserido
     * @return objeto LDE de veículos
     */
    public LDEVeiculos carregarCsvVeiculos(String file) {
        try {
            input = new Scanner(Paths.get(file));
            input.nextLine();
            while (input.hasNext()) {
                String[] data = input.nextLine().split(";");
                Veiculo dados = new Veiculo();
                dados.setPlaca(data[0]);
                dados.setModelo(data[1]);
                dados.setMarca(data[2]);
                dados.setAno(Integer.parseInt(data[3]));
                dados.setPotencia(Integer.parseInt(data[4]));
                dados.setNumDeLugares(Integer.parseInt(data[5]));
                dados.setCategoria(LDECategorias.INSTANCE.buscaIdObj(Integer.parseInt(data[6])));
                LDEVeiculos.INSTANCE.insereInicio(dados);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return LDEVeiculos.INSTANCE;
    }
}
