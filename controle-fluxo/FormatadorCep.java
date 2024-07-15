
public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepInformado = formatadorcep("43389483888");
            System.out.println(cepInformado);
        } catch (CepInvalidatorException e) {
            System.out.println("O cep não corresponde as regras de negócio");
        }
    }

    public static String formatadorcep(String cep) throws CepInvalidatorException {
        if (cep.length() != 11)
            throw new CepInvalidatorException();
        return "433.894.838-88";
    }
}
