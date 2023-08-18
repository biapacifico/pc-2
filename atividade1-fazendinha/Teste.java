public class Teste {

    public static void main (String[] args){

        Vaca gado1 = new Vaca();
        gado1.setNome("Leitão");
        gado1.setCorPelo("Branco");
        gado1.setConsumo(75.2);
        gado1.setTipoMugido("Grosso");

        Vaca gado2 = new Vaca();
        gado2.setNome("Cacau");
        gado2.setCorPelo("Marrom");
        gado2.setConsumo(70.8);
        gado2.setTipoMugido("Fino");

        Vaca gado3 = new Vaca();
        gado3.setNome("Galo Doido");
        gado3.setCorPelo("Preto e Branco");
        gado3.setConsumo(90.1);
        gado3.setTipoMugido("Forte");

        double consumoTotalGado;
        consumoTotalGado = (gado1.getConsumo() + gado2.getConsumo() + gado3.getConsumo())*30;
        System.out.println ("Ração total para gado ao mês: " + consumoTotalGado + " Kg");

        //System.out.println ("Nome: " + gado1.getNome() + ", Pelo: " + gado1.getCorPelo() + ", Consumo: " + gado1.getConsumo() + ", Mugido: " + gado1.getTipoMugido());
        //System.out.println ("Nome: " + gado2.getNome() + ", Pelo: " + gado2.getCorPelo() + ", Consumo: " + gado2.getConsumo() + ", Mugido: " + gado2.getTipoMugido());
        
        Cavalo cavalo1 = new Cavalo();
        cavalo1.setNome("Pretinho");
        cavalo1.setCorPelo("Preto");
        cavalo1.setConsumo(85);
        cavalo1.setVelocidadeMedia(60);

        Cavalo cavalo2 = new Cavalo();
        cavalo2.setNome("Alazão");
        cavalo2.setCorPelo("Avermelhado");
        cavalo2.setConsumo(89.5);
        cavalo2.setVelocidadeMedia(52);

        double consumoTotalCavalo;
        consumoTotalCavalo = (cavalo1.getConsumo() + cavalo2.getConsumo())*30;
        System.out.println ("Ração total para cavalo ao mês: " + consumoTotalCavalo + " Kg");

        Galinha galinha1 = new Galinha();
        galinha1.setNome("Ourilha");
        galinha1.setCorPena("Dourada");
        galinha1.setConsumo(5.4);
        galinha1.setTipoOvo("Caipira");

        Galinha galinha2 = new Galinha();
        galinha2.setNome("Caucária");
        galinha2.setCorPena("Branca");
        galinha2.setConsumo(6);
        galinha2.setTipoOvo("Jumbo");

        Galinha galinha3 = new Galinha();
        galinha3.setNome("Chocoleta");
        galinha3.setCorPena("Marrom");
        galinha3.setConsumo(9.7);
        galinha3.setTipoOvo("Orgânico");

        Galinha galinha4 = new Galinha();
        galinha4.setNome("Graxilda");
        galinha4.setCorPena("Preta");
        galinha4.setConsumo(4.8);
        galinha4.setTipoOvo("Caipira");

        Galinha galinha5 = new Galinha();
        galinha5.setNome("Anjuda");
        galinha5.setCorPena("Branca");
        galinha5.setConsumo(9.1);
        galinha5.setTipoOvo("Jumbo");

        double consumoTotalGalinha;
        consumoTotalGalinha = (galinha1.getConsumo() + galinha2.getConsumo() + galinha3.getConsumo() + galinha4.getConsumo() + galinha5.getConsumo())*30;
        System.out.println ("Ração total para galinhas ao mês: " + consumoTotalGalinha + " Kg");

        double consumoTotalGeral;
        consumoTotalGeral = consumoTotalGado + consumoTotalCavalo + consumoTotalGalinha;
        System.out.println ("Ração total para os animais ao mês: " + consumoTotalGeral + " Kg");
    }
}