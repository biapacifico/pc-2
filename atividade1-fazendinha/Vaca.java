public class Vaca {
    
    private String nome;
    private String corPelo;
    private double consumo;
    private String tipoMugido;

    public Vaca (){
        nome = "";
        corPelo = "";
        consumo = 0;
        tipoMugido = "";
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

    public void setTipoMugido (String tipoMugido){
        this.tipoMugido = tipoMugido;
    }

    public String getTipoMugido (){
        return tipoMugido;
    }
}