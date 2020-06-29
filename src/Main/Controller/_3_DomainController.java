package Main.Controller;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
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
    private void primerAct(ActionEvent event) throws Exception{
      cambiar("_3_1");
    }
    @FXML
    private void segundaAct(ActionEvent event) throws Exception{
        cambiar("_3_2");
    }
    @FXML
    private void tercerAct(ActionEvent event) throws Exception{
        cambiar("_3_3");
    }
    @FXML
    private void cuartaAct(ActionEvent event) throws Exception{
        cambiar("_3_4");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("************       "+ fxmlthis+"      **************");
        System.out.println("Next : "+ fxmlnext);
        System.out.println("Prev : "+ fxmlprev);
        nextimg.setOnMouseClicked((MouseEvent e) ->{
            Stage stage = (Stage) ((Node)nextimg).getScene().getWindow();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+fxmlnext+".fxml"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Scene scene = new Scene(root, Values.AppWidht(), Values.AppHeight());
            stage.setScene(scene);
        });
        previmg.setOnMouseClicked((MouseEvent e) ->{
            Stage stage = (Stage) ((Node)previmg).getScene().getWindow();
            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("/Main/Resources/fxml/"+fxmlprev+".fxml"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Scene scene = new Scene(root, Values.AppWidht(), Values.AppHeight());
            stage.setScene(scene);
        });
        closeimg.setOnMouseClicked((MouseEvent e) ->{
            Stage stage = (Stage) closeimg.getScene().getWindow();
            stage.close();
        });
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
}
