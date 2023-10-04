package sistemacontabilidade;

public abstract class Empregado implements Passivo {
    
    protected String nome;
    protected String sobrenome;
    protected int numId;
    
    public Empregado (String nome, String sobrenome, int numId){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numId = numId;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getSobrenome (){
        return sobrenome;
    }

    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }

    public int getNumId (){
        return numId;
    }

    public void setNumId (int numId){
        this.numId = numId;
    }
}