package arthur.ufpb.br;

import java.io.Serializable;
import java.util.Objects;

public class Perfume implements Serializable {

    private String nome;
    private String codigo;
    private  int quantidade;

    public Perfume(String nome, String codigo, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perfume perfume)) return false;
        return quantidade == perfume.quantidade && Objects.equals(nome, perfume.nome) && Objects.equals(codigo, perfume.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, codigo, quantidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "\n O nome do perfume é " + nome + "\n O codigo é " + codigo + "\n A quantidade é " + quantidade ;
    }
}
