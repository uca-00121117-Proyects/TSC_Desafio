package Main.Controller._3_controllers;

import Main.Controller._3_DomainController;
import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class _3_1 implements Initializable {
    private Stage mStage;

    public void setStage(Stage mStage) {
        this.mStage = mStage;
    }
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
    private void primerAct(ActionEvent event) throws Exception{
        cambiar("_3_1",event);
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar("_3_2",event);
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar("_3_3",event);
    }
    @FXML
    private void cuartaAct(ActionEvent event) throws Exception{
        cambiar("_3_4",event);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void cambiar(String ui,ActionEvent event) throws Exception {

    }
}
//    Parent blah = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+ui+".fxml"));
//    Scene scene = new Scene(blah);
//    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//                appStage.show();