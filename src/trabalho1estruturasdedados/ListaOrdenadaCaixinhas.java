/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class ListaOrdenadaCaixinhas{
	
	CaixinhaInt atual;
	CaixinhaInt primeira;
	CaixinhaInt ultima;
	int quantidade;
    	int proximoID;
	
	public ListaOrdenadaCaixinhas(){
		atual = null;
		primeira = null;
		ultima = null;
		quantidade = 0;
		proximoID = 1;
	}

	public void inserirOrdenado(int elemento){
		
		if(quantidade == 0){
	
    			CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, this.proximoID);
			primeira = caixinhaInserida;		
			ultima = caixinhaInserida;
			quantidade++;
           		proximoID++;

		} else {
			
			inserirFake(elemento);
			
			CaixinhaInt caixinhaAtual = primeira;
			

			while(elemento > caixinhaAtual.getElemento()){
		
				caixinhaAtual = caixinhaAtual.getProxima();
			}

			CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento, proximoID);
			CaixinhaInt caixinhaAnterior = caixinhaAtual.getAnterior();
			caixinhaAnterior.setProxima(caixinhaInserida);
			caixinhaAtual.setAnterior(caixinhaInserida);	
			
			removerFake();
		}	

	}


	
	public void insereDepoisAtual(int elemento){
		
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

	public void excluiAtual() throws NullPointerException { //--> ISSO MESMO?
			
		if(this.atual != null){
			CaixinhaInt proximaCaixinha = this.atual.getProxima();
			CaixinhaInt caixinhaAnterior = this.atual.getAnterior();
			proximaCaixinha.setAnterior(caixinhaAnterior);
			caixinhaAnterior.setProxima(proximaCaixinha);
			this.atual = null;
		} else {
			throw new NullPointerException(); //--> ISSO MESMO?
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

	public int imprimeListaOrdenada(){
		CaixinhaInt caixinhaImpressa = this.primeira;		
		for(int i=0; quantidade > i; i++;){
			System.out.println(caixinhaImpressa.getElemento);
			caixinhaImpressa = caixinhaImpressa.getProxima;
		}
	}


}
