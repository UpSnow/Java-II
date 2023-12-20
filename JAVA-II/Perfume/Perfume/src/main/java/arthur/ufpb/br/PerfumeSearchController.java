package arthur.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class PerfumeSearchController implements ActionListener {

    private SistemaInterface sistema;
    private JFrame JanelaPrincipal;

    public PerfumeSearchController(SistemaInterface sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.JanelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(null,"Qual é o nome do perfume?","PERGUNTA",JOptionPane.QUESTION_MESSAGE) ;
        String codigo = JOptionPane.showInputDialog(null,"Qual é o codigo do perfume","PERGUNTA",JOptionPane.QUESTION_MESSAGE);
        Collection<Perfume> Pesquisar = sistema.pesquisaPerfume(nome,codigo);
        if (Pesquisar.size()>0){
            JOptionPane.showMessageDialog(JanelaPrincipal,
                    "Perfume encontrado");
            for (Perfume p : Pesquisar){
                JOptionPane.showMessageDialog(JanelaPrincipal, p.toString(),"INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(JanelaPrincipal,
                    "Perfume não encontrado","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }
}
