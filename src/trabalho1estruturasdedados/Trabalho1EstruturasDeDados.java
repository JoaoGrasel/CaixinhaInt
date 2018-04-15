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
		
		System.out.println("===== LISTA 1 =====");
		
		System.out.println("");
		System.out.println("Inserido Pessoa - ID 1");
		lista1.inserir(pessoa1);
		System.out.println("Inserido Pessoa - ID 2");
		lista1.inserir(pessoa2);
		System.out.println("Inserido Veiculo - ID 3");
		lista1.inserir(veiculo1);
		System.out.println("Inserido Veiculo - ID 4");
		lista1.inserir(veiculo2);
		
		try {
			System.out.println("");
			System.out.println("Buscando ID 0...");
			lista1.buscar(0);
			System.out.println("ID encontrado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("");
			System.out.println("Buscando ID 1...");
			lista1.buscar(1);
			System.out.println("ID encontrado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("");
			System.out.println("Excluindo ID 1...");
			lista1.excluir(1);
			System.out.println("ID excluido!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("");
			System.out.println("Excluindo ID 4...");
			lista1.excluir(4);
			System.out.println("ID excluido!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("");
		System.out.println("Elementos da lista:");
		
		lista1.imprimeListaOrdenada();
		System.out.println("");
		
		// ===== LISTA 2 =====
		
		Pessoa pessoa3 = new Pessoa(10);
		Pessoa pessoa4 = new Pessoa(5);
		Pessoa pessoa5 = new Pessoa(44);
		Veiculo veiculo3 = new Veiculo(20);
		Veiculo veiculo4 = new Veiculo(1);
		Veiculo veiculo5 = new Veiculo(11);
		
		ListaOrdenada lista2 = new ListaOrdenada();
		
		System.out.println("===== LISTA 2 =====");
		System.out.println("");
		
		System.out.println("Inserido ordenado Pessoa - ID 10");
		lista2.inserirOrdenado(pessoa3);
		System.out.println("Inserido ordenado Pessoa - ID 5");
		lista2.inserirOrdenado(pessoa4);
		System.out.println("Inserido ordenado Pessoa - ID 44");
		lista2.inserirOrdenado(pessoa5);
		System.out.println("Inserido ordenado Veiculo - ID 20");
		lista2.inserirOrdenado(veiculo3);
		System.out.println("Inserido ordenado Veiculo - ID 1");
		lista2.inserirOrdenado(veiculo4);
		System.out.println("Inserido ordenado Veiculo - ID 11");
		lista2.inserirOrdenado(veiculo5);
		
		System.out.println("");
		System.out.println("Elementos da lista:");
		lista2.imprimeListaOrdenada();
	
	}
	
}
