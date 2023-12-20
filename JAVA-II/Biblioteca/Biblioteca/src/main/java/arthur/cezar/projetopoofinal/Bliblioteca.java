package arthur.cezar.projetopoofinal;

import java.io.Serializable;
import java.util.Objects;

public class Bliblioteca implements Serializable {

    private String nomeDoLivro;
    private String nomeAutor;
    private String codigoDolivro;

    private int quantidadePagina;

    public Bliblioteca(String nomeDoLivro, String nomeAutor, String codigoDolivro, int quantidadePagina){
        this.nomeDoLivro = nomeDoLivro;
        this.nomeAutor = nomeAutor;
        this.codigoDolivro = codigoDolivro;
        this.quantidadePagina = quantidadePagina;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bliblioteca that)) return false;
        return quantidadePagina == that.quantidadePagina && Objects.equals(nomeDoLivro, that.nomeDoLivro) && Objects.equals(nomeAutor, that.nomeAutor) && Objects.equals(codigoDolivro, that.codigoDolivro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoLivro, nomeAutor, codigoDolivro, quantidadePagina);
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getCodigoDolivro() {
        return codigoDolivro;
    }

    public void setCodigoDolivro(String codigoDolivro) {
        this.codigoDolivro = codigoDolivro;
    }

    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }

    @Override
    public String toString() {
        return  "\nNome do Livro: " + nomeDoLivro + "\nNome Do Autor: " + nomeAutor + "\nCodigo:  " + codigoDolivro + "\nQuantidade de paginas:"+ quantidadePagina;
    }
}

