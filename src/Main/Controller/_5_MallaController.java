package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.routes;
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
    Button LastButton = primero;

    @FXML
    private void primerAct(ActionEvent event) throws Exception{
        cambiar(d_5_1,getClass(),panelborder);
        estilo(primero);
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar(d_5_2,getClass(),panelborder);
        estilo(segundo);
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar(d_5_3,getClass(),panelborder);
        estilo(tercero);
    }
    @FXML
    private void cuartoAct(ActionEvent event) throws Exception{
        cambiar(d_5_4,getClass(),panelborder);
        estilo(cuarto);
    }
    @FXML
    private void quintoAct(ActionEvent event) throws Exception{
        cambiar(d_5_5,getClass(),panelborder);
        estilo(quinto);
    }
    @FXML
    private void sextoAct(ActionEvent event) throws Exception{
        cambiar(d_5_6,getClass(),panelborder);
        estilo(sexto);
    }

    @FXML
    private void septimoAct(ActionEvent event) throws Exception{
        cambiar(d_5_7,getClass(),panelborder);
        estilo(septimo);
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
        cambiar(d_5_1,getClass(),panelborder);
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
        //Le sumo 20 por la barra scroll
        panelmenubar.setPrefWidth(Values.PanelAncho()+20);
        primero.setPrefWidth(Values.PanelAncho());
        segundo.setPrefWidth(Values.PanelAncho());
        tercero.setPrefWidth(Values.PanelAncho());
        cuarto.setPrefWidth(Values.PanelAncho());
        quinto.setPrefWidth(Values.PanelAncho());
        sexto.setPrefWidth(Values.PanelAncho());
        septimo.setPrefWidth(Values.PanelAncho());
        superior.setPrefWidth(Values.AppWidht());
        inferior.setPrefWidth(Values.AppWidht());
        panel.setTopAnchor(panelmenubar,Values.PanelYInicio());
        panel.setBottomAnchor(panelmenubar,Values.PanelYInicio());
        panel.setTopAnchor(panelvista,Values.PanelYInicio());
        //Lo mismo le sumo 20 por el scroll
        panel.setLeftAnchor(panelvista, Values.PanelAncho()+20);
        panel.setBottomAnchor(panelvista, Values.BarraY());

    }
}
