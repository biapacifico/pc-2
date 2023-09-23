package principal_Bianca;

import java.util.ArrayList;

public class Hospedagem {

    private ArrayList<Cliente> clientes;
    private Imovel imovel;
    private int diasHospedados;
    private String dataHospedagem;

    public Hospedagem (){
        clientes = new ArrayList<>();
        imovel = null;
        diasHospedados = 0;
        dataHospedagem = "";
    }

    public Hospedagem (ArrayList<Cliente> clientes, Imovel imovel, int diasHospedados, String dataHospedagem){
        this.clientes = clientes;
        this.imovel = imovel;
        this.diasHospedados = diasHospedados;
        this.dataHospedagem = dataHospedagem;
    }

    public ArrayList<Cliente> getClientes (){
        return clientes;
    }

    public void setClientes (ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    public Imovel getImovel (){
        return imovel;
    }

    public void setImovel (Imovel imovel){
        this.imovel = imovel;
    }

    public int getDiasHospedados (){
        return diasHospedados;
    }

    public void setDiasHospedados (int diasHospedados){
        this.diasHospedados = diasHospedados;
    }

    public String getDataHospedagem (){
        return dataHospedagem;
    }

    public void setDataHospedagem (String dataHospedagem){
        this.dataHospedagem = dataHospedagem;
    }

    public void addCliente (Cliente cliente){
        for (Cliente addCliente : clientes){
            clientes.add(addCliente);
        }
    }

    public double pagamentoPrestador (double valorDia){
        double valorTotal;

        valorTotal = (valorDia*this.getDiasHospedados())*0.7;

        return valorTotal;
    }

    public double pagamentoAdm (double valorDia){
        double valorTotal;

        valorTotal = (valorDia*this.getDiasHospedados())*0.3;

        return valorTotal;
    }
}