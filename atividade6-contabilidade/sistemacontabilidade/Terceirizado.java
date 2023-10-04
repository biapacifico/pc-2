package sistemacontabilidade;

public class Terceirizado extends Empregado {

    private double horasTrabalhadas;

    public Terceirizado (String nome, String sobrenome, int numId, double horasTrabalhadas){
        super(nome, sobrenome, numId);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas (){
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas (double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getValorPagamento (int diaPag, int mesPag){
        return Passivo.HORA*horasTrabalhadas;
    }
}