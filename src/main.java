import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Miojo", 4.50);
		Produto prod2 = new Produto("Coca-Cola", 5.00);
		Produto prod3 = new Produto("Balas Fini", 9.90);
		Produto prod4 = new Produto("Monster Energy Drink", 8.00);
		
		
		List<Produto> prodtest = new ArrayList<Produto>();
		//prodtest.add(prod1, prod2, prod3, prod4);
		
		Collections.addAll(prodtest, prod1, prod2, prod3, prod4);
		
		ListaSingleton list1 = ListaSingleton.getInstance(prodtest);
		for(Produto produto: list1.produtos) {
			System.out.println("\nNome: " + produto.nome + "\nPreço: R$" + produto.preco);
		} 
		
		ListaSingleton list2 = ListaSingleton.getInstance(prodtest);
		
		prod1.preco = 120.80;
		
		for(Produto produto: prodtest) {
			System.out.println("\nNome: " + produto.nome + "\nPreço: R$" + produto.preco);
		} 
		
	}
	
}
