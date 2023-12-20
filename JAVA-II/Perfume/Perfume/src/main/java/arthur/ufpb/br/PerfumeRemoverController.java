package arthur.ufpb.br;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfumeRemoverController implements ActionListener {
    private SistemaInterface sistema;
    private JFrame JanelaPrincial;

    public PerfumeRemoverController(SistemaInterface sistema, JFrame janelaPrincial){
        this.sistema = sistema;
        this.JanelaPrincial = janelaPrincial;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = JOptionPane.showInputDialog(null,"Qual é o codigo do perfume","PERGUNTA",JOptionPane.PLAIN_MESSAGE);

        boolean remover = sistema.removePerfume(codigo);
        if (remover){
            JOptionPane.showMessageDialog(JanelaPrincial,
                    "Perfume removido ","INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(JanelaPrincial,
                    "Perfume não foi encontrado." +
                    "Operação não realizada","ERRO",JOptionPane.ERROR_MESSAGE);
        }

    }
}
