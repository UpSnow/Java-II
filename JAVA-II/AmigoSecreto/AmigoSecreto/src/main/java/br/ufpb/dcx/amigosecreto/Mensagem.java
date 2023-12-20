package br.ufpb.dcx.amigosecreto;

import java.util.Objects;

public abstract class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;



    public Mensagem(String texto, String emailRemetente, boolean anonima){
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mensagem mensagem)) return false;
        return anonima == mensagem.anonima && Objects.equals(getTexto(), mensagem.getTexto()) && Objects.equals(getEmailRemetente(), mensagem.getEmailRemetente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTexto(), getEmailRemetente(), anonima);
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEmailRemetente() {
        return this.emailRemetente;
    }

    public void setEmailRemetente(String emailRemetente) {
        this.emailRemetente = emailRemetente;
    }
    public abstract  String GetTextoCompletoAExibir();

    public boolean ehAnonima() {
        return this.anonima;
    }


}
