public class ProductServices {
    private ProdutoRepositorio repository = new ProdutoRepositorio();
    public void newProduct(Product produto) {
        repository.addProduto(produto);

    }
    public String listaProdutos(){
        return repository.listaProdutos().toString();
    }
}
