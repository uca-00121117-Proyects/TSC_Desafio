package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import Main.Resources.Values.retweet;
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
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class _3_DomainController implements Initializable {


    fxmlvalues fxmlp = fxmlvalues._2;
    String fxmlprev = fxmlp.getdatos();
    fxmlvalues fxmlt = fxmlvalues._3;
    String fxmlthis = fxmlt.getdatos();
    fxmlvalues fxml = fxmlvalues._4;
    String fxmlnext = fxml.getdatos();
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
    Button LastButton = primero;

    @FXML
    private void primerAct(ActionEvent event) throws Exception{
      cambiar("_3_1");
      reiniciarestilo(LastButton);
      LastButton=primero;
      darestilo(primero);
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar("_3_2");
        reiniciarestilo(LastButton);
        LastButton=segundo;
        darestilo(segundo);
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar("_3_3");
        reiniciarestilo(LastButton);
        LastButton=tercero;
        darestilo(tercero);
    }
    @FXML
    private void cuartaAct(ActionEvent event) throws Exception{
        cambiar("_3_4");
        reiniciarestilo(LastButton);
        LastButton=cuarto;
        darestilo(cuarto);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cambiar("_3_1");
        retweet.dondeestacr7(fxmlprev,fxmlthis,fxmlnext);
        retweet.cambiarPantalla(nextimg,fxmlnext,getClass());
        retweet.cambiarPantalla(previmg,fxmlprev,getClass());
        retweet.cerrarApp(closeimg);
    }
    public void cambiar(String ui){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        panelborder.setCenter(root);
    }

    public void darestilo(Button boton){
        if(boton!=null){
        boton.setStyle("fx-background-color: #4a148c;-fx-background-color: #4a148c;\n" +
                "        -fx-shadow-highlight-color:#4a148c;\n" +
                "        -fx-outer-border:#4a148c;\n" +
                "        -fx-inner-border:#4a148c ;\n" +
                "        -fx-body-color:#4a148c;\n" +
                "        -fx-text-fill: white;\n" +
                "        -fx-focus-color: white;\n" +
                "        opacity: 0.6;");}
    }
    public void reiniciarestilo(Button boton){
        if(boton!=null) {
            boton.setStyle("     -fx-background-color: #484848;\n");
        }
    }

}
