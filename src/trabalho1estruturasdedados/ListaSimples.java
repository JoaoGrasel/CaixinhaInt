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
		while(caixaProcurada.getElemento().getID() != ID) {
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
	
	public void inserir(IBuscavel elemento) {
		try {
			if(this.atual == null) {
				this.atual = new Caixa(elemento);
				this.primeira = this.atual;
				this.ultima = this.atual;
				this.quantidade++;
			} else {
				insereDepoisAtual(elemento);
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
			if(proximaCaixa == null && caixaAnterior == null) {
				this.primeira = null;
				this.ultima = null;
				this.atual = null;
			} else if(caixaAnterior == null && proximaCaixa != null) {
				this.primeira = proximaCaixa;
				this.atual = proximaCaixa;
				proximaCaixa.setAnterior(this.ultima);
			} else if(caixaAnterior != null && proximaCaixa == null) {
				caixaAnterior.setProxima(this.primeira);
				this.ultima = caixaAnterior;
				this.atual = caixaAnterior;
			} else {
				caixaAnterior.setProxima(proximaCaixa);
				proximaCaixa.setAnterior(caixaAnterior);
			}
			this.quantidade--;	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void insereDepoisAtual(IBuscavel elemento) throws Exception {
		if(this.atual != null) {
			Caixa caixaInserida = new Caixa(elemento);
			if(this.atual.getProxima() != null) {
				Caixa proximaCaixa = this.atual.getProxima();
				this.atual.setProxima(caixaInserida);
				proximaCaixa.setAnterior(caixaInserida);
				caixaInserida.setAnterior(this.atual);
				caixaInserida.setProxima(proximaCaixa);
			} else {
				this.atual.setProxima(caixaInserida);
				caixaInserida.setAnterior(this.atual);
				this.atual = caixaInserida;
				this.ultima = caixaInserida;
			}
			this.quantidade++;
		} else {
			throw new Exception("Nenhum elemento na lista!");
		}
	}		

	public void insereAntesAtual(IBuscavel elemento) throws Exception {
		if(this.atual != null) {
			Caixa caixaInserida = new Caixa(elemento);
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
