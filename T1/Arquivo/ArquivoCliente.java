package Arquivo;

import Entidades.Cliente;
import Listas.LDEClientes;

import java.nio.file.Paths;
import java.util.Scanner;

public class ArquivoCliente {
    private static Scanner input;
    private static LDEClientes valores = new LDEClientes();

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
                valores.insereClienteInicio(dados);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return valores;
    }
}
