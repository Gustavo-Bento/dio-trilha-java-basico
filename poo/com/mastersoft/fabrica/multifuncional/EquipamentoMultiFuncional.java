package poo.com.mastersoft.fabrica.multifuncional;

import poo.com.mastersoft.fabrica.copiadora.Copiadora;
import poo.com.mastersoft.fabrica.digtalizadora.Digitalizadora;
import poo.com.mastersoft.fabrica.impressora.Impressora;

public class EquipamentoMultiFuncional implements Digitalizadora, Copiadora, Impressora {

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando pelo equipamento multifuncional");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando pelo equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pelo equipamento multifuncional");
    }
    
}
