package Arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoVeiculo {


//    public static void main(String[] args) {
//
//        ArquivoVeiculo obj = new ArquivoVeiculo();
//        obj.run();
//
//    }

    public static void run(String arquivoCSV) {

        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ";";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] veiculo = linha.split(csvDivisor);

                String formato = String.format("Placa %s |Modelo: %s |Marca: %s |Ano: %s |Potencia: %s |Lugares: %s |Categoria: %s", veiculo[0], veiculo[1], veiculo[2], veiculo[3], veiculo[4], veiculo[5], veiculo[6]);

                System.out.println(formato);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
