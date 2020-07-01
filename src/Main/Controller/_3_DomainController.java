package Main.Controller;

import Main.Controller._3_controllers._3_1;
import Main.Resources.Values.*;
import com.sun.jdi.Value;
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
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.nuevaScena;
import static Main.Resources.Values.retweet.*;
import static Main.Resources.Values.routes.r_3_1;


public class _3_DomainController implements Initializable {
    // Valores de fxml principales
    fxmlvalues fxmlp = fxmlvalues._2;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._3;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._4;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path3_1 = routes.r_3_1;
    String d_3_1 = path3_1.getroutes();
    routes path3_2 = routes.r_3_2;
    String d_3_2 = path3_2.getroutes();
    routes path3_3 = routes.r_3_3;
    String d_3_3 = path3_3.getroutes();


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
    public Integer LastButton = 1;

    @FXML
    private void primerAct(ActionEvent event) throws Exception{
      cambiar(d_3_1,getClass(),panelborder);
       estilo(primero,LastButton);
        LastButton=1;
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar(d_3_2,getClass(),panelborder);
        estilo(segundo,LastButton);
        LastButton=2;
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar(d_3_3,getClass(),panelborder);
        estilo(tercero,LastButton);
        LastButton=3;
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Mostramos donde estamos
        dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        //damos tamanios
        tamanios();
        iniciartodo();
        //mostramos la primera pantalla del menu
        primer();
        //Cambios de pantalla
        cambiarPantalla(nextimg,fxmlnext,getClass());
        cambiarPantalla(previmg,fxmlprev,getClass());
        //Cerrar
        cerrarApp(closeimg);
    }
    //TODO() Agregar que gire
    public void primer(){
        cambiar(d_3_1,getClass(),panelborder);
        estiloInicial(primero);
    }
    public void estilo(Button thisbutton,Integer last){
        switch(last) {
            case 1:
                reiniciarestilo(primero,primero.getText().length());
                darestilo(thisbutton,primero,thisbutton.getText().length(),primero.getText().length());
            case 2:
                reiniciarestilo(segundo,segundo.getText().length());
                darestilo(thisbutton,segundo,thisbutton.getText().length(),segundo.getText().length());
            case 3:
                reiniciarestilo(tercero,tercero.getText().length());
                darestilo(thisbutton,tercero,thisbutton.getText().length(),tercero.getText().length());
            default:
                reiniciarestilo(primero,primero.getText().length());
                darestilo(thisbutton,primero,thisbutton.getText().length(),primero.getText().length());
        }
    }
    public void estiloInicial(Button thisbutton){
        reiniciarestilo(primero,primero.getText().length());
        defaultestilofocus(primero,primero.getText().length());
    }
    public void iniciartodo(){
        estilo(primero,LastButton);
        defaultestilo(segundo,segundo.getText().length());
        defaultestilo(tercero,tercero.getText().length());
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
