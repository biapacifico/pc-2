public class Relogio {
    
    private Contador hora;
    private Contador minuto;
    private String formatoDisplay;

    public Relogio(){
        hora = new Contador(0, 0);
        minuto = new Contador(0, 0);
        formatoDisplay = " ";
    }

    public void setHora(Contador hora){
        this.hora = hora;
    }

    public Contador getHora(){
        return hora;
    }

    public void setMinuto(Contador minuto){
        this.minuto = minuto;
    }

    public Contador getMinuto(){
        return minuto;
    }

    public void setFormatoDisplay (String formatoDisplay){
        this.formatoDisplay = formatoDisplay;
    }

    public String getFormatoDisplay (){
        return formatoDisplay;
    }      

    public void ticTac (){
        minuto.contar();
        if (minuto.getValor()==0){
            hora.contar();
        }
    }

    public String getHoraFormatada () {
        if (formatoDisplay.equals("12h") && hora.getValor()==0) {
            return "12";
        } 
        else if (formatoDisplay.equals("12h") && hora.getValor()>12) {
            return hora.getValor()%12 + "";
        } 
        else {
            return hora.getValor() + "";
        }
    }
}