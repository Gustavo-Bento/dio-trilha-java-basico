package poo.com.mastersoft.messenger;

public class MSNMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");   
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo MSN Messenger");    
    }

    @Override
    protected void salvarHistorico() {
        // TODO Auto-generated method stub
        
    }
	
}