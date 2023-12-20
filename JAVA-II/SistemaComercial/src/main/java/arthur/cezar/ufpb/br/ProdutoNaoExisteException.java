package arthur.cezar.ufpb.br;

public class ProdutoNaoExisteException extends Exception {
    public static final long serialVersionUID = 1l;
    public ProdutoNaoExisteException(String msg){
        super(msg);
    }
}
