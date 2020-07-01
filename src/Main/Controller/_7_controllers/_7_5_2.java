package Main.Controller._7_controllers;

import Main.Resources.Values.Values;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class _7_5_2 implements Initializable {
    private Stage mStage;

    public void setStage(Stage mStage) {
        this.mStage = mStage;
    }
    @FXML
    public ImageView imagen1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen0_5Y());
        imagen1.setFitWidth(Values.Imagen0_5X());
    }
}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();