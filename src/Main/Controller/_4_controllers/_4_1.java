package Main.Controller._4_controllers;

import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _4_1 implements Initializable {
    @FXML
    public AnchorPane panelf;
    @FXML
    public BorderPane vistaf;
    @FXML
    public ImageView imagen1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TamaniosValues.bordefragmento(panelf,vistaf);
        imagen1.setFitHeight(Values.Imagen2X());
        imagen1.setFitWidth(Values.Imagen2X());
    }

}
