package dominio;

import java.util.ArrayList;

public class CifraDeCesar {

    private Chave chave;
    private ArrayList<String> frasesCifradas = new ArrayList<>();
    private ArrayList<String> frasesDecifradas = new ArrayList<>();

    public CifraDeCesar (Chave chave){
        this.chave = chave;
    }

    public Chave getChave (){
        return chave;
    }

    public void setChave (Chave chave){
        this.chave = chave;
    }

    public ArrayList<String> getFrasesCifradas (){
        return frasesCifradas;
    }

    public void setFrasesCifradas (ArrayList<String> frasesCifradas){
        this.frasesCifradas = frasesCifradas;
    }

    public ArrayList<String> getFrasesDecifradas (){
        return frasesDecifradas;
    }

    public void setFrasesDecifradas (ArrayList<String> frasesDecifradas){
        this.frasesDecifradas = frasesDecifradas;
    }

    //método que recebe uma frase e a retorna como cifra de césar
    public String cifrar (String mensagem){
        String mensagemCifrada = "";
        String[] letras = mensagem.split("");
        for (int i=0; i<letras.length; i++){
            if (letras[i].equals(" ")==false){
                mensagemCifrada += chave.cifrarLetra(letras[i]);
            }
            else {
                mensagemCifrada += " ";
            }
        }

        return mensagemCifrada;
    }
    
    //método que recebe uma frase e a retorna decifrada
    public String decifrar (String mensagem){
        String mensagemDecifrada = "";
        String[] letras = mensagem.split("");
        for (int i=0; i<letras.length; i++){
            if (letras[i].equals(" ")==false){
                mensagemDecifrada += chave.decifrarLetra(letras[i]);
            }
            else {
                mensagemDecifrada += " ";
            }
        }

        return mensagemDecifrada;
    }

    public void addFraseCifrada (String mensagem){
        frasesCifradas.add(mensagem);
    }

    public void addFraseDecifrada (String mensagem){
        frasesDecifradas.add(mensagem);
    }

    public void confereResposta (String resposta) throws DecifragemInvalidaException {
        
    }
}