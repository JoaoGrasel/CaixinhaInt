public class CaixinhaInt{
	
	int elemento;
	CaixinhaInt proxima;
	CaixinhaInt anterior;

	public CaixinhaInt(int elemento){
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
	}

	public void setElemento(int elemento){
		this.elemento = elemento;
	}	
	
	public void setProxima(CaixinhaInt proxima){
		this.proxima = proxima;
	}	

	public void setAnterior(CaixinhaInt anterior){
		this.anterior = anterior;	
	}	

	public int getElemento(){
		return elemento;
	}	

	public CaixinhaInt getProxima(){
		return proxima;
	}	

	public CaixinhaInt getAnterior(){
		return proxima;
	}
	
}

