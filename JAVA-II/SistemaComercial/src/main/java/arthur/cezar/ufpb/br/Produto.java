package arthur.cezar.ufpb.br;

import java.util.Objects;

public class Produto {
    private String codigo;
    private String descricao;
    private double precovenda;
    private  int quantidadeEmEstoque;
    private CategoriaProduto categoria;

    public Produto(String codigo, String descricao, double precovenda, int quantidadeEmEstoque,CategoriaProduto categoria){
        this.codigo = codigo;
        this.descricao =descricao;
        this.precovenda = precovenda;
        this.quantidadeEmEstoque =quantidadeEmEstoque;
        this.categoria =categoria;
    }
    public Produto(){
        this("","",0.0,0, CategoriaProduto.PRODUTODELIMPEZA);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Double.compare(produto.getPrecovenda(), getPrecovenda()) == 0 && getQuantidadeEmEstoque() == produto.getQuantidadeEmEstoque() && Objects.equals(getCodigo(), produto.getCodigo()) && Objects.equals(getDescricao(), produto.getDescricao()) && getCategoria() == produto.getCategoria();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getDescricao(), getPrecovenda(), getQuantidadeEmEstoque(), getCategoria());
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precovenda=" + precovenda +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", categoria=" + categoria +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }
}
