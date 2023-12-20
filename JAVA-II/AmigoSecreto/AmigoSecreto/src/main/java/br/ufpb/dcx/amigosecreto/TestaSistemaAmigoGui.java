package br.ufpb.dcx.amigosecreto;

public class TestaSistemaAmigoGui {
    public static void main(String[] args){

        SistemaAmigo sistema =new SistemaAmigo();

            sistema.enviarMensagemParaTodos("Oi pessoal", "maria.barbosa@dcx.ufpb.br", true);

        //a) Leia a quantidade máxima de mensagens que o sistema suporta (pode usar JOptionPane), inicializando com este valor a variável do tipo SistemaAmigo.
        int a = 0;
        for (Mensagem m: sistema.pesquisaTodasAsMensagens()){
            a++;

        }
        System.out.println(a);
        //b) Leia a quantidade total de amigos a participar da brincadeira
            try {
                sistema.configuraAmigoSecretoDe("sdasfdfdsg","ggdsvfdbfdb");
            } catch (AmigoInexistenteException e) {}





            //c) Leia os dados (nome e e-mail) de cada um dos amigos e os cadastre.
        //d) Cadastre os resultados do sorteio dos amigos secretos (diga quem pegou quem).
        //e) Envie uma mensagem de algum dos amigos para todos, coletando para isso os dados necessários (ex: remetente,texto, se a mensagem é anônima ou não).




    }




}
