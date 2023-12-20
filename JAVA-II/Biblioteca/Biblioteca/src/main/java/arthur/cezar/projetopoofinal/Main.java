package arthur.cezar.projetopoofinal;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import javafx.stage.Stage;


import java.io.IOException;



public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Main.fxml"));
        AnchorPane root = fxmlLoader.load();

        Image fundo = new Image(getClass().getResourceAsStream("/imagens/Post para instagram moderno dia mundial do livro marrom.png"));

        BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
        BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
        Background fundoimagem = new Background(imagem);
        root.setBackground(fundoimagem);

        Scene scene = new Scene(root, 400, 400);
        stage.setResizable(false);
        stage.setTitle("Estante de Livros");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}