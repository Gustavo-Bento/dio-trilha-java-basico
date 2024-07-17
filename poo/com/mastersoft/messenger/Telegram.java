package poo.com.mastersoft.messenger;

public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");    
    }

    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");    
    }

    @Override
    protected void salvarHistorico() {
        // TODO Auto-generated method stub
        
    }
   
}
