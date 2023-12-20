package arthur.cezar.projetopoofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerInformacao implements Initializable {

    @FXML
    private Text TxtMensagem;

    @FXML
    private AnchorPane janela;

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
    if(this.TxtMensagem != null) {
        TxtMensagem.setText("Bem-vindo ao nosso programa de biblioteca!\n" +
                "\n" +
                "Este programa foi desenvolvido para ajudá-lo a \n" +
                "gerenciar as informações dos livros em sua biblioteca.\n" +
                "Com ele, você poderá cadastrar novos livros, pesquisar \n" +
                "por livros existentes e removê-los conforme necessário.");

        }
    }
}
