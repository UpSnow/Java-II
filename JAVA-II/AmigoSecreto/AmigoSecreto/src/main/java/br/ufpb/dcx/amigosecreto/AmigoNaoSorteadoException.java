package br.ufpb.dcx.amigosecreto;

public class AmigoNaoSorteadoException extends Exception{
    public static final long serialVersion = 1L;

    public AmigoNaoSorteadoException(String msg){
        super(msg);
    }
}
