
package br.api.model;

public class Produto {
   
    private int codigo_produto;
    private String descricao;
    private Double preco_produto;
    private int quantidade;
    
    public int getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(Double preco_produto) {
        this.preco_produto = preco_produto;
    }
   
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
