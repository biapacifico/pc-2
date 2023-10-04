package sistemacontabilidade;

public class Concessionaria extends Conta {

    public Concessionaria (int dia, int mes, double valor){
        super(dia, mes, valor);
    }

    @Override
    public double getValorPagamento (int diaPag, int mesPag){
        return this.valor;
    }
}