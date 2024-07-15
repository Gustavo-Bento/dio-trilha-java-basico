public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolitado = 17.0;

        if(valorSolitado < saldo){
            saldo -= valorSolitado;
            System.out.println(saldo);
        }
    }
}
