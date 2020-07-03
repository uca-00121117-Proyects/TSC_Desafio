package Main.Controller._5_controllers;

import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.Values;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _5_2 implements Initializable {
    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView imagen2;
    @FXML
    public AnchorPane panelf;
    @FXML
    public BorderPane vistaf;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen1_3Y());
        imagen1.setFitWidth(Values.Imagen1_3X());
        imagen2.setFitHeight(Values.Imagen1_3Y());
        imagen2.setFitWidth(Values.Imagen1_3X());
        TamaniosValues.bordefragmento(panelf,vistaf);

    }

}
