package Main.Controller._3_controllers;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _3_2 implements Initializable {
    private Stage mStage;



    public void setStage(Stage mStage) {
        this.mStage = mStage;
    }

    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView imagen2;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen1_3Y());
        imagen1.setFitWidth(Values.Imagen1_3X());
        imagen2.setFitHeight(Values.Imagen1_3Y());
        imagen2.setFitWidth(Values.Imagen1_3X());
    }
}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();