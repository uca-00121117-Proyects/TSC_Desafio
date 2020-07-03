package Main.Controller._7_controllers;

import Main.Resources.Values.TamaniosValues;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class _7_3 implements Initializable {
    @FXML
    public AnchorPane panelf;
    @FXML
    public BorderPane vistaf;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TamaniosValues.bordefragmento(panelf,vistaf);

    }

}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();