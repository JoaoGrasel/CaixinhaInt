public class CaixinhaInt{
	
	int elemento;
    int ID;
    CaixinhaInt proxima;
	CaixinhaInt anterior;
    

	public CaixinhaInt(int elemento, int ID){
		this.elemento = elemento;
		this.proxima = proxima;
		this.anterior = anterior;
        this.ID = ID;
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
		return anterior;
	}
	
    public int getID(){
        return ID;
    }
    
    
}

