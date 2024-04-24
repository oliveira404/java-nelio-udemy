package model;

public class Product {

    String nome;
    Double preco;
    Integer quantidade;

    Double valorTotal;

    public Product(String nome, String preco, String quantidade) {

        this.nome = nome;
        this.preco = Double.parseDouble(preco);
        this.quantidade = Integer.parseInt(quantidade);

        this.valorTotal = calcular(this.preco, this.quantidade);
    }

    private Double calcular(Double preco, Integer quantidade) {
        return preco * quantidade;
    }

    /*public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }*/

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(this.nome+","+String.format("%.2f",this.valorTotal)).toString();
    }
}
