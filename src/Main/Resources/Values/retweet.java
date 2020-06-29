package Main.Resources.Values;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
        System.out.println("Next : "+ fxmlnext);
        System.out.println("Prev : "+ fxmlprev);
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
}
