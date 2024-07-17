package poo.com.mastersoft.messenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {
        System.out.println("\nMSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
        System.out.println("\nFacebook");
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();
        System.out.println("\nTelegram");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
	}
}