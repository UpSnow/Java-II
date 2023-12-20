package arthur.ufpb.br;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void  main(String []args){
        GravadoDePerfume gravador = new GravadoDePerfume();
        Collection<Perfume> perfumeRecuperados = new ArrayList<>();
        try {
             perfumeRecuperados = gravador.recuperaPerfume();
            for (Perfume p : perfumeRecuperados){
                JOptionPane.showMessageDialog(null,"Perfume:" + p.getNome());
            }

        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Problema ao recuperar perfumes");
            e.printStackTrace();
        }
        String nome = JOptionPane.showInputDialog("Qual é o nome do perfume?");
        String codigo = JOptionPane.showInputDialog("Qual é o codigo do perfume");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Coloque a quantidade"));
        perfumeRecuperados.add(new Perfume(nome,codigo,quantidade));
        try{
            gravador.gravaPerfume(perfumeRecuperados);
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Problema ao gravar perfumes");
            e.printStackTrace();
        }
    }
}
