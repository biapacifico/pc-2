package servicos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ManipulaArquivoTexto {

    //método que abre, grava e fecha um arquivo
    public static void gravarArquivo (ArrayList<String> dados, String nomeArquivo){
        try {
            //abrir arquivo para gravação
            Formatter gravador = new Formatter(nomeArquivo);
            //gravar as frases no arquivo
            for (String frase : dados){
                gravador.format("%s\n", frase);
            }
            //fechar arquivo
            gravador.close();
        } catch (FileNotFoundException ex){
            System.err.println("O arquivo " + nomeArquivo + " não foi encontrado");
        }
    }
    
    //método que abre, faz a leitura e fecha um arquivo
    public static ArrayList<String> lerArquivo (String nomeArquivo){
        ArrayList<String> retorno = new ArrayList<>();

        try {
            //abrir arquivo para leitura
            Scanner leitura = new Scanner(new File(nomeArquivo));
            //ler arquivo e colocar no arraylist de retorno
            while (leitura.hasNext()){
                String frase = leitura.nextLine();
                retorno.add(frase);
            }
            //fechar arquivo
            leitura.close();
        } catch (FileNotFoundException ex){
            System.err.println("O arquivo " + nomeArquivo + " não foi encontrado");
        }

        return retorno;
    }
}