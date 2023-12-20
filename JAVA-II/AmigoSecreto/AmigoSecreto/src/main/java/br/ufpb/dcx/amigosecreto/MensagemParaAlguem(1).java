package br.ufpb.dcx.amigosecreto;

import java.util.Objects;

public class MensagemParaAlguem extends Mensagem {


    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario , boolean anonima) {
        super(texto, emailRemetente, anonima);
        this.emailDestinatario = emailDestinatario;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MensagemParaAlguem that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getEmailDestinatario(), that.getEmailDestinatario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getEmailDestinatario());
    }

    public String getEmailDestinatario() {
        return this.emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String GetTextoCompletoAExibir() {
        if(!super.ehAnonima()){
            return "Mensagem de: " + super.getEmailRemetente() + " para " + this.getEmailDestinatario() + " Texto : " + super.getTexto();

        } else{
            return "Email para : " + this.getEmailDestinatario() + " Texto: " + super.getTexto();
        }
    }
}
