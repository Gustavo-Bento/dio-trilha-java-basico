/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matematicas entre número inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação dessas classes
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author: Gustavo Ferreira
 * @version: 1.0
 * @since: 13/07/2024
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro número do método
     * @param numeroDois este é o segundo número do método
     * @return int o resultado deste método é a soma dos dois números
     */

    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    /*
     * Este metodo foi elaborado as pressas
     * por isso eu abreviei o nome das variváveis
     * mas olha, ele tem a finalidade de somar ou multiplicar
     * dois números
p     */
    public int somarMultiplicar(int n, int x, String m) {
        int r = 0; // r é igual ao resultado
        if (m == "M") // M = multiplicação
            r = n * x;
        else
            // se não soma mesmo
            r = n + x;
        return r;

    }

}
