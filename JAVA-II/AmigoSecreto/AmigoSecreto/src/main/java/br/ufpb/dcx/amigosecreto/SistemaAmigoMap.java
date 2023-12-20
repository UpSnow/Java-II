package br.ufpb.dcx.amigosecreto;

import java.util.*;

public class SistemaAmigoMap {

    private List<Mensagem> mensagens;
    private Map<String,Amigo> amigosMap;

    public SistemaAmigoMap(){
        this.mensagens = new LinkedList<>();
        this.amigosMap = new HashMap<>();
    }

    public void cadastraAmigo (String nome ,String emailAmigo ) throws AmigoJaExisteException{
        if (!amigosMap.containsKey(emailAmigo)){
            Amigo AmigoNovoMap = new Amigo(nome,emailAmigo);
            amigosMap.put(emailAmigo,AmigoNovoMap);
        }else {
            throw new AmigoJaExisteException("");

        }
    }
    public Amigo pesquisaAmigo (String emailAmigo) throws AmigoInexistenteException{
        Amigo amigo = this.amigosMap.get(emailAmigo);
        if (amigo == null){
            throw new AmigoInexistenteException("");

        }
        else {
            return amigo;
        }
    }
    public void enviarMensagemParaAlguem (String texto, String emailRemetente, String emailDestinatario, boolean anonima){
        MensagemParaAlguem enviar = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario , anonima);
        if (!this.mensagens.contains(enviar)) {
            this.mensagens.add(enviar);
        }
    }
    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        MensagemParaTodos enviar = new MensagemParaTodos(texto, emailRemetente, anonima);
        if (!this.mensagens.contains(enviar)) {
            this.mensagens.add(enviar);
        }
    }


    public List<Mensagem> pesquisaMensagensAnonimas () {
        List<Mensagem> mensagensAnonima = new ArrayList<>();
        for(Mensagem m: this.mensagens){
            if (m.ehAnonima()){
                mensagensAnonima.add(m);
            }
        }return mensagensAnonima;
    }
    public List<Mensagem> pesquisaTodasAsMensagens() {
        List<Mensagem> mensagensCopia = new LinkedList<>(this.mensagens);
        return mensagensCopia;
    }
    public  void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoDaPessoa) throws AmigoInexistenteException {
        Amigo a = amigosMap.get(emailDaPessoa);
        if (a != null){
            a.setEmailSorteado(emailAmigoDaPessoa);
        }else {
            throw new AmigoInexistenteException("");
        }

    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa)throws AmigoInexistenteException, AmigoNaoSorteadoException {
       Amigo a = this.amigosMap.get(emailDaPessoa);
       if (a != null){
           if (a.getEmailSorteado() == null){
               throw new AmigoNaoSorteadoException("");
           }else {
               return a.getEmailSorteado();
           }
       }throw new AmigoInexistenteException("");
    }
}
