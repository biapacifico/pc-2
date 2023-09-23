import principal_Bianca.*;

public class Teste {

    public static void main(String[] args) {
        
        Imovel imovelApt = new Imovel();
        imovelApt.setValorDia(25.50);
        imovelApt.setProprietario("Sherlock Holmes");
        imovelApt.setDescricao("Apartamento na rua Backer Street, Londres.");

        Imovel imovelCasa = new Imovel();
        imovelCasa.setValorDia(13.80);
        imovelCasa.setProprietario("Reginaldo Santos");
        imovelCasa.setDescricao("Casa no condomínio 'Cristal da Vida'");

        Cliente cliente1 = new Cliente("Rosa", "3199999999");
        Cliente cliente2 = new Cliente("Luna", "3188888888");
        Cliente cliente3 = new Cliente("Sol", "3177777777");
        Cliente cliente4 = new Cliente("Loki", "3155555555");

        Hospedagem hospedagemCasa1 = new Hospedagem();
        hospedagemCasa1.addCliente(cliente1);
        hospedagemCasa1.addCliente(cliente2);
        hospedagemCasa1.setDataHospedagem("21/09/2023");
        hospedagemCasa1.setDiasHospedados(5);
        hospedagemCasa1.setImovel(imovelCasa);
        imovelCasa.calculaPagamentoRecebido(hospedagemCasa1.pagamentoPrestador(imovelCasa.getValorDia()));
        imovelCasa.calculaPagamentoAdm(hospedagemCasa1.pagamentoAdm(imovelCasa.getValorDia()));

        Hospedagem hospedagemCasa2 = new Hospedagem();
        hospedagemCasa2.addCliente(cliente3);
        hospedagemCasa2.addCliente(cliente4);
        hospedagemCasa2.setDataHospedagem("25/09/2023");
        hospedagemCasa2.setDiasHospedados(3);
        hospedagemCasa2.setImovel(imovelCasa);
        imovelCasa.calculaPagamentoRecebido(hospedagemCasa2.pagamentoPrestador(imovelCasa.getValorDia()));
        imovelCasa.calculaPagamentoAdm(hospedagemCasa2.pagamentoAdm(imovelCasa.getValorDia()));

        Hospedagem hospedagemCasa3 = new Hospedagem();
        hospedagemCasa3.addCliente(cliente2);
        hospedagemCasa3.setDataHospedagem("30/09/2023");
        hospedagemCasa3.setDiasHospedados(10);
        hospedagemCasa3.setImovel(imovelCasa);
        imovelCasa.calculaPagamentoRecebido(hospedagemCasa3.pagamentoPrestador(imovelCasa.getValorDia()));
        imovelCasa.calculaPagamentoAdm(hospedagemCasa3.pagamentoAdm(imovelCasa.getValorDia()));

        System.out.println("Pagamento total do imóvel casa para o prestador: " + imovelCasa.getPagamentos());
        System.out.println("Pagamento total do imóvel casa para a adm: " + imovelCasa.getPagamentosAdm());

        Hospedagem hospedagemApt1 = new Hospedagem();
        hospedagemApt1.addCliente(cliente1);
        hospedagemApt1.addCliente(cliente2);
        hospedagemApt1.setDataHospedagem("10/09/2023");
        hospedagemApt1.setDiasHospedados(10);
        hospedagemApt1.setImovel(imovelApt);
        imovelApt.calculaPagamentoRecebido(hospedagemApt1.pagamentoPrestador(imovelApt.getValorDia()));
        imovelApt.calculaPagamentoAdm(hospedagemApt1.pagamentoAdm(imovelApt.getValorDia()));

        Hospedagem hospedagemApt2 = new Hospedagem();
        hospedagemApt2.addCliente(cliente1);
        hospedagemApt2.addCliente(cliente2);
        hospedagemApt2.setDataHospedagem("15/09/2023");
        hospedagemApt2.setDiasHospedados(15);
        hospedagemApt2.setImovel(imovelApt);
        imovelApt.calculaPagamentoRecebido(hospedagemApt2.pagamentoPrestador(imovelApt.getValorDia()));
        imovelApt.calculaPagamentoAdm(hospedagemApt2.pagamentoAdm(imovelApt.getValorDia()));

        Hospedagem hospedagemApt3 = new Hospedagem();
        hospedagemApt3.addCliente(cliente1);
        hospedagemApt3.addCliente(cliente2);
        hospedagemApt3.setDataHospedagem("20/09/2023");
        hospedagemApt3.setDiasHospedados(5);
        hospedagemApt3.setImovel(imovelApt);
        imovelApt.calculaPagamentoRecebido(hospedagemApt3.pagamentoPrestador(imovelApt.getValorDia()));
        imovelApt.calculaPagamentoAdm(hospedagemApt3.pagamentoAdm(imovelApt.getValorDia()));

        System.out.println("Pagamento total do imóvel apartamento para o prestador: " + imovelApt.getPagamentos());
        System.out.println("Pagamento total do imóvel apartamento para a adm: " + imovelApt.getPagamentosAdm());
    }
}