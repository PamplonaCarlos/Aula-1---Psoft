public class Lote {
    private int quantidade;
    private String dataValidade;
    private Product product;

    public int getQuantidade(){
        return this.quantidade;
    }
    public String getData(){
        return this.dataValidade;
    }
    public Product getProduto(){
        return this.product;
    }

    public Lote(int novaQuantidade, String novaData, Product novoProduct){
        this.dataValidade = novaData;
        this.product = novoProduct;
        this.quantidade = novaQuantidade;
    }

}
