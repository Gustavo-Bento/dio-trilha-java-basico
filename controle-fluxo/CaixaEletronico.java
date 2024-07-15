public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 16.0;
        double valorSolitado = 17.0;

        if(valorSolitado < saldo){
            saldo -= valorSolitado;
            System.out.println("Novo saldo: "+saldo);
        }
        else
            System.out.println("Saldo insuficiente");
    }
}
