package Main;

import Main.Resources.Values.Values;
import Main.Resources.Values.fxmlvalues;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import javafx.stage.StageStyle;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main extends Application {
    fxmlvalues fxml = fxmlvalues._1;
    String fxmlthis = fxml.getdatos();
    @Override
    public void start(Stage index) throws Exception{
        System.out.println( "********\t\t\tIniciando la app\t\t\t********");
        Parent root = FXMLLoader.load(getClass().getResource("Resources/fxml/"+ fxmlthis+".fxml"));
        index.initStyle(StageStyle.UNDECORATED);
        index.getIcons().add(new Image("/Main/Resources/images/icons/icon.png"));
        Scene scene =new Scene(root, Values.AppWidht(), Values.AppHeight());
        scene.getStylesheets().add("/Main/Resources/css/style.css");
        index.setScene(scene);
        index.setResizable(false);
        index.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//https://material.io/resources/color/#!/?view.left=0&view.right=0&primary.color=212121&secondary.color=4A148C
//https://material.io/resources/icons/?icon=skip_previous&style=baseline
//https://stackoverflow.com/questions/21904548/how-to-create-completly-full-screen-application-with-javafx
//https://stackoverflow.com/questions/9861178/javafx-primarystage-remove-windows-borders
//https://stackoverflow.com/questions/25037724/how-to-close-a-java-window-with-a-button-click-javafx-project/41838183
//https://www.youtube.com/watch?v=RJOza3XQk34
//https://www.youtube.com/watch?v=ttD35jEo-f0
//https://www.youtube.com/watch?v=5_v58NRTOTM
//https://www.quora.com/How-do-I-set-size-of-a-image-inside-button-in-javafx-Is-it-possible-to-do-this-in-css
//https://www.google.com/search?q=off+icon&client=firefox-b-d&sxsrf=ALeKk02GIDFEWMrfvEB02L2Gs3ahmRW5XQ:1593416027278&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj33qOiwabqAhVlUt8KHSa9D3AQ_AUoAXoECBYQAw&biw=1366&bih=622#imgrc=w_lpsjK2ICa52M
//https://stackoverflow.com/questions/30680570/javafx-button-border-and-hover
//https://stackoverflow.com/questions/36936125/javafx-css-id-selector-with-class-selector-not-working
//https://stackoverflow.com/questions/30680570/javafx-button-border-and-hover
//https://stackoverflow.com/questions/27668201/how-to-set-default-css-for-all-buttons-in-javafx









