package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.cerrarApp;
import static Main.Resources.Values.retweet.dondeestacr7;

public class _1_MainController implements Initializable {

    String fxmlprev = "0";
    fxmlvalues fxmlt = fxmlvalues._1;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._2;
    String fxmlnext = fxml.getdatos();
    @FXML
    public Button next;
    @FXML
    public ImageView close;
    @FXML
    public ImageView imagen1;
    @FXML
    private void nextScene(ActionEvent event) throws Exception{
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+fxmlnext+".fxml"));
        Scene scene = new Scene(root, Values.AppWidht(), Values.AppHeight());
        scene.getStylesheets().add("/Main/Resources/css/style.css");
        stage.setScene(scene);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cerrarApp(close);
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        imagen1.setFitHeight(Values.Imagen1Y());
        imagen1.setFitWidth(Values.Imagen1X());
    }
}
