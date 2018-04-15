/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

/**
 * Classe aleatória para teste da lista ordenada
 * 
 * @author thiagobrezinski
 */
public class Pessoa implements IBuscavel {
	
	private int ID;
	//Mais propriedades...
	
	public Pessoa(int ID) {
		this.ID = ID;
	}
	
	@Override
	public int getID() {
		return this.ID;
	}
	
}
