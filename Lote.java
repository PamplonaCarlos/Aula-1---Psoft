import java.sql.Date;

public class Lote {
    private int quantidade;
    private Date dataV;
    private Produto produto;

    public int getQuantidade(){
        return this.quantidade;
    }
    public Date getData(){
        return this.dataV;
    }
    public Produto getProduto(){
        return this.produto;
    }

    public Lote(int novaQuantidade, Date novaData, Produto novoProduto){
        this.dataV = novaData;
        this.produto = novoProduto;
        this.quantidade = novaQuantidade;
    }
}
