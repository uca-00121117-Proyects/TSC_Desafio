package Main.Controller;

import Main.Resources.Values.*;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static Main.Resources.Values.retweet.*;

public class _5_MallaController implements Initializable {
    fxmlvalues fxmlp = fxmlvalues._4;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._5;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._6;
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
        cambiar(d_5_1,getClass(),panelborder);
        estilo(primero,LastButton);
        LastButton=1;
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar(d_5_2,getClass(),panelborder);
        estilo(segundo,LastButton);
        LastButton=2;
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar(d_5_3,getClass(),panelborder);
        estilo(tercero,LastButton);
        LastButton=3;
    }
    @FXML
    private void cuartoAct(ActionEvent event) throws Exception{
        cambiar(d_5_4,getClass(),panelborder);
        estilo(cuarto,LastButton);
        LastButton=4;
    }
    @FXML
    private void quintoAct(ActionEvent event) throws Exception{
        cambiar(d_5_5,getClass(),panelborder);
        estilo(quinto,LastButton);
        LastButton=5;
    }
    @FXML
    private void sextoAct(ActionEvent event) throws Exception{
        cambiar(d_5_6,getClass(),panelborder);
        estilo(sexto,LastButton);
        LastButton=6;
    }

    @FXML
    private void septimoAct(ActionEvent event) throws Exception{
        cambiar(d_5_7,getClass(),panelborder);
        estilo(septimo,LastButton);
        LastButton=7;
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
        cambiar(d_5_1,getClass(),panelborder);
        estiloInicial(primero);
    }
    public void estilo(Button thisbutton,Integer last){
        StyleValues.stylebuttoncontroller(last,thisbutton,primero,segundo,tercero,cuarto,quinto,sexto,septimo,null,null,null);
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
        TamaniosValues.tamaniobotones(primero,segundo,tercero,cuarto,quinto,sexto,septimo,null,null,null);
        TamaniosValues.tamaniopanelmenu(panel,panelmenubar);
        TamaniosValues.posicionpanelfragmento(panel,panelvista);
    }
}
