package sistemacontabilidade;

public class Assalariado extends Empregado {

    private double horasExtras;

    public Assalariado (String nome, String sobrenome, int numId, double horasExtras){
        super(nome, sobrenome, numId);
        this.horasExtras = horasExtras;
    }

    public double getHorasExtras (){
        return horasExtras;
    }

    public void setHorasExtras (double horasExtras){
        this.horasExtras = horasExtras;
    }

    @Override
    public double getValorPagamento (int diaPag, int mesPag){
        return Passivo.SALARIO + Passivo.HORA*horasExtras;
    }
}