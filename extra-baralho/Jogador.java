public class Jogador {
    
    private Carta[] mao;

    public Jogador (){
        mao = new Carta[0];
    }

    public void setMao (Carta[] mao){
        this.mao = mao;
    }

    public Carta[] getMao (){
        return mao;
    }

    public Carta escolherCarta (int numCartas){
        Carta maiorCarta = mao[0];
        for (int i=0; i<numCartas; i++){
            if (mao[i].comparaValor(maiorCarta)==1){
                maiorCarta = mao[i];
            }
        }
        return maiorCarta;
    }
}