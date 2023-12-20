package arthur.ufpb.br;

import java.util.Collection;

public interface SistemaInterface {

    public  boolean cadastraPerfume(String nome, String codigo , int quantidade);
    public Collection<Perfume> pesquisaPerfume(String nome, String codigo);
    public boolean removePerfume(String codigo);
    public Collection<Perfume> getPerfumes();
    public void setPerfume(Collection<Perfume> perfumes);
}

