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

public class _7_MEF6 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._7_5;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._7_6;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._8;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path7_1 = routes.r_7_6_1;
    String d_7_1 = path7_1.getroutes();
    routes path7_2 = routes.r_7_6_2;
    String d_7_2 = path7_2.getroutes();
    routes path7_3 = routes.r_7_6_3;
    String d_7_3 = path7_3.getroutes();
    routes path7_4 = routes.r_7_6_4;
    String d_7_4 = path7_4.getroutes();
    routes path7_5 = routes.r_7_6_5;
    String d_7_5 = path7_5.getroutes();
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
    private Button quinto;
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
    private void primerAct(ActionEvent event) throws Exception {
        cambiar(d_7_1, getClass(), panelborder);
        estilo(primero,LastButton);
        LastButton = 1;
    }

    @FXML
    private void segundaAct(ActionEvent event) throws Exception {
        cambiar(d_7_2, getClass(), panelborder);
        estilo(segundo,LastButton);
        LastButton = 2;
    }

    @FXML
    private void tercerAct(ActionEvent event) throws Exception {
        cambiar(d_7_3, getClass(), panelborder);
        estilo(tercero,LastButton);
        LastButton = 3;
    }
    @FXML
    private void cuartoAct(ActionEvent event) throws Exception {
        cambiar(d_7_4, getClass(), panelborder);
        estilo(cuarto,LastButton);
        LastButton = 4;
    }
    @FXML
    private void quintoAct(ActionEvent event) throws Exception {
        cambiar(d_7_5, getClass(), panelborder);
        estilo(quinto,LastButton);
        LastButton = 5;
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

    public void primer(){
        cambiar(d_7_1,getClass(),panelborder);
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
            case 4:
                reiniciarestilo(cuarto,cuarto.getText().length());
                darestilo(thisbutton,cuarto,thisbutton.getText().length(),cuarto.getText().length());
            case 5:
                reiniciarestilo(quinto,quinto.getText().length());
                darestilo(thisbutton,quinto,thisbutton.getText().length(),quinto.getText().length());
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

    public void tamanios() {
        superior.setPrefHeight(Values.BarraY());
        inferior.setPrefHeight(Values.BarraY());
        panelmenubar.setPrefWidth(Values.PanelAncho());
        superior.setPrefWidth(Values.AppWidht());
        inferior.setPrefWidth(Values.AppWidht());
        panel.setTopAnchor(panelmenubar, Values.PanelYInicio());
        panel.setBottomAnchor(panelmenubar, Values.PanelYInicio());
        panel.setTopAnchor(panelvista, Values.PanelYInicio());
        panel.setLeftAnchor(panelvista, Values.PanelAncho());
        panel.setBottomAnchor(panelvista, Values.BarraY());
//        imagen1.setFitHeight(Values.Imagen1Y());
//        imagen1.setFitWidth(Values.Imagen1X());
    }


}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx
