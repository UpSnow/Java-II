package arthur.ufpb.br;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadoDePerfume{

    private String arquivosDoPerfume;
    public GravadoDePerfume(){
        this.arquivosDoPerfume = "./src/main/resources/Perfume.dat";
    }
    public GravadoDePerfume(String arquivosDoPerfume ){
        this.arquivosDoPerfume = arquivosDoPerfume;
    }

    public void gravaPerfume(Collection<Perfume> perfume) throws IOException{
        try(ObjectOutputStream gravador= new ObjectOutputStream(new FileOutputStream(this.arquivosDoPerfume))){
            ArrayList<Perfume> perfumesNovos = new ArrayList<>(perfume);
            gravador.writeObject(perfumesNovos);

        }
    }

    public Collection<Perfume> recuperaPerfume() throws IOException {
        try (ObjectInputStream gravador= new ObjectInputStream(new FileInputStream(arquivosDoPerfume))){
            ArrayList<Perfume> perfumesRecuperados = (ArrayList<Perfume>) gravador.readObject();
            return perfumesRecuperados;
        }catch (ClassNotFoundException e){
            throw  new IOException(e);
        }


    }

}

