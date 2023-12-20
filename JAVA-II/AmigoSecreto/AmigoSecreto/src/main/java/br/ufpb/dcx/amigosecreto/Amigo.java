package br.ufpb.dcx.amigosecreto;

import java.util.Objects;

public class Amigo {
    private String nome;
    private String email;

    private String emailSorteado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amigo amigo)) return false;
        return Objects.equals(getNome(), amigo.getNome()) && Objects.equals(getEmail(), amigo.getEmail()) && Objects.equals(getEmailSorteado(), amigo.getEmailSorteado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getEmail(), getEmailSorteado());
    }

    public Amigo (String nome, String email){
        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailSorteado() {
        return emailSorteado;
    }

    public void setEmailSorteado(String emailSorteado) {
        this.emailSorteado = emailSorteado;
    }
}
