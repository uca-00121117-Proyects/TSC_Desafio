package Main.Controller;

import Main.Resources.Values.TamaniosValues;
import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.routes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.*;

public class _7_MEF3 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._7_2;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._7_3;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._7_4;
    String fxmlnext = fxml.getdatos();

    @FXML
    public ImageView closeimg;
    @FXML
    public ImageView nextimg;
    @FXML
    public ImageView previmg;
    @FXML
    public ImageView imagen1;
    @FXML
    public BorderPane panelborder;
    @FXML
    public AnchorPane panel;
    @FXML
    public AnchorPane dominiobar;
    @FXML
    public AnchorPane superior;
    @FXML
    public AnchorPane inferior;
    @FXML
    public AnchorPane panelmenubar;
    @FXML
    public AnchorPane panelvista;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //mostramos donde estamos
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        //cambiamos tamanios
        tamanios();
        //siguiente pantalla
        cambiarPantalla(nextimg,fxmlnext,getClass());
        //pantalla anterior
        cambiarPantalla(previmg,fxmlprev,getClass());
        //cerrar app
        cerrarApp(closeimg);
    }
    public void tamanios(){
        TamaniosValues.tamaniosbarras(superior,inferior);
        TamaniosValues.posicionpanelgrande(panel,panelvista);
        TamaniosValues.tamanioimagen01(imagen1);
    }

}
