package br.ufpb.dcx.amigosecreto;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo Sistema = new SistemaAmigo();
        try {
            //a) Cadastre dois amigos José e Maria com seus e-mails.
            Sistema.cadastraAmigo("José","jose.silva@dcx.ufpb.br");
            Sistema.cadastraAmigo("Maria","maria.barbosa@dcx.ufpb.br");
            //b) Configure o amigo secreto de José como sendo Maria e o amigo secreto de Maria como sendo José. Obs: Lembra de tratar a exceção que pode ser lançada.
            Sistema.configuraAmigoSecretoDe("jose.silva@dcx.ufpb.br","maria.barbosa@dcx.ufpb.br");
            Sistema.configuraAmigoSecretoDe("maria.barbosa@dcx.ufpb.br","jose.silva@dcx.ufpb.br");
            //c) Envie uma mensagem anônima de Maria para José.
            Sistema.enviarMensagemParaAlguem("Oi José","maria.barbosa@dcx.ufpb.br", "jose.silva@dcx.ufpb.br", true);

            //d) Envie uma mensagem anônima de Maria para todos.
            Sistema.enviarMensagemParaTodos("Oi pessoal", "maria.barbosa@dcx.ufpb.br", true);
            //e) Pesquise as mensagens anônimas e imprima o texto completo dessas mensagens através do método getTextoCompletoAExibir.
            for (Mensagem m : Sistema.pesquisaMensagensAnonimas()){
                System.out.println(m.GetTextoCompletoAExibir());
            }
            //f) Pesquise o e-mail do amigo secreto de José e veja se é o e-mail de Maria, imprimindo “Ok” caso seja.
            String amigoSecreto =Sistema.pesquisaAmigoSecretoDe("jose.silva@dcx.ufpb.br");
            if(amigoSecreto.equals("maria.barbosa@dcx.ufpb.br")){
                System.out.println("OK");
            }

        }catch (AmigoJaExisteException  | AmigoInexistenteException | AmigoNaoSorteadoException e  ){
            System.out.println( e.getMessage());

        }



    }
}