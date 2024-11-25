public class Heranca {
    public static void main(String[] args){
        Carro c1 = new Carro("Megane");

        c1.setLigado(true);
        c1.info();

        CarroCombate c2 = new CarroCombate("Pantera", 100);
        CarroCombate c3 = new CarroCombate("Leopardo", 75);

        c2.setQntArmamento(45);
        c2.sofrerDano(101);

        c3.setQntArmamento(20);
        c3.atirar();
        c3.atirar();
        c3.atirar();
        
        c2.info();
        c3.info();

        Aviao v1 = new Aviao("Tucano", 1);
        v1.info();
    }
}
