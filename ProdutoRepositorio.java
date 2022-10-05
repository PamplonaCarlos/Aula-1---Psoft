import java.util.HashMap;
import java.util.Map;

public class ProdutoRepositorio {
    private Map<String, Product> produtos = new HashMap<String, Product>();

    public void addProduto(Product produto){
        produtos.put(produto.getNome(), produto);
    }

    public Product[] listaProdutos(){
    return produtos.values().toArray(new Product[0]);
    }
}
