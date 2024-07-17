package poo.com.mastersoft.clientes;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos", "3923942340");

        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
