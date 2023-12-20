package arthur.cezar.projetopoofinal;

import java.util.Collection;

public interface InterfaceBiblioteca {


    boolean cadastraLivros(Bliblioteca bliblioteca);
    Collection<Bliblioteca> pesquisaLivro (String nomeLivro, String NomeAutor);
    boolean removeLivro(String CodigoDoLivro);
    Collection<Bliblioteca> getLivros();
    void setLivros(Collection<Bliblioteca> blibliotecas);
}
