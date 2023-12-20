package arthur.cezar.ufpb.br;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap implements SistemaComercial{
    private Map<String, Cliente> clientes;
    private Map<String, Produto> produtos;
    public SistemaComercialMap () {
        this.clientes = new HashMap<String, Cliente>();
        this.produtos = new HashMap<String, Produto>();
    }

    //existeCliente
    public boolean existeCliente(Cliente cliente){
        if(this.clientes.containsKey(cliente.getId())){
            return true;

        }else {
            return false;
        }
    }
    @Override
    public boolean existeProduto(Produto produto) {
        if (this.produtos.containsKey(produto.getCodigo())){
            return true;
        } else {
            return false;
        }
    }
    //pesquisaCliente
    public Cliente pesquisaCliente (String id) throws ClienteNaoExisteException{
        Cliente a = this.clientes.get(id);
        if (a == null){
            throw new ClienteNaoExisteException("");

        }else {
            return a;
        }


    }
    public Produto pesquisaProduto(String codigoProduto)
            throws ProdutoNaoExisteException {
        if (this.produtos.containsKey(codigoProduto)) {
            return this.produtos.get(codigoProduto);
        }
        throw new ProdutoNaoExisteException("Não foi encontrado produto"

                +" com o código "+codigoProduto);

    }
    public boolean cadastraProduto (Produto produto){
        if (this.produtos.containsKey(produto.getCodigo())){
            return false;
        }else {
            this.produtos.put(produto.getCodigo(),produto);
            return true;
        }
    }
    //pesquisaProdutosDaCategoria
    public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
        Collection<Produto> a  = new ArrayList<>();
        for(Produto p : this.produtos.values()){
            if(p.getCategoria() == categoria){
                a.add(p);
            }

        }
        return a;

    }

}
