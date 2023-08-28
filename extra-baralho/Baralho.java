import java.security.SecureRandom;

public class Baralho {
    
    private Carta[] baralho;
    private String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};

    public Baralho (){
        baralho = new Carta[52];

        int posicao=0;
        for (int n=0; n<naipes.length; n++){
            for (int valorCarta=1; valorCarta<=13; valorCarta++){
                baralho[posicao] = new Carta(naipes[n], valorCarta);
                posicao++;
            }
        }
    }

    public Carta[] getBaralho (){
        return baralho;
    }

    public void embaralharCartas (){
        SecureRandom randomNumber = new SecureRandom();

        for (int i=0; i<100; i++){
            int posicaoAleatoria = randomNumber.nextInt(52);
            Carta aux = baralho[posicaoAleatoria];
            baralho[posicaoAleatoria] = baralho[i%51];
            baralho[i%51] = aux;
        }
    }

    public Carta[] distribuirCartas (int numCartas){
        Carta[] mao = new Carta[numCartas];

        int m=0;
        for (int i=0; i<numCartas; i++){
            if (baralho[i] != null){
                mao[m] = baralho[i];
                baralho[i] = null;
                m++;
            }
        }

        return mao;
    }
}