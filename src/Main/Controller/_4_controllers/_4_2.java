package Main.Controller._4_controllers;

import Main.Resources.Values.Values;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _4_2 implements Initializable {
    @FXML
    public ImageView imagen1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen2X());
        imagen1.setFitWidth(Values.Imagen2X());
    }

}
