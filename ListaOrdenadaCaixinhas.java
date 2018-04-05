public class ListaOrdenadaCaixinhas{
	
	CaixinhaInt atual;
	CaixinhaInt primeira;
	CaixinhaInt ultima;
	int quantidade;
	
	public ListaOrdenadaCaixinhas(){
		atual = null;
		primeira = null;
		ultima = null;
		quantidade = 0;
	}

	
	
	public void inserirOrdenado(int elemento){
		
		if(quantidade = 0){
	
			CaixinhaInt caixinhaInserida = new CaixinhaInt(elemento)
			primeira = caixinhaInserida;		
			ultima = caixinhaInserida;
			quantidade = 1;		

		} else {

			CaixinhaInt caixinhaAtual = primeira;

			while(elemento > caixinhaAtual.getElemento){
			
				caixinhaAtual = caixinhaAtual.getProxima;

		}	

	}

	
	public void insereDepoisAtual(int elemento){
		
		if(this.atual != null){
		
			if(elemento > this.atual.getElemento){
				
				CaixinhaInt caixinhaInserida = new Caixinha(elemento);
				CaixinhaInt proximaCaixinha = this.atual.getProxima();
				this.atual.setProxima(caixinhaInserida);
				proximaCaixinha.setAnterior(caixinhaInserida);
				caixinhaInserida.setAnterior(this.atual);
				caixinhaInserida.setProxima(proximaCaixinha);			
			}
		}			

	public void insereAntesAtual(int elemento){
		
		if(this.atual != null){

			if(elemento < this.atual.getElemento)

				CaixinhaInt caixinhaInserida = new Caixinha(elemento);
				CaixinhaInt caixinhaAnterior = this.atual.getAnterior();
				this.atual.setAnterior(caixinhaInserida);
				caixinhaAnterior.setProxima(caixinhaInserida);
				caixinhaInserida.setAnterior(caixinhaAnterior);
				caixinhaInserida.setProxima(atual)		
			}
		}
	}

	public void excluiAtual() throws NullPointerException{ --> ISSO MESMO?
			
		if(this.atual != null){
			CaixinhaInt proximaCaixinha = this.atual.getProxima();
			CaixinhaInt caixinhaAnterior = this.atual.getAnterior();
			proximaCaixinha.setAnterior(caixinhaAnterior);
			caixinhaAnterior.setProxima(proximaCaixinha);
			this.atual = null;
		} else {
			throw NullPointerException) --> ISSO MESMO?
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
		for(int i=0, i++, i=quantidade){
			this.atual = this.atual.getProximo();
		}	
	}

	private void voltaCursor(int quantidade){
		for(int i=0, i++, i=quantidade){
			this.atual = this.atual.getAnterior();		
		}
	}

	
 



}
