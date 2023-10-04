package sistemacontabilidade;

public class Titulo extends Conta {

    public Titulo (int dia, int mes, double valor){
        super(dia, mes, valor);
    }

    @Override
    public double getValorPagamento (int diaPag, int mesPag){
        if (diaPag<=this.dia && mesPag<=this.mes){
            return this.valor;
        }
        else {
            return this.valor+(this.valor*0.1);
        }
    }
}