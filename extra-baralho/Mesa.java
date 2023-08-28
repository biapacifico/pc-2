import java.util.Scanner;

public class Mesa {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de cartas a distribuir para cada jogador: ");
        int numCartas = input.nextInt();

        Baralho jogando = new Baralho();
        jogando.embaralharCartas();

        Jogador jogadorA = new Jogador(); 
        jogadorA.setMao(jogando.distribuirCartas(numCartas));
        
        Jogador jogadorB = new Jogador();
        jogadorB.setMao(jogando.distribuirCartas((numCartas*2)));

        System.out.println("Mesa distribuiu as " + numCartas + " cartas para jogador A e para o jogador B.");

        int valorA = jogadorA.escolherCarta(numCartas).getValor();
        int valorB = jogadorB.escolherCarta(numCartas).getValor();
        String naipeA = jogadorA.escolherCarta(numCartas).getNaipe();
        String naipeB = jogadorB.escolherCarta(numCartas).getNaipe();

        System.out.println("O jogador A jogou a carta de naipe " + naipeA + " e de valor " + valorA);
        System.out.println("O jogador B jogou a carta de naipe " + naipeB + " e de valor " + valorB);

        if (valorA>valorB){
            System.out.println("O jogador A venceu o jogo");
        }
        else if (valorA<valorB){
            System.out.println("O jogador B venceu o jogo");
        }
        else if (valorA==valorB && naipeA.equals("Ouros")){
            System.out.println("O jogador A venceu o jogo");
        }
        else if (valorA==valorB && naipeB.equals("Ouros")){
            System.out.println("O jogador B venceu o jogo");
        }
        else {
            System.out.println("Empate!");
        }

        /*for (int i=0; i<5; i++){
            System.out.println(jogadorA.getMao()[i].getNaipe() + jogadorA.getMao()[i].getValor());
        }

        for (int i=0; i<5; i++){
            System.out.println(jogadorB.getMao()[i].getNaipe() + jogadorB.getMao()[i].getValor());
        }*/

        input.close();
    }
}