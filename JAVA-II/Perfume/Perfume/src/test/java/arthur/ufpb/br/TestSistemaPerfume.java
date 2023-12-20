package arthur.ufpb.br;

import org.junit.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class TestSistemaPerfume {
    @Test
    public void testSistemaPerfume(){
        SistemaPerfume sistema = new SistemaPerfume();
        Perfume p1 = new Perfume("Essencial","ERT3",0);
        assertTrue(sistema.cadastraPerfume(p1.getNome(), p1.getCodigo(), p1.getQuantidade()));
        Collection<Perfume> a = sistema.pesquisaPerfume(p1.getNome(),p1.getCodigo());
        assertTrue(a.size() == 1);
        assertTrue(sistema.removePerfume(p1.getCodigo()));

    }
}
