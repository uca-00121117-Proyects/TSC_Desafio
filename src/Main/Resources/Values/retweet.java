package Main.Resources.Values;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;


public class retweet {
    //Retweet es donde se reutiliza varias cosas que funcionan igual

    //Nueva scena con sus datos
    public static void nuevaScena(Parent root, ImageView image){
        Stage stage = (Stage) ((Node)image).getScene().getWindow();
        Scene scene = new Scene(root, Values.AppWidht(), Values.AppHeight());
        scene.getStylesheets().add("/Main/Resources/css/style.css");
        stage.setScene(scene);
    }
    // Imprimer donde estamos y cual es nuestra pantalla suguiente y anterior
    public static void dondeestacr7(String fxmlprev,String fxmlthis, String fxmlnext ){
        System.out.println("**********************************************");
        System.out.println("************\t\t\tEstas en:\t"+ fxmlthis+"\t\t\t**************");
        System.out.println("\t\t\tPrev\t\t\t:\t\t"+ fxmlprev);
        System.out.println("\t\t\tNext\t\t\t:\t\t"+ fxmlnext);
        System.out.println("**********************************************\n");

    }
    //Cambiamos de pantalla con una imagen
    public static void cambiarPantalla(ImageView imagen, String fxml,Class thisclass){
        imagen.setOnMouseClicked((MouseEvent e) ->{

            Parent root = null;
            try {
                //Donde esta nuestro nuevo layout
                root = FXMLLoader.load(thisclass.getResource("/Main/Resources/fxml/"+fxml+".fxml"));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            //una vez tenemos el layout mandamos el layout y la imagen que en este caso sirve de boton
            retweet.nuevaScena(root,imagen);
        });
    }

    //Cerramos la app con una imagen
    public static void cerrarApp(ImageView cerrar)  {
    cerrar.setOnMouseClicked((MouseEvent e) ->{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "¿Seguro que quiere salir?", ButtonType.YES, ButtonType.CANCEL);
        alert.showAndWait();
        //ButtonType.NO
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cerrar.getScene().getWindow();
            stage.close();
        }
        });
    }
    //Cambiamos el layout de un bordepane que sirve como una "Minipantalla"
    public static void cambiar(String fxml, Class thisclass, BorderPane panel){
        Parent root = null;
        try {
            root = FXMLLoader.load(thisclass.getResource("/Main/Resources/fxml/"+fxml+".fxml"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        panel.setCenter(root);
    }
    //Damos el estilo al boton que esta en foco
    public static void darestilo(Button boton,Button anterior,Integer tamanio,Integer tamanioanterior){
            if(boton!=null){
                boton.setStyle(StyleValues.FocucedButton(tamanio));
                boton.setOnMouseEntered(e -> boton.setStyle(StyleValues.HoverButton(tamanio)));
                boton.setOnMouseExited(e -> boton.setStyle(StyleValues.FocucedButton(tamanio)));
            }
            else {
                anterior.setStyle(StyleValues.FocucedButton(tamanioanterior));
            }
    }


    //Reiniciamos el estilo a nuestro anterior boton para que se mire mejor
    public static void reiniciarestilo(Button boton,Integer tamanio){
            if (boton != null) {
                //Boton estilo
                boton.setStyle(StyleValues.DefaultButton(tamanio));
                //Le volvemos a dar las propiedades de Hover porque las pierde
                boton.setOnMouseEntered(e -> boton.setStyle(StyleValues.HoverButton(tamanio)));
                boton.setOnMouseExited(e -> boton.setStyle(StyleValues.DefaultButton(tamanio)));
            }
    }
    public static void defaultestilo(Button boton,Integer tamanio){
        boton.setStyle(StyleValues.DefaultButton(tamanio));
        //Le volvemos a dar las propiedades de Hover porque las pierde
        boton.setOnMouseEntered(e -> boton.setStyle(StyleValues.HoverButton(tamanio)));
        boton.setOnMouseExited(e -> boton.setStyle(StyleValues.DefaultButton(tamanio)));
    }
    //Damos el estilo al boton que esta en foco
    public static void defaultestilofocus(Button boton,Integer tamanio){
        if(boton!=null){
            boton.setStyle(StyleValues.FocucedButton(tamanio));
            boton.setOnMouseEntered(e -> boton.setStyle(StyleValues.HoverButton(tamanio)));
            boton.setOnMouseExited(e -> boton.setStyle(StyleValues.FocucedButton(tamanio)));
        }

    }


}
//https://stackoverflow.com/questions/30680570/javafx-button-border-and-hover
//Para salir :https://stackoverflow.com/questions/8309981/how-to-create-and-show-common-dialog-error-warning-confirmation-in-javafx-2