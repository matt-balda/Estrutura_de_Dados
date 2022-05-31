package Arquivo;

import Entidades.Cliente;
import Listas.LDEClientes;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Classe que permite a manipulação de arquivos csv.
 * @author Lara Souto
 * @date 24/05/2022
 * @since 2.0
 */
public class ArquivoCliente {
    private static Scanner input;

    /**
     * Método que permite o carregando do arquivo csv
     * @param file String a ser inserido
     * @return objeto LDE de clientes
     */
    public LDEClientes carregarCsvClientes(String file) {
        try {
            input = new Scanner(Paths.get(file));
            input.nextLine();
            while (input.hasNext()) {
                String[] data = input.nextLine().split(";");
                Cliente dados = new Cliente();
                dados.setNome(data[0]);
                dados.setCpf(data[1]);
                dados.setCnh(Long.parseLong(data[2]));
                dados.setTelefone(Long.parseLong(data[3]));
                LDEClientes.INSTANCE.insereClienteInicio(dados);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return LDEClientes.INSTANCE;
    }
}
