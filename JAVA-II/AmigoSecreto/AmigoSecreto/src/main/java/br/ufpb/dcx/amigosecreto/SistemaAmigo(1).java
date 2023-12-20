package br.ufpb.dcx.amigosecreto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SistemaAmigo {

    private List<Mensagem> mensagem;

    private List<Amigo> amigos;


    public SistemaAmigo (){
        this.mensagem =new ArrayList<>();
        this.amigos = new ArrayList<>();

    }

    public SistemaAmigo(ArrayList<Mensagem> mensagem, ArrayList<Amigo> amigo) {
        this.mensagem = mensagem;
        this.amigos = amigo;
    }

    public  void cadastraAmigo (String nome ,String emailAmigo ) throws AmigoJaExisteException {
        Amigo novoAmigo = new Amigo(nome,emailAmigo);
        if (!this.amigos.contains(novoAmigo)){
            this.amigos.add(novoAmigo);
        }else {
            throw new AmigoJaExisteException("Essa pessoa ja foi cadstrada");
        }
    }
    public Amigo pesquisaAmigo (String emailAmigo) throws AmigoInexistenteException  {
        for(Amigo a: amigos ){
            if(a.getEmail().equals(emailAmigo)){
                return a;
            }
        }
        throw new AmigoInexistenteException("");

    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean anonima)  {
        MensagemParaTodos enviar = new MensagemParaTodos(texto,emailRemetente,anonima);
        if(!this.mensagem.contains(enviar)){
            this.mensagem.add(enviar);
        }

    }

    public void enviarMensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean anonima){
        MensagemParaAlguem enviar = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario , anonima);
        if (!this.mensagem.contains(enviar)){
            this.mensagem.add(enviar);
        }

    }

    public List<Mensagem> pesquisaMensagensAnonimas () {
        List<Mensagem> mensagensAnonima = new ArrayList<>();
        for(Mensagem m: this.mensagem){
            if (m.ehAnonima()){
                mensagensAnonima.add(m);
            }
        }return mensagensAnonima;
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        List<Mensagem> mensagensCopia = new LinkedList<>(this.mensagem);
        return mensagensCopia;
    }
    public  void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoDaPessoa) throws AmigoInexistenteException {
        for (Amigo amigo : this.amigos){
            if(amigo.getEmail().equals(emailDaPessoa)){
                amigo.setEmailSorteado(emailAmigoDaPessoa);
                return;
            }
        }throw new AmigoInexistenteException("esse amigo não existe");

    }


    public String pesquisaAmigoSecretoDe(String emailDaPessoa)throws AmigoInexistenteException, AmigoNaoSorteadoException {
        for (Amigo amigo : this.amigos){
            if (amigo.getEmail().equals(emailDaPessoa)){
                if(amigo.getEmailSorteado() == null){
                    throw new AmigoNaoSorteadoException("O email" + amigo.getEmailSorteado() + "é" + null);
                } else {
                    return amigo.getEmailSorteado();
                }
            }
        }
        throw new AmigoInexistenteException("esse amigo não existe");
    }


}
