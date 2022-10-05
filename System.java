
public class System {
    Interface i = new Interface();

    public void newProduct() {
        Product produto = new Product("leite", "italac", 10.0);
        i.newProduct(produto);
    }

    public void newLote() {
        Product produto = new Product("leite", "italac", 10.0);
        Lote lote = new Lote(10, "abril", produto);
        i.newLote();
    }

    public void showProducts() {
        i.showProducts();
    }

    public void showLotes(){
        i.showLotes();
    }
}
