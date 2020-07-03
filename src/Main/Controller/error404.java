package Main.Controller;

import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.retweet.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.cerrarApp;


public class error404 implements Initializable {

    @FXML
    public ImageView closeimg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cerrar app
        closeimg.setOnMouseClicked((MouseEvent e) ->{
            System.out.println("Cerrando");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Seguro que quiere salir?", ButtonType.YES, ButtonType.CANCEL);
            alert.showAndWait();
            //ButtonType.NO
            if (alert.getResult() == ButtonType.YES) {
                Stage stage = (Stage) closeimg.getScene().getWindow();
                stage.close();
            }
        });
    }

}