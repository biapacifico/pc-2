package principal2D;

import java.util.ArrayList;

public class Espaco2D {
    
    private ArrayList<Forma> formas;

    public Espaco2D (){
        formas = new ArrayList<>();
    }

    public Espaco2D (ArrayList<Forma> formas){
        this.formas = formas;
    }

    public ArrayList<Forma> getFormas (){
        return formas;
    }

    public void setFormas (ArrayList<Forma> formas){
        this.formas = formas;
    }

    public Forma geraForma (Ponto2D[] pontos){
        return Forma.geraForma(pontos);
    }

    public void addForma (Forma forma){
        formas.add(forma);
    }

    public double calculaAreaTotal (){
        double areaTotal=0;

        for (Forma areaIndividual : formas){
            if (areaIndividual instanceof Quadrado){
                areaTotal+=((Quadrado)areaIndividual).calculaArea();
            }
            else if (areaIndividual instanceof Circulo){
                areaTotal+=((Circulo)areaIndividual).calculaArea();
            }
            else if (areaIndividual instanceof Triangulo){
                areaTotal+=((Triangulo)areaIndividual).calculaArea();
            }
        }

        return areaTotal;
    }

    public double calculaPerimetroTotal (){
        double perimetroTotal=0;

        for (Forma perimetroIndividual : formas){
            if (perimetroIndividual instanceof Quadrado){
                perimetroTotal+=((Quadrado)perimetroIndividual).calculaPerimetro();
            }
            else if (perimetroIndividual instanceof Circulo){
                perimetroTotal+=((Circulo)perimetroIndividual).calculaPerimetro();
            }
            else if (perimetroIndividual instanceof Triangulo){
                perimetroTotal+=((Triangulo)perimetroIndividual).calculaPerimetro();
            }
        }

        return perimetroTotal;
    }

    public String mostraTipoTriangulo (){
        String tipo = "";

        for (Forma formaIndividual : formas){
            if (formaIndividual instanceof Triangulo){
                tipo = ((Triangulo)formaIndividual).tipoTriangulo();
            }
        }

        return tipo;
    }
}