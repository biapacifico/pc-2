public class Cavalo {
    
    private String nome;
    private String corPelo;
    private double consumo;
    private double velocidadeMedia;

    public Cavalo (){
        nome = "";
        corPelo = "";
        consumo = 0;
        velocidadeMedia = 0;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setCorPelo (String corPelo){
        this.corPelo = corPelo;
    }

    public String getCorPelo (){
        return corPelo;
    }

    public void setConsumo (double consumo){
        this.consumo = consumo;
    }

    public double getConsumo (){
        return consumo;
    }

    public void setVelocidadeMedia (double velocidadeMedia){
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getVelocidadeMedia (){
        return velocidadeMedia;
    }
}