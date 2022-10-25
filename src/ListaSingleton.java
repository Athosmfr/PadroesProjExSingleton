import java.util.ArrayList;
import java.util.List;

public class ListaSingleton {

	private static ListaSingleton Instance;
	public List<Produto> produtos;
	
	private ListaSingleton(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public static ListaSingleton getInstance(List<Produto> produtos) { 
		if(Instance == null) { 
			Instance = new ListaSingleton(produtos);
		}
		return Instance;
	}
	
	
}
