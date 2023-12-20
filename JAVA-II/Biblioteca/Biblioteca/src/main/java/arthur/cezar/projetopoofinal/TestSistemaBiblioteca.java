package arthur.cezar.projetopoofinal;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;


public class TestSistemaBiblioteca {

    @Test
    public void TestSistema(){
        SistemaBiblioteca sistemaBiblioteca = new SistemaBiblioteca();
        Bliblioteca bliblioteca = new Bliblioteca("O menino de pijama listrado","John Boyne","1", 187);
        assertTrue(sistemaBiblioteca.cadastraLivros(bliblioteca));
        Collection<Bliblioteca> blibliotecas = sistemaBiblioteca.pesquisaLivro("O menino de pijama listrado","John Boyne");
        assertTrue(blibliotecas.size() == 1);
        assertTrue(sistemaBiblioteca.removeLivro("1"));

       
    }
}
