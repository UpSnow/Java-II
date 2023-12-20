package arthur.cezar.projetopoofinal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class ControllerListaDeLivros implements Initializable {

    private InterfaceBiblioteca interfaceBiblioteca = new SistemaBiblioteca();
    private  Gravador gravador = new Gravador();


    @FXML
    private TableColumn<Bliblioteca, String> Codigo;

    @FXML
    private TableColumn<Bliblioteca, String> NomeAutor;

    @FXML
    private TableColumn<Bliblioteca, String> Nomelivro;

    @FXML
    private TableColumn<Bliblioteca, Integer> Paginas;

    @FXML
    private TableView<Bliblioteca> listaLivros;

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

        try {
            Collection<Bliblioteca> dadosDosLivrosRecuperados = gravador.recuperaBiblioteca();
            interfaceBiblioteca.setLivros(dadosDosLivrosRecuperados);

            this.Paginas.setCellValueFactory(new PropertyValueFactory<>("quantidadePagina"));
            this.Codigo.setCellValueFactory(new PropertyValueFactory<>("codigoDolivro"));
            this.NomeAutor.setCellValueFactory(new PropertyValueFactory<>("NomeAutor"));
            this.Nomelivro.setCellValueFactory(new PropertyValueFactory<>("NomeDoLivro"));

            ObservableList<Bliblioteca> observableList = FXCollections.observableArrayList(dadosDosLivrosRecuperados);
            listaLivros.setItems(observableList);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
