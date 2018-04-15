/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

public class Caixa {

	private IBuscavel elemento;
    private Caixa proxima;
	private Caixa anterior;

	public Caixa(IBuscavel elemento){
		this.elemento = elemento;
		this.proxima = null;
		this.anterior = null;
	}

	public IBuscavel getElemento() {
		return elemento;
	}
	
	public void setElemento(IBuscavel elemento) {
		this.elemento = elemento;
	}
	
	public Caixa getProxima() {
		return proxima;
	}
	
	public void setProxima(Caixa proxima) {
		this.proxima = proxima;
	}

	public Caixa getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Caixa anterior) {
		this.anterior = anterior;
	}
    
}