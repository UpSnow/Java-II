package arthur.ufpb.br;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Collection;

public class menuPerfume extends JFrame {

    JLabel linha1, linha2;
    JMenuBar barraDeMenu = new JMenuBar();
    ImageIcon imagem = new ImageIcon("src/main/resources/Black Gold Simple Elegant Perfume Logo.png");
    SistemaInterface sistemaPerfume = new SistemaPerfume();
    GravadoDePerfume gravador = new GravadoDePerfume();



    public menuPerfume(){

        try {
            Collection<Perfume> perfumeRecuperados = gravador.recuperaPerfume();
            sistemaPerfume.setPerfume(perfumeRecuperados);
            for (Perfume p : perfumeRecuperados){
                JOptionPane.showMessageDialog(null,"Perfume:" + p.getNome(),"INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }

        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Problema ao recuperar perfumes","ERRO",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        setTitle("Loja de Perfume");
        setSize(800,600);
        setLocation(150,150);
        setResizable(true);
        setBackground(Color.WHITE);
        linha1 = new JLabel("Sistema de Perfume",JLabel.CENTER);
        linha1.setForeground(Color.BLACK);
        linha1.setFont(new Font("Serif",Font.BOLD,24));
        linha2 = new JLabel(imagem,JLabel.CENTER);
        imagem.setImage(imagem.getImage().getScaledInstance(1000,400,1000));
        setLayout(new GridLayout(3,1));
        add(linha1);
        add(linha2);
        add(new JLabel());
        JMenu menuCadastra = new JMenu("Cadastra");
        JMenuItem menuCadastraPefume = new JMenuItem("Cadastra perfume");
        menuCadastra.add(menuCadastraPefume);
        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem menuRemoverPerfume = new JMenuItem("Pesquisar perfume");
        menuPesquisar.add(menuRemoverPerfume);
        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuPesquisarPerfume = new JMenuItem("Remover perfume");
        menuRemover.add(menuPesquisarPerfume);
        JMenu menuSalva = new JMenu("Salva");
        JMenuItem menuSalvaPerfume = new JMenuItem("Salva perfume");
        menuSalva.add(menuSalvaPerfume);
        menuPesquisarPerfume.addActionListener(
               new PerfumeRemoverController(sistemaPerfume, this));
        menuRemoverPerfume.addActionListener(
               new PerfumeSearchController(sistemaPerfume,this));
        menuCadastraPefume.addActionListener(
                new PerfumeAddController(sistemaPerfume,this));
        menuSalvaPerfume.addActionListener((ae)->{
            try{
                gravador.gravaPerfume(sistemaPerfume.getPerfumes());
                JOptionPane.showMessageDialog(this,"Perfume foi salvo","INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }catch (IOException e) {
                JOptionPane.showMessageDialog(this,"Problema ao gravar perfumes","ERRO",JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        });


        barraDeMenu.add(menuCadastra);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);
        barraDeMenu.add(menuSalva);
        setJMenuBar(barraDeMenu);
    }

    public static void main(String []args){
        JFrame janela = new menuPerfume();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
