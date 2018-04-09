/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class ListaOrdenadaCaixinhas{
	
	private CaixinhaInt atual;
	private CaixinhaInt primeira;
	private CaixinhaInt ultima;
	private int quantidade;
    private int proximoID;
	
	public ListaOrdenadaCaixinhas(){
		this.atual = null;
		this.primeira = null;
		this.ultima = null;
		this.quantidade = 0;
		this.proximoID = 1;
	}

	public void inserirOrdenado(int elemento) {
		if(this.quantidade == 0){
			CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, this.proximoID);
			this.primeira = caixinhaInserida;		
			this.ultima = caixinhaInserida;
			this.quantidade++;
           	this.proximoID++;
		} else {
			inserirFake(elemento);
			CaixinhaInt caixinhaAtual = this.primeira;
			while(elemento > caixinhaAtual.getElemento()){
				caixinhaAtual = caixinhaAtual.getProxima();
			}
			CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, this.proximoID);
			CaixinhaInt caixinhaAnterior = caixinhaAtual.getAnterior();
			caixinhaAnterior.setProxima(caixinhaInserida);
			caixinhaAtual.setAnterior(caixinhaInserida);
			removerFake();
		}
	}

	public int buscar(int ID) throws Exception {
		if(this.proximoID > ID && ID > 0){
			CaixinhaInt caixinhaProcurada = this.primeira;
			while(caixinhaProcurada.getID() != ID){
				caixinhaProcurada = caixinhaProcurada.getProxima();
			}
			return caixinhaProcurada.getElemento();
		}
		throw new Exception("ID inexistente!");
	}

	public void excluir(int ID) throws Exception {
		if(proximoID > ID && ID > 0) {
			CaixinhaInt caixinhaExcluida = primeira;
			while(caixinhaExcluida.getID() != ID){
				caixinhaExcluida = caixinhaExcluida.getProxima();
			}
			CaixinhaInt proximaCaixinha = caixinhaExcluida.getProxima();
			CaixinhaInt caixinhaAnterior = caixinhaExcluida.getAnterior();
			caixinhaAnterior.setProxima(proximaCaixinha);
			proximaCaixinha.setAnterior(caixinhaAnterior);
		}
		throw new Exception("ID inexistente!");
	}

	public void insereDepoisAtual(int elemento) {
		if(this.atual != null){
			if(elemento > this.atual.getElemento()){
				CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, proximoID);
				CaixinhaInt proximaCaixinha = this.atual.getProxima();
				this.atual.setProxima(caixinhaInserida);
				proximaCaixinha.setAnterior(caixinhaInserida);
				caixinhaInserida.setAnterior(this.atual);
				caixinhaInserida.setProxima(proximaCaixinha);			
			} else {
			
			}
		}
	}		

	public void insereAntesAtual(int elemento){
		if(this.atual != null){
			if(elemento < this.atual.getElemento()) {
				CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, proximoID);
				CaixinhaInt caixinhaAnterior = this.atual.getAnterior();
				this.atual.setAnterior(caixinhaInserida);
				caixinhaAnterior.setProxima(caixinhaInserida);
				caixinhaInserida.setAnterior(caixinhaAnterior);
				caixinhaInserida.setProxima(atual);	
			} else { 
			
			}
		}
	}

	public void excluiAtual() throws Exception {
		if(this.atual != null){
			CaixinhaInt proximaCaixinha = this.atual.getProxima();
			CaixinhaInt caixinhaAnterior = this.atual.getAnterior();
			proximaCaixinha.setAnterior(caixinhaAnterior);
			caixinhaAnterior.setProxima(proximaCaixinha);
			this.atual = null;
		} else {
			throw new Exception("Lista vazia!");
		}
	}

	public CaixinhaInt acessaAtual(){
		return atual;
	}
	
	private void cursorParaUltima(){
		this.atual = ultima;
	}

	private void cursorParaPrimeira(){
		this.atual = primeira;
	}

	private void avancaCursor(int quantidade){
		for(int i = 0; i < quantidade; i++){
			this.atual = this.atual.getProxima();
		}	
	}

	private void voltaCursor(int quantidade){
		for(int i=0; i < quantidade; i++){
			this.atual = this.atual.getAnterior();		
		}
	}

	private void inserirFake(int elemento){	
		CaixinhaInt caixinhaFake = new CaixinhaInt(elemento, 0);
		this.ultima.setProxima(caixinhaFake);
		this.primeira.setAnterior(caixinhaFake);
		caixinhaFake.setProxima(this.primeira);
		caixinhaFake.setAnterior(this.ultima);			
		this.ultima = caixinhaFake;
		this.quantidade++;
	}

	private void removerFake(){
		CaixinhaInt caixinhaAnterior = this.ultima.getAnterior();
		caixinhaAnterior.setProxima(this.primeira);
		this.primeira.setAnterior(caixinhaAnterior);
		this.ultima = caixinhaAnterior;
		this.quantidade--;
	}

	public void imprimeListaOrdenada(){
		CaixinhaInt caixinhaImpressa = this.primeira;		
		for(int i=0; quantidade > i; i++){
			System.out.println(caixinhaImpressa.getElemento());
			caixinhaImpressa = caixinhaImpressa.getProxima();
		}
	}

}
