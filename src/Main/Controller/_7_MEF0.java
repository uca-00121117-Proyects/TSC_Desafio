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

public class _7_MEF0 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._6;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._7_0;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._7;

    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path5_1 = routes.r_5_1;
    String d_5_1 = path5_1.getroutes();
    routes path5_2 = routes.r_5_2;
    String d_5_2 = path5_2.getroutes();
    routes path5_3 = routes.r_5_3;
    String d_5_3 = path5_3.getroutes();
    routes path5_4 = routes.r_5_4;
    String d_5_4 = path5_4.getroutes();
    routes path5_5 = routes.r_5_5;
    String d_5_5 = path5_5.getroutes();
    routes path5_6 = routes.r_5_6;
    String d_5_6 = path5_6.getroutes();
    routes path5_7 = routes.r_5_7;
    String d_5_7 = path5_7.getroutes();
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
