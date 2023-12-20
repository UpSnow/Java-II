package arthur.cezar.projetopoofinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class ControllerMain implements Initializable {
    @FXML
    private  AnchorPane janelamain;

    private InterfaceBiblioteca interfaceBiblioteca = new SistemaBiblioteca();
    private Gravador gravador = new Gravador();

    @FXML
    private void Adicionar(ActionEvent event){
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("Add.fxml"));
            AnchorPane root = fx.load();


            Image fundo = new Image(getClass().getResourceAsStream("/imagens/_A leitura muda o mundo dia do livro minimalista Post para Instagram.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janelamain.getScene().getWindow();
            mainScene.setScene(scene);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
    @FXML
    private void Remover(ActionEvent event){
        try {
            FXMLLoader fx = new FXMLLoader(getClass().getResource("Remover.fxml"));
            AnchorPane root = fx.load();


            Image fundo = new Image(getClass().getResourceAsStream("/imagens/_A leitura muda o mundo dia do livro minimalista Post para Instagram.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janelamain.getScene().getWindow();
            mainScene.setScene(scene);




        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void Pesquisar(ActionEvent event){
        try{
            FXMLLoader fx = new FXMLLoader(getClass().getResource("Pesquisar.fxml"));
            AnchorPane root = fx.load();

            Image fundo = new Image(getClass().getResourceAsStream("/imagens/_A leitura muda o mundo dia do livro minimalista Post para Instagram.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janelamain.getScene().getWindow();
            mainScene.setScene(scene);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void Informacao(ActionEvent event){

        try{
            FXMLLoader fx = new FXMLLoader(getClass().getResource("Informacao.fxml"));
            AnchorPane root = fx.load();

            Image fundo = new Image(getClass().getResourceAsStream("/imagens/_A leitura muda o mundo dia do livro minimalista Post para Instagram.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janelamain.getScene().getWindow();
            mainScene.setScene(scene);

        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @FXML
    private void ListaDeLivros(ActionEvent event){

        try{
            FXMLLoader fx = new FXMLLoader(getClass().getResource("ListaDeLivros.fxml"));
            AnchorPane root = fx.load();

            Image fundo = new Image(getClass().getResourceAsStream("/imagens/_A leitura muda o mundo dia do livro minimalista Post para Instagram.png"));

            BackgroundSize tamanho = new BackgroundSize(1.0,1.0, true,true,false,false);
            BackgroundImage imagem = new BackgroundImage(fundo, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, tamanho);
            Background fundoimagem = new Background(imagem);
            root.setBackground(fundoimagem);

            Scene scene = new Scene(root,400,400);
            Stage mainScene = (Stage) janelamain.getScene().getWindow();
            mainScene.setScene(scene);

        }catch (IOException e){
            e.printStackTrace();
        }


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
