
public class Comentarios {
    public static void main(String [] args){
        Calculadora cal = new Calculadora();

        System.out.println(cal.somar(2, 2));
        
        //Olá, eu sou um comentário em uma única 

        /*
         * Olá 
         * Eu sou um comentário mais detalhado
         * quando necessario
         */
    }
     
    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um documentario
     * a nível de documentação.
     * Que incrivel!
     */

     /*javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java */
    public void metodo(){
        
    }
}
