package poo.com.mastersoft.lanchonete.atendente;

import poo.com.mastersoft.lanchonete.atendente.cozinha.Cozinheiro;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO A MESA");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GÁS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
		}
}