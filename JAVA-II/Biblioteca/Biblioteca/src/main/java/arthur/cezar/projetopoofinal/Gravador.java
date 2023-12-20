package arthur.cezar.projetopoofinal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Gravador {
    private String arquivosDaBiblioteca;
    public Gravador(){
        this.arquivosDaBiblioteca= "./src/main/resources/Biblioteca.dat";
    }
    public Gravador(String arquivosDaBiblioteca){
        this.arquivosDaBiblioteca = arquivosDaBiblioteca;
    }

    public void gravarBiblioteca(Collection<Bliblioteca> blibliotecaCollection) throws IOException{
        try(ObjectOutputStream gravador= new ObjectOutputStream(new FileOutputStream(this.arquivosDaBiblioteca))){
            ArrayList<Bliblioteca> perfumesNovos = new ArrayList<>(blibliotecaCollection);
            gravador.writeObject(perfumesNovos);

        }
    }

    public Collection<Bliblioteca> recuperaBiblioteca() throws IOException {
        try (ObjectInputStream gravador= new ObjectInputStream(new FileInputStream(arquivosDaBiblioteca))){
            ArrayList<Bliblioteca> perfumesRecuperados = (ArrayList<Bliblioteca>) gravador.readObject();
            return perfumesRecuperados;
        }catch (ClassNotFoundException e){
            throw  new IOException(e);
        }


    }

}
