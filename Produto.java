public class Produto {
    private String nome;
    private String fabricante;
    private Double preco;
    


    public Produto(String novoNome, String novoFabricante, Double novoPreco){
        this.nome = novoNome;
        this.fabricante = novoFabricante;
        this.preco = novoPreco;
    }



    
    public String getNome(){
        return this.nome;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public Double getPreco(){
        return this.preco;
    }




    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setFabricante(String novoFabricante ){
        this.fabricante = novoFabricante;
    }
    public void setPreco(Double novoPreco){
        this.preco = novoPreco;
    }
    



}
