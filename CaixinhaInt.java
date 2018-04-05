public class CaixinhaInt{
	
	int dado;
	CaixinhaInt proxima;
	CaixinhaInt anterior;

	public CaixinhaInt(int dado,CaixinhaInt proxima, CaixinhaInt anterior){
		this.dado = dado;
		this.proxima = proxima;
		this.anterior = anterior;
	}

	public void setDado(int dado){
		this.dado = dado;
	}	
	
	public void setProxima(CaixinhaInt proxima){
		this.proxima = proxima;
	}	

	public void setAnterior(CaixinhaInt anterior){
		this.anterior = anterior;	
	}	

	public int getDado(){
		return dado;
	}	

	public CaixinhaInt getProxima(){
		return proxima;
	}	

	public CaixinhaInt getAnterior(){
		return proxima;
	}
	
}

