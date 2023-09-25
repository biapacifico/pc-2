package principal2D;

public class Triangulo extends Forma {
    
    public Triangulo (Ponto2D[] pontos){
        super(pontos);
    }

    @Override
    public double calculaArea() {
        double lado1 = pontos[0].calculaDistancia(pontos[1]);
        double lado2 = pontos[1].calculaDistancia(pontos[2]);
        double lado3 = pontos[2].calculaDistancia(pontos[0]);

        double semiPerimento = (lado1+lado2+lado3)/2;
        double areaTriangulo = Math.sqrt(semiPerimento*(semiPerimento-lado1)*(semiPerimento-lado2)*(semiPerimento-lado3));
    
        return areaTriangulo;
    }

    @Override
    public double calculaPerimetro() {
        double lado1 = pontos[0].calculaDistancia(pontos[1]);
        double lado2 = pontos[1].calculaDistancia(pontos[2]);
        double lado3 = pontos[2].calculaDistancia(pontos[0]);

        double perimetroTriangulo = lado1+lado2+lado3;
        
        return perimetroTriangulo;
    }

    public String tipoTriangulo (){
        double lado1 = pontos[0].calculaDistancia(pontos[1]);
        double lado2 = pontos[1].calculaDistancia(pontos[2]);
        double lado3 = pontos[2].calculaDistancia(pontos[0]);

        if (lado1==lado2 && lado2==lado3){
            return "Equilátero";
        }
        else if (lado1==lado2 || lado2==lado3 || lado1==lado3){
            return "Isósceles";
        }
        else {
            return "Escaleno";
        }
    }
}