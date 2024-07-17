package poo.com.mastersoft.fabrica.estabelecimento;

import poo.com.mastersoft.fabrica.copiadora.Copiadora;
import poo.com.mastersoft.fabrica.copiadora.Xerox;
import poo.com.mastersoft.fabrica.digtalizadora.Scanner;
import poo.com.mastersoft.fabrica.impressora.Deskjet;
import poo.com.mastersoft.fabrica.impressora.Impressora;
import poo.com.mastersoft.fabrica.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultiFuncional();
        Copiadora copiadora = new Xerox();
        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner();

        impressora = deskjet;

        impressora.imprimir();
    }
}
