package Main.Controller._5_controllers;

import Main.Resources.Values.Values;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _5_1 implements Initializable {
    private Stage mStage;

    public void setStage(Stage mStage) {
        this.mStage = mStage;
    }
    @FXML
    public ImageView imagen1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen2X());
        imagen1.setFitWidth(Values.Imagen2X());
    }

}
