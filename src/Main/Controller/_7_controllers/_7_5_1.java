package Main.Controller._7_controllers;

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

public class _7_5_1 implements Initializable {
    @FXML
    public AnchorPane panelf;
    @FXML
    public BorderPane vistaf;
    @FXML
    public ImageView imagen1;
    @FXML
    public ImageView imagen2;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imagen1.setFitHeight(Values.Imagen4Y());
        imagen1.setFitWidth(Values.Imagen4X());
        imagen2.setFitHeight(Values.Imagen0_5Y());
        imagen2.setFitWidth(Values.Imagen0_5X());
        TamaniosValues.bordefragmento(panelf,vistaf);

    }
}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();