package sistemaSupermercado;

public class Estoque {

    private ItemDeProduto[] estante;
    private int limite;
    private int inseridos;

    public Estoque (){
        limite = 100;
        inseridos = 0;
        estante = new ItemDeProduto[limite];
    }

    public Estoque (ItemDeProduto[] estante, int limite, int inseridos){
        this.estante = estante;
        this.limite = limite;
        this.inseridos = inseridos;
    }

    public void setEstante (ItemDeProduto[] estante){
        this.estante = estante;
    }

    public ItemDeProduto[] getEstante (){
        return estante;
    }

    public boolean addItemDeProduto (ItemDeProduto produto){
        if (inseridos<limite){
            estante[inseridos] = produto;
            inseridos++;
            return true;
        }
        return false;
    }

    public boolean verificaProdutoEstante (ItemDeProduto produto){
        for (int i=0; i<estante.length; i++){
            if (estante[i]!=null && estante[i].verificaProduto(produto)){
                return true;
            }
        }
        return false;
    }

    public ItemDeProduto verificaCodigo (int codigo){
        int i=0;
        for (i=0; i<estante.length; i++){
            if (estante[i]!=null && estante[i].getProduto().getCodigo()==codigo){
                return estante[i];
            }
        }
        return null;
    }

    public boolean retiraQuantidade (int codigo, int quantidade){
        int novaQuantidade;
        for (int i=0; i<estante.length; i++){
            if (estante[i]!=null && estante[i].getProduto().getCodigo()==codigo){
                novaQuantidade = estante[i].getQuantidade()-quantidade;
                estante[i].setQuantidade(novaQuantidade);
                return true;
            }
        }
        return false;
    }
}