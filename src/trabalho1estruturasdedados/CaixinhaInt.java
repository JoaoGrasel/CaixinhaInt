/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class CaixinhaInt{

	private int elemento;
    private int ID;
    private CaixinhaInt proxima;
	private CaixinhaInt anterior;

	public CaixinhaInt(int elemento, int ID){
		this.elemento = elemento;
		this.proxima = null;
		this.anterior = null;
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