package negocio;

import java.util.HashMap;

public class Agenda {
    
    private HashMap<String, Contato> contatos;

    public Agenda (){
        contatos = new HashMap<>();
    }

    public HashMap<String, Contato> getContatos (){
        return contatos;
    }

    public void setContatos (HashMap<String, Contato> contatos){
        this.contatos = contatos;
    }

    public boolean addContato (Contato contato){
        if (contato!=null){
            contatos.put(contato.getNome(), contato);
            return true;
        }
        return false;
    }

    public boolean existeContato (String nome) throws ContatoInexistenteException{
        if (contatos.containsKey(nome)==false){
            throw new ContatoInexistenteException(nome);
        }
        else {
            return true;
        }
    }

    public Contato consultarContato (String nome) throws ContatoInexistenteException{
        if (existeContato(nome)==true){
            return contatos.get(nome);
        }
        else {
            throw new ContatoInexistenteException(nome);
        }
    }

    public void removerContato (String nome){
        contatos.remove(nome);
    }
}