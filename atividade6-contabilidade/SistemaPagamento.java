import sistemacontabilidade.*;

public class SistemaPagamento {

    public static void main (String[] args){
        
        Empregado assalariado = new Assalariado("Marty", "McFly", 123, 5);
        Empregado terceirizado = new Terceirizado("Luke", "Skywalker", 456, 160);
        Empregado comissionado = new Comissionado("Agatha", "Christie", 789, 250000);
        Empregado asComissionado = new AssalariadoComissionado("Daisy", "Jones", 963, 480500, 0);

        Conta titulo = new Titulo(20, 10, 850);
        Conta concessionaria = new Concessionaria(25, 11, 11000);

        ControlePagamento contasPagamento = new ControlePagamento();
        contasPagamento.addPagamento(assalariado);
        contasPagamento.addPagamento(terceirizado);
        contasPagamento.addPagamento(comissionado);
        contasPagamento.addPagamento(asComissionado);
        contasPagamento.addPagamento(titulo);
        contasPagamento.addPagamento(concessionaria);

        System.out.println("Total a pagar aos funcionários: " + contasPagamento.controleEmpregados());
        System.out.println("Total a pagar de contas: " + contasPagamento.controleContas(20, 10));
        System.out.println("Total a pagar no geral: " + contasPagamento.controlePagTotal(20, 10));
    }
}