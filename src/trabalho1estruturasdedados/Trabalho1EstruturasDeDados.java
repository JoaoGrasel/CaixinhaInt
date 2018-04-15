/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1estruturasdedados;

/**
 *
 * @author thiagobrezinski
 */
public class Trabalho1EstruturasDeDados {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		// ===== LISTA 1 =====
		
		Pessoa pessoa1 = new Pessoa(1);
		Pessoa pessoa2 = new Pessoa(2);
		Veiculo veiculo1 = new Veiculo(3);
		Veiculo veiculo2 = new Veiculo(4);
		
		ListaOrdenada lista1 = new ListaOrdenada();
		
		lista1.inserir(pessoa1);
		lista1.inserir(pessoa2);
		lista1.inserir(veiculo1);
		lista1.inserir(veiculo2);

		System.out.println("===== LISTA 1 =====");
		lista1.imprimeListaOrdenada();
		System.out.println("");
		
		// ===== LISTA 2 =====
		
		Pessoa pessoa3 = new Pessoa(10);
		Pessoa pessoa4 = new Pessoa(5);
		Veiculo veiculo3 = new Veiculo(20);
		Veiculo veiculo4 = new Veiculo(1);
		
		ListaOrdenada lista2 = new ListaOrdenada();
		
		lista2.inserirOrdenado(pessoa3);
		lista2.inserirOrdenado(pessoa4);
		lista2.inserirOrdenado(veiculo3);
		lista2.inserirOrdenado(veiculo4);
		
		System.out.println("===== LISTA 2 =====");
		lista2.imprimeListaOrdenada();
		System.out.println("");
		
	}
	
}
