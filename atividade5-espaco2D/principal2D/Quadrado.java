package principal2D;

public class Quadrado extends Forma {
    
    public Quadrado (Ponto2D[] pontos){
        super(pontos);
    }

    @Override
    public double calculaArea() {
        double areaQuadrado;

        areaQuadrado = Math.pow(pontos[0].calculaDistancia(pontos[1]), 2);

        return areaQuadrado;
    }

    @Override
    public double calculaPerimetro() {
        double perimetroQuadrado;

        perimetroQuadrado = 4*(pontos[0].calculaDistancia(pontos[1]));

        return perimetroQuadrado;
    }
}