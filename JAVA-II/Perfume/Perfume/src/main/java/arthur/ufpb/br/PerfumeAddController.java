package arthur.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfumeAddController implements ActionListener {

    private SistemaInterface sistema;
    private JFrame JanelaPrincial;

    public PerfumeAddController(SistemaInterface sistema, JFrame janelaPrincial){
        this.sistema = sistema;
        this.JanelaPrincial = janelaPrincial;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(null,"Qual é o nome do perfume?","PERGUNTA",JOptionPane.QUESTION_MESSAGE) ;
        String codigo = JOptionPane.showInputDialog(null,"Qual é o codigo do perfume","PERGUNTA",JOptionPane.QUESTION_MESSAGE);
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque a quantidade","PERGUNTA",JOptionPane.QUESTION_MESSAGE));
        boolean cadastrou = this.sistema.cadastraPerfume(nome,codigo,quantidade);
        if (cadastrou){
            JOptionPane.showMessageDialog(JanelaPrincial,
                    "Perfume cadastrado.","INFORMAÇão",JOptionPane.INFORMATION_MESSAGE);

        }else {
            JOptionPane.showMessageDialog(JanelaPrincial,
                    "Perfume não foi cadastrado." +
                    "Verifique se já não existe","ERRO",JOptionPane.ERROR_MESSAGE);
        }

    }
}
