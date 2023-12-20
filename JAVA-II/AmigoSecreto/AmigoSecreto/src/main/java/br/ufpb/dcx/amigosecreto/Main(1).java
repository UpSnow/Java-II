package br.ufpb.dcx.amigosecreto;

public class Main {
    public static void main(String[] args) {
        SistemaAmigo Sistema = new SistemaAmigo();
        try {
            Sistema.cadastraAmigo("José","jose.silva@dcx.ufpb.br");
            Sistema.cadastraAmigo("Maria","maria.barbosa@dcx.ufpb.br");
            Sistema.configuraAmigoSecretoDe("jose.silva@dcx.ufpb.br","maria.barbosa@dcx.ufpb.br");
            Sistema.configuraAmigoSecretoDe("maria.barbosa@dcx.ufpb.br","jose.silva@dcx.ufpb.br");
            Sistema.enviarMensagemParaAlguem("Oi José","maria.barbosa@dcx.ufpb.br", "jose.silva@dcx.ufpb.br", true);
            Sistema.enviarMensagemParaTodos("Oi pessoal", "maria.barbosa@dcx.ufpb.br", true);
            for (Mensagem m : Sistema.pesquisaMensagensAnonimas()){
                System.out.println(m.GetTextoCompletoAExibir());
            }
            String amigoSecreto =Sistema.pesquisaAmigoSecretoDe("jose.silva@dcx.ufpb.br");
            if(amigoSecreto.equals("maria.barbosa@dcx.ufpb.br")){
                System.out.println("OK");
            }

        }catch (AmigoJaExisteException | AmigoInexistenteException | AmigoNaoSorteadoException e  ){
            System.out.println( e.getMessage());

        }



    }
}