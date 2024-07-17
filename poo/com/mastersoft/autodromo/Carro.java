package poo.com.mastersoft.autodromo;

public class Carro extends Veiculo{

    public void ligar(){
        conferirCambio();
        verificarCombustivel();
        System.out.println("Carro ligado");
    }
    private void verificarCombustivel(){
        System.out.println("Combustivel verificado");
    }
    private void conferirCambio(){
        System.out.println("Conferido cambio em P");
    }
    
}
