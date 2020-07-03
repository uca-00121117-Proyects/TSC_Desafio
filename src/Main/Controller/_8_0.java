package Main.Controller;

import Main.Resources.Values.*;
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

public class _8_0 implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._7_6;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._8;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._8_1;
    String fxmlnext = fxml.getdatos();
    //Rutas pantallas del menu
    routes path8_1 = routes.r_8_0_1;
    String d_8_1 = path8_1.getroutes();
    routes path8_2 = routes.r_8_0_2;
    String d_8_2 = path8_2.getroutes();

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
        cambiar(d_8_1, getClass(), panelborder);
        estilo(primero,LastButton);
        LastButton = 1;
    }

    @FXML
    private void segundaAct(ActionEvent event) throws Exception {
        cambiar(d_8_2, getClass(), panelborder);
        estilo(segundo,LastButton);
        LastButton = 2;
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
        cambiar(d_8_1,getClass(),panelborder);
        estiloInicial(primero);
    }
    public void estilo(Button thisbutton,Integer last){
        StyleValues.stylebuttoncontroller(last,thisbutton,primero,segundo,null,null,null,null,null,null,null,null);
    }
    public void estiloInicial(Button thisbutton){
        reiniciarestilo(primero,primero.getText().length());
        defaultestilofocus(primero,primero.getText().length());
    }
    public void iniciartodo(){
        estilo(primero,LastButton);
        defaultestilo(segundo,segundo.getText().length());
    }

    public void tamanios() {
        TamaniosValues.tamaniosbarras(superior,inferior);
        //Le sumo 20 por la barra scroll
        TamaniosValues.tamaniobotones(primero,segundo,null,null,null,null,null,null,null,null);
        TamaniosValues.tamaniopanelmenu(panel,panelmenubar);
        TamaniosValues.posicionpanelfragmento(panel,panelvista);
    }
}
//tamanio :https://www.javatpoint.com/java-double-to-string
// boton estilo : https://stackoverflow.com/questions/22047457/how-to-change-the-text-font-size-in-javafx
