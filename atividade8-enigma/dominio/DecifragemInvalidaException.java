package dominio;

public class DecifragemInvalidaException extends Exception {
    
    public DecifragemInvalidaException (){
        super("A mensagem não foi decifrada corretamente!");
    }
}