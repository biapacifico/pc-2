package servicos;

import negocio.Contato;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;

public class ManipulaArquivoTexto {
    
    public String arquivo;
    public Formatter gravador;
    public Scanner leitor;

    public ManipulaArquivoTexto (String arquivo){
        this.arquivo = arquivo;
    }

    public String getArquivo (){
        return arquivo;
    }

    public void setArquivo (String arquivo){
        this.arquivo = arquivo;
    }

    public void abrirArquivoParaGravacao (){
        try {
            gravador = new Formatter(arquivo);
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    public void fecharArquivoGravacao (){
        gravador.close();
    }

    public void gravarContato (HashMap<String, Contato> contatos){
        Set<String> chaves = contatos.keySet();

        for (String key : chaves){
            Contato contato = contatos.get(key);
            gravador.format("%s;%s;%s;%s\n", contato.getNome(), contato.getTelefone(), contato.getEmail(), contato.getEndereco());
        }
        fecharArquivoGravacao();
    }

    public void abrirArquivoParaLeitura (){
        try {
            leitor = new Scanner(new File(arquivo));
        } catch (FileNotFoundException ex){
            System.err.println(arquivo + "não pode ser aberto");
        }
    }

    public void fecharArquivoLeitura (){
        if (leitor!=null){
            leitor.close();
        }
    }

    public ArrayList<Contato> lerArquivo (){
        ArrayList<Contato> arqCont = new ArrayList<>();

        while (leitor.hasNext()){
            String[] inf = leitor.nextLine().split(";");
            Contato aux = new Contato(inf[0], inf[1], inf[2], inf[3]);
            arqCont.add(aux);
        }
        fecharArquivoLeitura();

        return arqCont;
    }
}