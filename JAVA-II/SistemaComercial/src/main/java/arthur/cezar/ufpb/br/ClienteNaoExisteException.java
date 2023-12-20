package arthur.cezar.ufpb.br;

public class ClienteNaoExisteException extends  Exception{
    public static final long serialVersionUID = 1l;
    public ClienteNaoExisteException(String msg){
        super(msg);
    }
}
