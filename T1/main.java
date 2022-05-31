import Arquivo.ArquivoCatg;
import Arquivo.ArquivoCliente;
import Arquivo.ArquivoVeiculo;
import Listas.LDECategorias;
import Listas.LDEClientes;
import Listas.LDELocacoes;
import Listas.LDEVeiculos;
import UI.UILocadora;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class main {
    public static void main(String[] args) throws IOException, ParseException {
        LDECategorias.INSTANCE = new LDECategorias();
        LDEVeiculos.INSTANCE = new LDEVeiculos();
        LDEClientes.INSTANCE = new LDEClientes();
        LDELocacoes.INSTANCE = new LDELocacoes();

        if (new File("Categoria.csv").exists()) {
            try {
                LDECategorias.INSTANCE = new ArquivoCatg().carregarCsvCategorias("Categoria.csv");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (new File("Veiculos.csv").exists()) {
            try {
                LDEVeiculos.INSTANCE = new ArquivoVeiculo().carregarCsvVeiculos("Veiculos.csv");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        if (new File("ClientesP.csv").exists()) {
            try {
                LDEClientes.INSTANCE = new ArquivoCliente().carregarCsvClientes("ClientesP.csv");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        UILocadora.menuPrincipal();
    }
}
