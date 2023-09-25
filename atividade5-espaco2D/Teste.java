import principal2D.*;

public class Teste {

    public static void main (String[] args){        

        Ponto2D[] pontos = new Ponto2D[4];
        Espaco2D espaco = new Espaco2D();

        //circulo
        pontos[0] = new Ponto2D(2, 1);
        pontos[1] = new Ponto2D(3, 2);
        espaco.addForma(espaco.geraForma(pontos));

        //quadrado
        pontos[0] = new Ponto2D(0, 0);
        pontos[1] = new Ponto2D(0, 1);
        pontos[2] = new Ponto2D(1, 1);
        pontos[3] = new Ponto2D(1, 0);
        espaco.addForma(espaco.geraForma(pontos));

        //triangulo
        pontos[0] = new Ponto2D(0, 0);
        pontos[1] = new Ponto2D(4, 0);
        pontos[2] = new Ponto2D(2, 3);
        pontos[3] = null;
        espaco.addForma(espaco.geraForma(pontos));

        System.out.println(espaco.calculaAreaTotal());
        System.out.println(espaco.calculaPerimetroTotal());
        System.out.println(espaco.mostraTipoTriangulo());
    }
}