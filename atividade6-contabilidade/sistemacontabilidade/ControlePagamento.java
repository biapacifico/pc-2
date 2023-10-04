package sistemacontabilidade;
import java.util.ArrayList;

public class ControlePagamento {
    
    private ArrayList<Passivo> pagamentos;

    public ControlePagamento (){
        pagamentos = new ArrayList<>();
    }

    public ControlePagamento (ArrayList<Passivo> pagamentos){
        this.pagamentos = pagamentos;
    }

    public ArrayList<Passivo> getPagamentos (){
        return pagamentos;
    }

    public void setPagamentos (ArrayList<Passivo> pagamentos){
        this.pagamentos = pagamentos;
    }

    public void addPagamento (Passivo pagamento){
        pagamentos.add(pagamento);
    }

    public double controleContas (int dia, int mes){
        double totalContas=0;
        for (Passivo pagContas : pagamentos){
            if (pagContas instanceof Conta){
                if (pagContas instanceof Titulo){
                    totalContas+=((Titulo)pagContas).getValorPagamento(dia, mes);
                }
                else {
                    totalContas+=((Concessionaria)pagContas).getValorPagamento(0, 0);
                }
            }
        }

        return totalContas;
    }

    public double controleEmpregados (){
        double totalEmpregados=0;
        for (Passivo pagEmpregados : pagamentos){
            if (pagEmpregados instanceof Empregado){
                if (pagEmpregados instanceof Assalariado){
                    totalEmpregados+=((Assalariado)pagEmpregados).getValorPagamento(0, 0);
                }
                else if (pagEmpregados instanceof Terceirizado){
                    totalEmpregados+=((Terceirizado)pagEmpregados).getValorPagamento(0, 0);
                }
                else if (pagEmpregados instanceof Comissionado){
                    totalEmpregados+=((Comissionado)pagEmpregados).getValorPagamento(0, 0);
                }
                else if (pagEmpregados instanceof AssalariadoComissionado) {
                    totalEmpregados+=((AssalariadoComissionado)pagEmpregados).getValorPagamento(0, 0);
                }
            }
        }

        return totalEmpregados;
    }

    public double controlePagTotal (int dia, int mes){
        return controleContas(dia, mes)+controleEmpregados();
    }
}