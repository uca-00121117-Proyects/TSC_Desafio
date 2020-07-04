package Main.Controller._9_controllers;

import Main.Controller._3_DomainController;
import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class _9_1_1 implements Initializable {
    @FXML
    public AnchorPane panelf;
    @FXML
    public BorderPane vistaf;
    @FXML
    public ImageView imagen1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TamaniosValues.bordefragmento(panelf,vistaf);
        TamaniosValues.tamanioimagen05(imagen1);
    }
}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();