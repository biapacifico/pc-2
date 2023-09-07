import sistemaSuporte.*;
import java.util.Scanner;

public class CallCenter {

    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        Interpretadora interpretadora = new Interpretadora();
        SuporteTecnico suporteTecnico = new SuporteTecnico();

        System.out.println("Bem-vindo ao sistema de Suporte Técnico.");

        while (true){
            System.out.print("Pressione <enter> para continuar ou digite 'sair' para sair do sistema: ");
            String encerraSistema = input.nextLine();

            if (encerraSistema.equals("sair")){
                System.out.println("Obrigada por utilizar o nosso serviço!");
                break;
            }
            else if (encerraSistema.isEmpty()){
                System.out.println("Descreva seu problema de maneira sucinta.");
                String respostaCliente = input.nextLine();
                if (suporteTecnico.buscaSolucao(interpretadora.separaPalavras(respostaCliente)).equals("")==false){
                    System.out.println(suporteTecnico.buscaSolucao(interpretadora.separaPalavras(respostaCliente)));
                }
                else {
                    System.out.println(suporteTecnico.buscaSolucaoPadrao());
                }
            }
        }

        input.close();
    }
}