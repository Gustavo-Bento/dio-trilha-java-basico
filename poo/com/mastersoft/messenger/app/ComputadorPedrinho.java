package poo.com.mastersoft.messenger.app;

import java.util.Scanner;

import poo.com.mastersoft.messenger.FacebookMessenger;
import poo.com.mastersoft.messenger.MSNMessenger;
import poo.com.mastersoft.messenger.ServicoMensagemInstantanea;
import poo.com.mastersoft.messenger.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fb"))
            smi = new FacebookMessenger();
        else
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
	}
}