package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.retweet;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class _2_ModelController implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._1;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._2;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._3;
    String fxmlnext = fxml.getdatos();
    @FXML
    public ImageView closeimg;
    @FXML
    public ImageView nextimg;

    @FXML
    public ImageView previmg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        retweet.dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        retweet.cambiarPantalla(nextimg,fxmlnext,getClass());
        retweet.cambiarPantalla(previmg,fxmlprev,getClass());
        retweet.cerrarApp(closeimg);

    }
}
