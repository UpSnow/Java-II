package arthur.cezar.projetopoofinal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca implements InterfaceBiblioteca{

    private Map<String,Bliblioteca> blibliotecaMap;


    public SistemaBiblioteca(){
        this.blibliotecaMap = new HashMap<>();
    }
    @Override
    public boolean cadastraLivros(Bliblioteca bliblioteca) {
        if (!this.blibliotecaMap.containsKey(bliblioteca.getCodigoDolivro())){
            this.blibliotecaMap.put(bliblioteca.getCodigoDolivro(),bliblioteca);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public Collection<Bliblioteca> pesquisaLivro(String nomeLivro, String nomeAutor) {
       Collection<Bliblioteca> blibliotecaCollection = new ArrayList<>();
       for (Bliblioteca b:this.blibliotecaMap.values()){
           if (b.getNomeDoLivro().equals(nomeLivro) && b.getNomeAutor().equals(nomeAutor)){
               blibliotecaCollection.add(b);
           }
       }
       return blibliotecaCollection;
    }

    @Override
    public boolean removeLivro(String CodigoDoLivro) {
        if (this.blibliotecaMap.containsKey(CodigoDoLivro)){
            this.blibliotecaMap.remove(CodigoDoLivro);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Collection<Bliblioteca> getLivros() {
        return this.blibliotecaMap.values();

    }

    @Override
    public void setLivros(Collection<Bliblioteca> blibliotecas) {
        for (Bliblioteca b: blibliotecas){
            this.blibliotecaMap.put(b.getCodigoDolivro(),b);
        }
    }
}
