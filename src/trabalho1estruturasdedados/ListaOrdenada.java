/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

/**
 *
 * @author thiagobrezinski
 */
public class ListaOrdenada extends ListaSimples {

	public ListaOrdenada() {
		super();
	}
	
	public void inserirOrdenado(IBuscavel elemento) {
		Caixa caixaInserida = new Caixa(elemento);
		if(this.quantidade == 0) {
			this.primeira = caixaInserida;
			this.ultima = caixaInserida;
			this.atual = caixaInserida;
			this.quantidade++;
		} else {
			inserirFake(elemento);
			Caixa caixaAtual = this.primeira;
			while(elemento.getID() > caixaAtual.getElemento().getID()) {
				caixaAtual = caixaAtual.getProxima();
			}
			if(caixaAtual.equals(this.primeira)) {
				caixaAtual.setAnterior(caixaInserida);
				caixaInserida.setProxima(caixaAtual);
				caixaInserida.setAnterior(this.ultima);
				this.ultima.setProxima(caixaInserida);
			} else {
				Caixa caixaAnterior = caixaAtual.getAnterior();
				caixaAnterior.setProxima(caixaInserida);
				caixaAtual.setAnterior(caixaInserida);

				caixaInserida.setAnterior(caixaAnterior);
				caixaInserida.setProxima(caixaAtual);	
			}
			removerFake();
			this.quantidade++;
		}
	}
	
	private void inserirFake(IBuscavel elemento) {	
		Caixa caixaFake = new Caixa(elemento);
		this.ultima.setProxima(caixaFake);
		this.primeira.setAnterior(caixaFake);
		caixaFake.setProxima(this.primeira);
		caixaFake.setAnterior(this.ultima);			
		this.ultima = caixaFake;
		this.quantidade++;
	}
	
	private void removerFake() {
//		if(this.quantidade == 2) {
//			this.primeira.setProxima(null);
//			this.primeira.setAnterior(null);
//			this.ultima = this.primeira;
//		} else {
			Caixa caixaAnterior = this.ultima.getAnterior();
			caixaAnterior.setProxima(this.primeira);
			this.primeira.setAnterior(caixaAnterior);
			this.ultima = caixaAnterior;	
//		}
		this.quantidade--;
	}

	public void imprimeListaOrdenada() {
		Caixa caixaImpressa = this.primeira;
		for(int i = 0; i < this.quantidade; i++){
			System.out.println(caixaImpressa.getElemento().getID());
			caixaImpressa = caixaImpressa.getProxima();
		}
	}
	
}