package negocio;

public class ContatoInexistenteException extends Exception {

    public ContatoInexistenteException (String nome){
        super("O contato " + nome + " não foi encontrado.");
    }
}