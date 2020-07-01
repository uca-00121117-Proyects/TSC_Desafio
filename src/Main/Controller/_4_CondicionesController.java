package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.routes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.*;


public class _4_CondicionesController implements Initializable {
    // Valores de fxml principales
    fxmlvalues fxmlp = fxmlvalues._3;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._4;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._5;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path4_1 = routes.r_4_1;
    String d_4_1 = path4_1.getroutes();
    routes path4_2 = routes.r_4_2;
    String d_4_2 = path4_2.getroutes();
    routes path4_3 = routes.r_4_3;
    String d_4_3 = path4_3.getroutes();


    @FXML
    public ImageView closeimg;
    @FXML
    public ImageView nextimg;
    @FXML
    public ImageView previmg;
    @FXML
    private Button primero;
    @FXML
    private Button segundo;
    @FXML
    private Button tercero;
    @FXML
    private Button cuarto;
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
    Button LastButton = primero;

    @FXML
    private void primerAct(ActionEvent event) throws Exception{
      cambiar(d_4_1,getClass(),panelborder);
       estilo(primero);
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar(d_4_2,getClass(),panelborder);
        estilo(segundo);
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar(d_4_3,getClass(),panelborder);
        estilo(tercero);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        primer();
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        tamanios();
        cambiarPantalla(nextimg,fxmlnext,getClass());
        cambiarPantalla(previmg,fxmlprev,getClass());
        cerrarApp(closeimg);
    }

    public void primer(){
        cambiar(d_4_1,getClass(),panelborder);
       estilo(primero);
    }
    public void estilo(Button thisbutton){
        reiniciarestilo(LastButton);
        darestilo(thisbutton,LastButton);
        LastButton=thisbutton;
    }
    public void tamanios(){
        //Dando tamanios a las cosas segun la pantalla
        superior.setPrefHeight(Values.BarraY());
        inferior.setPrefHeight(Values.BarraY());
        panelmenubar.setPrefWidth(Values.PanelAncho());
        superior.setPrefWidth(Values.AppWidht());
        inferior.setPrefWidth(Values.AppWidht());
        panel.setTopAnchor(panelmenubar,Values.PanelYInicio());
        panel.setBottomAnchor(panelmenubar,Values.PanelYInicio());
        panel.setTopAnchor(panelvista,Values.PanelYInicio());
        panel.setLeftAnchor(panelvista, Values.PanelAncho());
        panel.setBottomAnchor(panelvista, Values.BarraY());

    }

}
