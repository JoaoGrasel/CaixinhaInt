/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class ListaSimples {
	
	protected Caixa atual;
	protected Caixa primeira;
	protected Caixa ultima;
	protected int quantidade;
	
	public ListaSimples() {
		this.atual = null;
		this.primeira = null;
		this.ultima = null;
		this.quantidade = 0;
	}
	
	private Caixa apontaCursor(int ID) throws Exception {
		Caixa caixaProcurada = this.primeira;
		while(caixaProcurada.getID() != ID) {
			if(caixaProcurada.equals(this.ultima)) throw new Exception("ID inexistente!");
			caixaProcurada = caixaProcurada.getProxima();
		}
		this.atual = caixaProcurada;
		return caixaProcurada;
	}
	
	private void cursorParaUltima() {
		this.atual = this.ultima;
	}

	private void cursorParaPrimeira() {
		this.atual = this.primeira;
	}

	private void avancaCursor(int quantidade) {
		for(int i = 0; i < quantidade; i++){
			this.atual = this.atual.getProxima();
		}	
	}

	private void voltaCursor(int quantidade) {
		for(int i = 0; i < quantidade; i++){
			this.atual = this.atual.getAnterior();		
		}
	}
	
	public IBuscavel buscar(int ID) throws Exception {
		return apontaCursor(ID).getElemento();
	}
	
	public void inserir(IBuscavel elemento, int ID) {
		try {
			if(this.atual == null) {
				this.atual = new Caixa(elemento, ID);
			} else {
				insereDepoisAtual(elemento, ID);
			}	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void excluir(int ID) throws Exception {
		try {
			Caixa caixaExcluida = apontaCursor(ID);
			Caixa proximaCaixa = caixaExcluida.getProxima();
			Caixa caixaAnterior = caixaExcluida.getAnterior();
			caixaAnterior.setProxima(proximaCaixa);
			proximaCaixa.setAnterior(caixaAnterior);
			this.quantidade--;	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insereDepoisAtual(IBuscavel elemento, int ID) throws Exception {
		if(this.atual != null) {
			Caixa caixaInserida = new Caixa(elemento, ID);
			Caixa proximaCaixa = this.atual.getProxima();
			this.atual.setProxima(caixaInserida);
			proximaCaixa.setAnterior(caixaInserida);
			caixaInserida.setAnterior(this.atual);
			caixaInserida.setProxima(proximaCaixa);
			this.quantidade++;
		} else {
			throw new Exception("Nenhum elemento na lista!");
		}
	}		

	public void insereAntesAtual(IBuscavel elemento, int ID) throws Exception {
		if(this.atual != null) {
			Caixa caixaInserida = new Caixa(elemento, ID);
			Caixa caixaAnterior = this.atual.getAnterior();
			this.atual.setAnterior(caixaInserida);
			caixaAnterior.setProxima(caixaInserida);
			caixaInserida.setProxima(this.atual);
			caixaInserida.setAnterior(caixaAnterior);
			this.quantidade++;
		} else {
			throw new Exception("Nenhum elemento na lista!");
		}
	}

	public void excluiAtual() throws Exception {
		if(this.atual != null){
			Caixa proximaCaixa = this.atual.getProxima();
			Caixa caixaAnterior = this.atual.getAnterior();
			proximaCaixa.setAnterior(caixaAnterior);
			caixaAnterior.setProxima(proximaCaixa);
			this.atual = caixaAnterior;
			this.quantidade--;
		} else {
			throw new Exception("Lista vazia!");
		}
	}

}
