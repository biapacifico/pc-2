import sistemaSupermercado.*;
import java.util.Scanner;

public class Caixa {
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto(11111, "Detergente ABC", 1.00);
        Produto produto2 = new Produto(22222, "Sabão em pó OMO", 6.50);
        Produto produto3 = new Produto(33333, "Shampoo Beleza Fácil", 12.00);
        Produto produto4 = new Produto(44444, "Creme dental Colgate", 3.50);
        Produto produto5 = new Produto(55555, "Sabonete Nívea", 1.80);
        Produto produto6 = new Produto(66666, "Biscoito Maizena", 2.00);
        Produto produto7 = new Produto(77777, "Leite desnatado Parmalat", 3.00);
        
        Estoque estoque = new Estoque();
        estoque.addItemDeProduto (new ItemDeProduto(produto1, 10));
        estoque.addItemDeProduto (new ItemDeProduto(produto2, 15));
        estoque.addItemDeProduto (new ItemDeProduto(produto3, 25));
        estoque.addItemDeProduto (new ItemDeProduto(produto4, 20));
        estoque.addItemDeProduto (new ItemDeProduto(produto5, 30));
        estoque.addItemDeProduto (new ItemDeProduto(produto6, 15));
        estoque.addItemDeProduto (new ItemDeProduto(produto7, 10));

        Venda venda = new Venda();
        int codigoProduto;
        do {
            System.out.print("Digite o código do produto desejado: ");
            codigoProduto = input.nextInt();           
            ItemDeProduto produtoCompra = estoque.verificaCodigo(codigoProduto);
            if (produtoCompra!=null) {
                System.out.print("Digite a quantidade desejada: ");
                int qntProduto = input.nextInt();                
                ItemDeProduto compra = new ItemDeProduto(produtoCompra.getProduto(), qntProduto);                
                if (estoque.verificaProdutoEstante(compra)){
                    venda.addProdutoCarrinho(compra);
                    estoque.retiraQuantidade(codigoProduto, qntProduto);
                }
                else {
                    System.out.println("Estoque insuficiente.");
                }
            } 
            else {
                System.out.println("Código inválido.");
            }
        } while (codigoProduto!=0);
        
        System.out.println("Valor total: " + venda.calculaValor());

        input.close();
    }
}