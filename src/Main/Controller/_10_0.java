package Main.Controller;

import Main.Resources.Values.StyleValues;
import Main.Resources.Values.TamaniosValues;
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
import static Main.Resources.Values.retweet.defaultestilo;

public class _10_0 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._9_3;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._10;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._10_1;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes p9_1 = routes.r_10_0_1;
    String d1 = p9_1.getroutes();
    routes p9_2 = routes.r_10_0_2;
    String d2 = p9_2.getroutes();
    routes p9_3 = routes.r_10_0_3;
    String d3 = p9_3.getroutes();
    routes p9_4 = routes.r_10_0_4;
    String d4 = p9_4.getroutes();

    //    routes p9_6 = routes.r_5_6;
//    String d6 = p9_6.getroutes();
//    routes p9_7 = routes.r_5_7;
//    String d7 = p9_7.getroutes();
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
    private void primerAct(ActionEvent event) throws Exception{
        cambiar(d1,getClass(),panelborder);
        estilo(primero,LastButton);
        LastButton=1;
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar(d2,getClass(),panelborder);
        estilo(segundo,LastButton);
        LastButton=2;
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar(d3,getClass(),panelborder);
        estilo(tercero,LastButton);
        LastButton=3;
    }
    @FXML
    private void cuartoAct(ActionEvent event) throws Exception{
        cambiar(d4,getClass(),panelborder);
        estilo(cuarto,LastButton);
        LastButton=4;
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
        cambiar(d1,getClass(),panelborder);
        estiloInicial(primero);
    }
    public void estilo(Button thisbutton,Integer last){
        StyleValues.stylebuttoncontroller(last,thisbutton,primero,segundo,tercero,cuarto,quinto,null,null,null,null,null);
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
        TamaniosValues.tamaniosbarras(superior,inferior);
        //Le sumo 20 por la barra scroll
        TamaniosValues.tamaniobotones(primero,segundo,tercero,cuarto,quinto,null,null,null,null,null);
        TamaniosValues.tamaniopanelmenu(panel,panelmenubar);
        TamaniosValues.posicionpanelfragmento(panel,panelvista);
    }
}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx
