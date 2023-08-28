public class Carta {

    private String naipe;
    private int valor;

    public Carta (){
        naipe = "";
        valor = 0;
    }

    public Carta (String naipe, int valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public void setNaipe (String naipe){
        this.naipe = naipe;
    }

    public String getNaipe (){
        return naipe;
    }

    public void setValor (int valor){
        this.valor = valor;
    }

    public int getValor (){
        return valor;
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