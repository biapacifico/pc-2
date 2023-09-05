package sistemaSupermercado;

public class Venda {
    
    private ItemDeProduto[] carrinho;
    private int posicaoCarrinho;

    public Venda (){
        posicaoCarrinho = 0;
        carrinho = new ItemDeProduto[100];
    }

    public Venda (ItemDeProduto[] carrinho, int posicaoCarrinho) {
        this.carrinho = carrinho;
        this.posicaoCarrinho = posicaoCarrinho;
    }

    public void setCarrinho (ItemDeProduto[] carrinho) {
        this.carrinho = carrinho;
    }

    public ItemDeProduto[] getCarrinho () {
        return carrinho;
    }

    public void setPosicaoCarrinho (int posicaoCarrinho) {
        this.posicaoCarrinho = posicaoCarrinho;
    }

    public int getPosicaoCarrinho () {
        return posicaoCarrinho;
    }

    public boolean addProdutoCarrinho (ItemDeProduto produto){
        carrinho[posicaoCarrinho] = produto;
        posicaoCarrinho++;
        return true;
    }

    public double calculaValor (){
        double valor=0;
        for (int i=0; i<carrinho.length; i++){
            if (carrinho[i]!=null){
                valor += carrinho[i].getProduto().getPreco()*carrinho[i].getQuantidade();
            }
        }
        return valor;
    }
}