package sistemaSupermercado;

public class ItemDeProduto {
    
    private Produto produto;
    private int quantidade;

    public ItemDeProduto (){
        produto = new Produto();
        quantidade = 0;
    }

    public ItemDeProduto (Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setProduto (Produto produto){
        this.produto = produto;
    }

    public Produto getProduto (){
        return produto;
    }

    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade (){
        return quantidade;
    }

    public boolean verificaProduto (ItemDeProduto produto){
        if (produto.getProduto().getCodigo()==this.produto.getCodigo() && produto.getQuantidade()<=this.getQuantidade()){
            return true;
        }
        return false;
    }
}