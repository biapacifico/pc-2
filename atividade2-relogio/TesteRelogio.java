import java.util.Scanner;

public class TesteRelogio {
    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Deseja visualizar no formato 12h ou 24h?");
        String respFormato = input.next();

        Relogio rolex = new Relogio();
        rolex.setFormatoDisplay(respFormato);

        if (respFormato.equals("24h")){
            rolex.getHora().setLimite(24);
            rolex.getMinuto().setLimite(60);

            for (int h=0; h<24; h++){
                for (int m=0; m<60; m++){
                    rolex.ticTac();
                    System.out.print(rolex.getHora().getValor() + " : ");
                    System.out.println(rolex.getMinuto().getValor());
                }
            }
        }

        if (respFormato.equals("12h")){
            rolex.getHora().setLimite(12);
            rolex.getMinuto().setLimite(60);
            String periodo = " a.m";

            for (int h=0; h<24; h++){
                if (h==12){
                    periodo = " p.m";
                }
                for (int m=0; m<60; m++){
                    rolex.ticTac();
                    System.out.print(rolex.getHoraFormatada() + " : ");
                    System.out.println(rolex.getMinuto().getValor() + periodo);
                }
            }
        }

        input.close();
    }
}