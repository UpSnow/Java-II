package br.ufpb.dcx.amigosecreto;

public class MensagemParaTodos extends Mensagem {
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima) {
        super(texto, emailRemetente, anonima);
    }
    public String GetTextoCompletoAExibir(){
        if(!super.ehAnonima()){
            return " Mesangem de " + super.getEmailRemetente() + " para todos. Texto: " + super.getTexto();

        } else {
            return  " Mensagem para todos. Texto: " + super.getTexto();
        }

    }


}
