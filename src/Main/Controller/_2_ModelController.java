package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.retweet.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.*;

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
    public ImageView imagen1;
    @FXML
    public ImageView previmg;
    @FXML
    public AnchorPane superior;
    @FXML
    public AnchorPane inferior;
    @FXML
    public AnchorPane panelvista;
    @FXML
    public AnchorPane panel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cambiamos tamanios
        tamanios();
        //mostramos donde estamos
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        //siguiente pantalla
        cambiarPantalla(nextimg,fxmlnext,getClass());
        //pantalla anterior
        cambiarPantalla(previmg,fxmlprev,getClass());
        //cerrar app
        cerrarApp(closeimg);
    }
    public void tamanios(){
        superior.setPrefHeight(Values.BarraY());
        inferior.setPrefHeight(Values.BarraY());
        superior.setPrefWidth(Values.AppHeight());
        inferior.setPrefWidth(Values.AppHeight());
        panel.setTopAnchor(panelvista,Values.BarraY());
        panel.setBottomAnchor(panelvista,Values.BarraY());
        imagen1.setFitHeight(Values.Imagen1Y());
        imagen1.setFitWidth(Values.Imagen1X());
    }

}
