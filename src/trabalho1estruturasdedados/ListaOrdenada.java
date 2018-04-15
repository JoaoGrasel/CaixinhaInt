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
	
	public void inserirOrdenado(IBuscavel elemento, int ID) {
		Caixa caixaInserida = new Caixa(elemento, ID);
		if(this.quantidade == 0) {
			this.primeira = caixaInserida;
			this.ultima = caixaInserida;
			this.quantidade++;
		} else {
			inserirFake(elemento);
			Caixa caixaAtual = this.primeira;
			while(elemento > caixaAtual.getElemento()) {
				caixaAtual = caixaAtual.getProxima();
			}
			Caixa caixaAnterior = caixaAtual.getAnterior();
			caixaAnterior.setProxima(caixaInserida);
			caixaAtual.setAnterior(caixaInserida);
			removerFake();
		}
	}
	
	private void inserirFake(IBuscavel elemento) {	
		Caixa caixaFake = new Caixa(elemento, 0);
		this.ultima.setProxima(caixaFake);
		this.primeira.setAnterior(caixaFake);
		caixaFake.setProxima(this.primeira);
		caixaFake.setAnterior(this.ultima);			
		this.ultima = caixaFake;
		this.quantidade++;
	}
	
	private void removerFake() {
		Caixa caixaAnterior = this.ultima.getAnterior();
		caixaAnterior.setProxima(this.primeira);
		this.primeira.setAnterior(caixaAnterior);
		this.ultima = caixaAnterior;
		this.quantidade--;
	}

	public void imprimeListaOrdenada() {
		Caixa caixaImpressa = this.primeira;		
		for(int i = 0; i < this.quantidade; i++){
			System.out.println(caixaImpressa.getElemento());
			caixaImpressa = caixaImpressa.getProxima();
		}
	}
	
}