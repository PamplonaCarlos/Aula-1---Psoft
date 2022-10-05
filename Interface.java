public class Interface {
    private ProductServices ps = new ProductServices();
    private LoteServices ls = new LoteServices();

    public void newProduct(Product produto)
    {
        ps.newProduct(produto);
    }

    public void newLote() {
        ls.newLote();
    }

    public  void showProducts() {
        ps.listaProdutos();

    }

    public  void showLotes(){
        ls.showLotes();

    }
}
