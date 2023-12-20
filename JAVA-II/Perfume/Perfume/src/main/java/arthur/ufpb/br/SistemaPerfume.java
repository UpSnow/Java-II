package arthur.ufpb.br;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaPerfume implements SistemaInterface {

    private Map<String, Perfume> perfumeMap;

    public SistemaPerfume(){
        this.perfumeMap = new HashMap<>();
    }


    @Override
    public boolean cadastraPerfume(String nome, String codigo, int quantidade) {
        if (!this.perfumeMap.containsKey(codigo)){
            this.perfumeMap.put(codigo,new Perfume(nome,codigo,quantidade));
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Collection<Perfume> pesquisaPerfume(String nome, String codigo) {
        Collection<Perfume> perfumes = new ArrayList<>();
        for (Perfume p : this.perfumeMap.values()){
            if (p.getNome().equals(nome) && p.getCodigo().equals(codigo)){
                perfumes.add(p);
            }

        }
        return perfumes;
    }

    @Override
    public boolean removePerfume(String codigo){
        if (this.perfumeMap.containsKey(codigo)){
            this.perfumeMap.remove(codigo);
            return true;
        }else {
            return false;
        }
    }
    public Collection<Perfume> getPerfumes(){
         return this.perfumeMap.values();
    }
    public void setPerfume(Collection<Perfume> perfumes) {
        for (Perfume p : perfumes) {
                this.perfumeMap.put(p.getCodigo(), p);
        }
    }
}

