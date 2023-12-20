package arthur.cezar.projetopoofinal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class ControllerPesquisar implements Initializable {

    @FXML
    private Text TxtMensagem;

    @FXML
    private AnchorPane janela;

    @FXML
    private TextField txtautor;

    @FXML
    private TextField txtlivro;




    private InterfaceBiblioteca interfaceBiblioteca = new SistemaBiblioteca();

    private Gravador gravador = new Gravador();



    @FXML
    void onBtnPesquisar(ActionEvent event) {
        String livro = txtlivro.getText();
        String autor = txtautor.getText();

        Collection<Bliblioteca> blibliotecaCollection = interfaceBiblioteca.pesquisaLivro(livro,autor);
        if(blibliotecaCollection.size()>0){
            for (Bliblioteca b : blibliotecaCollection){
                TxtMensagem.setText("Livro encontrado\n" + b.toString());
            }
        }else {
            TxtMensagem.setText("Livro não encontrado");
        }
        txtlivro.setText("");
        txtautor.setText("");




        try {
            gravador.gravarBiblioteca(interfaceBiblioteca.getLivros());
        }catch (IOException e){
            e.printStackTrace();

        }

    }

    @FXML
    private void onBtnvoltar(ActionEvent event){
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("Main.fxml"));
            AnchorPane root = fx.load();


            Image fundo = new Image(getClass().getResourceAsStream("/imagens/Post para instagram moderno dia mundial do livro marrom.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janela.getScene().getWindow();
            mainScene.setScene(scene);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Collection<Bliblioteca> dadosDosLivrosRecuperados = gravador.recuperaBiblioteca();
            interfaceBiblioteca.setLivros(dadosDosLivrosRecuperados);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}