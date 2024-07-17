package poo.com.mastersoft.autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("239411");
        jeep.ligar();

        Moto cb500 = new Moto();
        jeep.setChassi("232341");
        cb500.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
