public class Operadores {

    public static void main(String[] args) {
        
        String nome1 = "Gustavo";
        String nome2 = new String("Gustavo");

        System.out.println(nome1.equals(nome2));

        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1==n2;

        if(n1 < n2)
            System.out.println("A nossa condição é verdadeira");

        System.out.println("Numero um é igual a numero dois? "+simNao);

        simNao = n1!=n2;

        System.out.println("Numero um é diferente a numero dois? "+simNao);

        simNao = n1>n2;

        System.out.println("Numero um é maior a numero dois? "+simNao);

        simNao = n1<n2;

        System.out.println("Numero um é menor a numero dois? "+simNao);

        simNao = n1>=n2;

        System.out.println("Numero um é maior ou igual a numero dois? "+simNao);

        simNao = n1<=n2;

        System.out.println("Numero um é menor ou igual   a numero dois? "+simNao);

    }
}