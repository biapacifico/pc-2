package principal_Bianca;

public class Imovel {
    
    private double valorDia;
    private String proprietario;
    private String descricao;
    private double pagamentos;
    private double pagamentosAdm;

    public Imovel (){
        valorDia = 0.0;
        proprietario = "";
        descricao = "";
        pagamentos = 0;
        pagamentosAdm = 0;
    }
    
    public Imovel (double valorDia, String proprietario, String descricao, double pagamentos, double pagamentosAdm){
        this.valorDia = valorDia;
        this.proprietario = proprietario;
        this.descricao = descricao;
        this.pagamentos = pagamentos;
        this.pagamentosAdm = pagamentosAdm;
    }

    public double getValorDia (){
        return valorDia;
    }

    public void setValorDia (double valorDia){
        this.valorDia = valorDia;
    }

    public String getProprietario (){
        return proprietario;
    }

    public void setProprietario (String proprietario){
        this.proprietario = proprietario;
    }

    public String getDescricao (){
        return descricao;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public double getPagamentos (){
        return pagamentos;
    }

    public void setPagamentos (double pagamentos){
        this.pagamentos = pagamentos;
    }

    public double getPagamentosAdm (){
        return pagamentosAdm;
    }

    public void setPagamentosAdm (double pagamentosAdm){
        this.pagamentosAdm = pagamentosAdm;
    }

    public void calculaPagamentoRecebido (double pagamento){
        pagamentos+=pagamento;
    }

    public void calculaPagamentoAdm (double pagamento){
        pagamentosAdm+=pagamento;
    }
}