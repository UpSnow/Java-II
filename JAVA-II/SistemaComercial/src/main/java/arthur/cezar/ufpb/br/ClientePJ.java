package arthur.cezar.ufpb.br;

import java.util.Objects;

public class ClientePJ extends Cliente {
    private String CNPJ;

    public ClientePJ(String nome, String endereco,String email, String CNPJ){
        super(nome,endereco,email);
        this.CNPJ = CNPJ;
    }
       public String getId(){
        return this.CNPJ;
       }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientePJ clientePJ)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(CNPJ, clientePJ.CNPJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), CNPJ);
    }
}
