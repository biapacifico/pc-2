package sistemacontabilidade;

public class Comissionado extends Empregado {

    protected double valorVendas;

    public Comissionado (String nome, String sobrenome, int numId, double valorVendas){
        super(nome, sobrenome, numId);
        this.valorVendas = valorVendas;
    }

    public double getValorVendas (){
        return valorVendas;
    }

    public void setValorVendas (double valorVendas){
        this.valorVendas = valorVendas;
    }

    @Override
    public double getValorPagamento(int diaPag, int mesPag) {
        return valorVendas*0.6;
    }
}