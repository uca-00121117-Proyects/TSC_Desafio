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

public class _8_4_L implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._8_3;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._8_4;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._8_5;
    String fxmlnext = fxml.getdatos();

    //Rutas pantallas del menu
    routes p1 = routes.r_8_4_1;
    String d1 = p1.getroutes();
    routes p2 = routes.r_8_4_2;
    String d2 = p2.getroutes();
    routes p3 = routes.r_8_4_3;
    String d3 = p3.getroutes();
    routes p4 = routes.r_8_4_4;
    String d4 = p4.getroutes();
    routes p5 = routes.r_8_4_5;
    String d5 = p5.getroutes();
    routes p6 = routes.r_8_4_6;
    String d6 = p6.getroutes();
    routes p7 = routes.r_8_4_7;
    String d7 = p7.getroutes();
    routes p8 = routes.r_8_4_8;
    String d8= p8.getroutes();
    routes p9 = routes.r_8_4_9;
    String d9 = p9.getroutes();
    routes p10 = routes.r_8_4_10;
    String d10 = p10.getroutes();
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
    private Button sexto;
    @FXML
    private Button septimo;
    @FXML
    private Button octavo;
    @FXML
    private Button noveno;
    @FXML
    private Button decimo;
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
    @FXML
    private void quintoAct(ActionEvent event) throws Exception{
        cambiar(d5,getClass(),panelborder);
        estilo(quinto,LastButton);
        LastButton=5;
    }
    @FXML
    private void sextoAct(ActionEvent event) throws Exception{
        cambiar(d6,getClass(),panelborder);
        estilo(sexto,LastButton);
        LastButton=6;
    }
    @FXML
    private void septimoAct(ActionEvent event) throws Exception{
        cambiar(d7,getClass(),panelborder);
        estilo(septimo,LastButton);
        LastButton=7;
    }
    @FXML
    private void octavoAct(ActionEvent event) throws Exception{
        cambiar(d8,getClass(),panelborder);
        estilo(octavo,LastButton);
        LastButton=8;
    }
    @FXML
    private void novenoAct(ActionEvent event) throws Exception{
        cambiar(d9,getClass(),panelborder);
        estilo(noveno,LastButton);
        LastButton=9;
    }
    @FXML
    private void decimoAct(ActionEvent event) throws Exception{
        cambiar(d10,getClass(),panelborder);
        estilo(decimo,LastButton);
        LastButton=10;
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
        StyleValues.stylebuttoncontroller(last,thisbutton,primero,segundo,tercero,cuarto,quinto,sexto,septimo,octavo,noveno,decimo);
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
        TamaniosValues.tamaniobotones(primero,segundo,tercero,cuarto,quinto,sexto,septimo,octavo,noveno,decimo);
        TamaniosValues.tamaniopanelmenuconscroll(panel,panelmenubar);
        TamaniosValues.posicionpanelfragmentoconscrool(panel,panelvista);
    }

}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx
