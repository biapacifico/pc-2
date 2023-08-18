public class Teste {

    public static void main (String[] args){

        Carta carta1 = new Carta();
        carta1.setValor(5);
        carta1.setNaipe("Paus");

        Carta carta2 = new Carta(10, "Espadas");

        Carta carta3 = new Carta();
        carta3.setValor(10);
        carta3.setNaipe("Paus");

        Carta carta4 = new Carta(5, "Copas");

        System.out.println(carta1.comparaValor(carta2));
        System.out.println(carta1.comparaNaipe(carta3));
        System.out.println(carta4.comparaNaipe(carta3));
        System.out.println(carta2.comparaValor(carta4));
    }
}