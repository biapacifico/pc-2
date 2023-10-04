package sistemacontabilidade;

public class AssalariadoComissionado extends Comissionado {

    private double percentualBonus;

    public AssalariadoComissionado (String nome, String sobrenome, int numId, double valorVendas, double percentualBonus){
        super(nome, sobrenome, numId, valorVendas);
        this.percentualBonus = percentualBonus;
    }

    public double getPercentualBonus (){
        return percentualBonus;
    }

    public void setPercentualBonus (double percentualBonus){
        this.percentualBonus = percentualBonus;
    }

    public double getValorVendas (){
        return valorVendas;
    }

    public void setValorVendas (double valorVendas){
        this.valorVendas = valorVendas;
    }

    @Override
    public double getValorPagamento(int diaPag, int mesPag) {
        return Passivo.SALARIO + valorVendas*0.6 + Passivo.SALARIO*0.1;
    }
}