public class Carta {
    
    private int valor;
    private String naipe;

    //inicialização somente com valores nulos
    public Carta (){
        valor = 0;
        naipe = "";
    }

    //construtor para inicialização personalizada (parâmetro)
    public Carta (int valor, String naipe){
        this.valor = valor;
        this.naipe = naipe;
    }

    public void setValor (int valor){
        this.valor = valor;
    }

    public int getValor (){
        return valor;
    }

    public void setNaipe (String naipe){
        this.naipe = naipe;
    }

    public String getNaipe (){
        return naipe;
    }

    public int comparaValor (Carta cartaComparada){
        if (this.valor>cartaComparada.getValor()){
            return 1;
        }
        else if (this.valor<cartaComparada.getValor()){
            return -1;
        }
        else {
            return 0;
        }
    }

    public int comparaNaipe (Carta cartaComparada){
        if (this.naipe.equals(cartaComparada.naipe)==true){
            return 1;
        }
        else {
            return 0;
        }
    }
}