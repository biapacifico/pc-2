package principal2D;

public abstract class Forma {
    
    protected Ponto2D[] pontos;

    public Forma (){
        pontos = null;
    }

    public Forma (Ponto2D[] pontos){
        this.pontos = pontos;
    }

    public Ponto2D[] getPontos (){
        return pontos;
    }

    public void setPontos (Ponto2D[] pontos){
        this.pontos = pontos;
    }

    public abstract double calculaArea ();

    public abstract double calculaPerimetro ();

    public static int contaPosicoes (Ponto2D[] pontos){
        int cont=0;

        for (Ponto2D ponto : pontos){
            if (ponto!=null){
                cont++;
            }
        }

        return cont;
    }

    public static Forma geraForma (Ponto2D[] pontos){
        Forma forma = null;

        //circulo
        if (pontos!=null){
            if (contaPosicoes(pontos)==2){
                if (pontos[0].calculaDistancia(pontos[1])!=0){
                    forma = new Circulo(pontos);
                }
                else {
                    System.out.println("Não é um círculo.");
                }
            }
        }

        //triangulo
        if (pontos!=null){
            if (contaPosicoes(pontos)==3){
                double distancia1 = pontos[0].calculaDistancia(pontos[1]);
                double distancia2 = pontos[1].calculaDistancia(pontos[2]);
                double distancia3 = pontos[2].calculaDistancia(pontos[0]);
                if (distancia1!=0 && distancia2!=0 && distancia3!=0){
                    double cont=0;
                    if ((distancia1+distancia2)>distancia3){
                        cont++;
                    }
                    if ((distancia1+distancia3)>distancia2){
                        cont++;
                    }
                    if ((distancia2+distancia3)>distancia1){
                        cont++;
                    }
                    if (cont==3){
                        forma = new Triangulo(pontos);
                    }
                    else {
                        System.out.println("Não é um triângulo.");
                    }
                }
            }
        }

        //quadrado
        if (pontos!=null){
            if (contaPosicoes(pontos)==4){
                double distancia1 = pontos[0].calculaDistancia(pontos[1]);
                double distancia2 = pontos[1].calculaDistancia(pontos[2]);
                double distancia3 = pontos[2].calculaDistancia(pontos[3]);
                double distancia4 = pontos[3].calculaDistancia(pontos[0]);
                if (distancia1==distancia2 && distancia2==distancia3 && distancia3==distancia4){
                    forma = new Quadrado(pontos);
                }
                else {
                    System.out.println("Não é um quadrado.");
                }
            }
        }

        return forma;
    }
}