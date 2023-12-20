package arthur.cezar.ufpb.br;

import java.util.Objects;

public class ClientePF extends Cliente{
        private String CPF;
        public ClientePF(String nome, String endereco, String email, String CPF) {
            super(nome, endereco, email);
            this.CPF = CPF;
        }
        @Override
        public String getId() {
            return this.CPF;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientePF clientePF)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(CPF, clientePF.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), CPF);
    }
}
