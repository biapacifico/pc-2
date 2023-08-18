public class Galinha {
    
    private String nome;
    private String corPena;
    private double consumo;
    private String tipoOvo;

    public Galinha (){
        nome = "";
        corPena = "";
        consumo = 0;
        tipoOvo = "";
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setCorPena (String corPena){
        this.corPena = corPena;
    }

    public String getCorPena (){
        return corPena;
    }

    public void setConsumo (double consumo){
        this.consumo = consumo;
    }

    public double getConsumo (){
        return consumo;
    }

    public void setTipoOvo (String tipoOvo){
        this.tipoOvo = tipoOvo;
    }

    public String getTipoOvo (){
        return tipoOvo;
    }
}