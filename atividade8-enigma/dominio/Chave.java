package dominio;

public class Chave {
    
    private int deslocamento;
    private String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    
    public Chave (int deslocamento){
        this.deslocamento = deslocamento;
    }

    public int getDeslocamento (){
        return deslocamento;
    }

    public void setDeslocamento (int deslocamento){
        this.deslocamento = deslocamento;
    }

    //método que recebe uma letra e retorna ela decifrada
    public String decifrarLetra (String letra){
        String letraDecifrada = null;
        for (int i=0; i<alfabeto.length; i++){
            if (letra.toLowerCase().equals(alfabeto[i])){
                letraDecifrada = alfabeto[(i-deslocamento)%alfabeto.length];
            }
        }

        return letraDecifrada;
    }

    //método que recebe uma letra e retorna ela na cifra de césar
    public String cifrarLetra (String letra){
        String letraCifrada = null;
        for (int i=0; i<alfabeto.length; i++){
            if (letra.toLowerCase().equals(alfabeto[i])){
                letraCifrada = alfabeto[(i+deslocamento)%alfabeto.length];
            }
        }

        return letraCifrada;
    }
}