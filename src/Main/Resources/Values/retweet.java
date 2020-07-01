package Main.Resources.Values;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class retweet {
    //Retweet es donde se reutiliza varias cosas que funcionan igual

    //Nueva scena con sus datos
    public static void nuevaScena(Parent root, ImageView image){
        Stage stage = (Stage) ((Node)image).getScene().getWindow();
        Scene scene = new Scene(root, Values.AppWidht(), Values.AppHeight());
        scene.getStylesheets().add("/Main/Resources/css/style.css");
        stage.setScene(scene);
    }
    // Imprimer donde estamos y cual es nuestra pantalla suguienre y anterior
    public static void dondeestacr7(String fxmlprev,String fxmlthis, String fxmlnext ){
        System.out.println("**********************************************");
        System.out.println("************\t\t\t"+ fxmlthis+"\t\t\t**************");
        System.out.println("Prev\t\t\t:\t\t"+ fxmlprev);
        System.out.println("Next\t\t\t:\t\t"+ fxmlnext);
        System.out.println("**********************************************\n");

    }
    //Cambiamos de pantalla con una imagen
    public static void cambiarPantalla(ImageView imagen, String fxml,Class thisclass){
        imagen.setOnMouseClicked((MouseEvent e) ->{

            Parent root = null;
            try {
                root = FXMLLoader.load(thisclass.getResource("/Main/Resources/fxml/"+fxml+".fxml"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            retweet.nuevaScena(root,imagen);
        });
    }
    //Cerramos la app con una imagen
    public static void cerrarApp(ImageView cerrar){
        cerrar.setOnMouseClicked((MouseEvent e) ->{
            Stage stage = (Stage) cerrar.getScene().getWindow();
            stage.close();
        });
    }
    public static void cambiar(String fxml, Class thisclass, BorderPane panel){
        Parent root = null;
        try {
            root = FXMLLoader.load(thisclass.getResource("/Main/Resources/fxml/"+fxml+".fxml"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        panel.setCenter(root);
    }
    public static void darestilo(Button boton,Button anterior){
        if(boton!=null){
            boton.setStyle("fx-background-color: #4a148c;-fx-background-color: #4a148c;\n" +
                    "        -fx-shadow-highlight-color:#4a148c;\n" +
                    "        -fx-outer-border:#4a148c;\n" +
                    "        -fx-inner-border:#4a148c ;\n" +
                    "        -fx-body-color:#4a148c;\n" +
                    "        -fx-text-fill: white;\n" +
                    "        -fx-focus-color: white;\n" +
                    "        opacity: 0.6;");}
        else{
            anterior.setStyle("fx-background-color: #4a148c;-fx-background-color: #4a148c;\n" +
                    "        -fx-shadow-highlight-color:#4a148c;\n" +
                    "        -fx-outer-border:#4a148c;\n" +
                    "        -fx-inner-border:#4a148c ;\n" +
                    "        -fx-body-color:#4a148c;\n" +
                    "        -fx-text-fill: white;\n" +
                    "        -fx-focus-color: white;\n" +
                    "        opacity: 0.6;");
        }
    }
    public static void reiniciarestilo(Button boton){
        if(boton!=null) {
            boton.setStyle("     -fx-background-color: #484848;\n");
        }
    }

}
