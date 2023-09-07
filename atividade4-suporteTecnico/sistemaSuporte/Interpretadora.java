package sistemaSuporte;

import java.util.HashSet;

public class Interpretadora {
    
    private HashSet<String> palavraChave;

    public Interpretadora (){
        palavraChave = new HashSet<>();
    }

    public Interpretadora (HashSet<String> palavraChave){
        this.palavraChave = palavraChave;
    }

    public HashSet<String> getPalavraChave (){
        return palavraChave;
    }

    public void setPalavraChave (HashSet<String> palavraChave){
        this.palavraChave = palavraChave;
    }

    public HashSet<String> separaPalavras (String problema){
        String[] palavrasSeparadas = problema.split(" ");
        for (String palavras : palavrasSeparadas){
            palavraChave.add(palavras);
        }

        return palavraChave;
    }
}