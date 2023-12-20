package arthur.cezar.ufpb.br;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaComercialMapTest {
        @Test
        public void testaCadastroProdutos() {
            SistemaComercialMap sistema = new SistemaComercialMap();
            Produto p1 = new Produto("","",0.0,0,CategoriaProduto.ALIMENTO);
            assertTrue(sistema.cadastraProduto(p1));
            assertTrue(sistema.existeProduto(p1));
            Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
            assertTrue(alimentos.size()==1);


        }
}
