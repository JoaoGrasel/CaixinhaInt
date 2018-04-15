/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class Caixa implements IBuscavel {

	private final int ID;
	private IBuscavel elemento;
    private Caixa proxima;
	private Caixa anterior;

	public Caixa(IBuscavel elemento, int ID){
		this.elemento = elemento;
		this.proxima = null;
		this.anterior = null;
        this.ID = ID;
	}

	public void setElemento(IBuscavel elemento) {
		this.elemento = elemento;
	}	
	
	public void setProxima(Caixa proxima) {
		this.proxima = proxima;
	}	

	public void setAnterior(Caixa anterior) {
		this.anterior = anterior;	
	}	

	public IBuscavel getElemento() {
		return elemento;
	}	

	public Caixa getProxima() {
		return proxima;
	}	

	public Caixa getAnterior() {
		return anterior;
	}
	
	@Override
	public int getID(){
		return ID;
 	}
    
}