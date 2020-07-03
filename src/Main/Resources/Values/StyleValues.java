package Main.Resources.Values;


import javafx.scene.control.Button;

import static Main.Resources.Values.retweet.darestilo;
import static Main.Resources.Values.retweet.reiniciarestilo;

public class StyleValues {
    //Estilos por si se borran del css (cuando se hace una accion puede pasar)

    public static String FocucedButton(Integer tamanio)
    {
        return     "-fx-background-color: #4a148c; " +
                "-fx-shadow-highlight-color:#4a148c; " +
                tamanioboton3(tamanio)+
                "-fx-outer-border:#4a148c; " +
                "-fx-inner-border:#4a148c ;" +
                " -fx-body-color:#4a148c; " +
                "-fx-focus-color: white;" +
                " opacity: 0.6;";
    }
    public static String HoverButton(Integer tamanio)
    {
        return     "-fx-background-color: #4a148c; " +
                "-fx-shadow-highlight-color:#4a148c; " +
                tamanioboton3(tamanio)+
                "-fx-outer-border:#4a148c;" +
                " -fx-inner-border:#4a148c ;" +
                " -fx-body-color:#4a148c;" +
                " -fx-focus-color: white;" +
                " opacity: 0.6;";
    }
    public static String DefaultButton(Integer tamanio)
    {
        return "-fx-background-color: #484848;"+tamanioboton3(tamanio);

    }
    public static String tamanioboton3(Integer tamanio) {
        if (tamanio<=12) {
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 12);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        else if(tamanio<=18){
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 12);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        else if(tamanio<=25){
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 15);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        return " -fx-text-fill: white;";
    }

    public static void stylebuttoncontroller(Integer last , Button thisbutton, Button primero, Button segundo, Button tercero, Button cuarto, Button quinto, Button sexto, Button septimo, Button octavo, Button noveno, Button decimo){
        switch(last) {
            case 1:
                if(primero!=null){
                    reiniciarestilo(primero,primero.getText().length());
                    darestilo(thisbutton,primero,thisbutton.getText().length(),primero.getText().length()); }
            case 2:
                if(segundo!=null){
                    reiniciarestilo(segundo,segundo.getText().length());
                    darestilo(thisbutton,segundo,thisbutton.getText().length(),segundo.getText().length()); }
            case 3:
                if(tercero!=null){
                    reiniciarestilo(tercero,tercero.getText().length());
                    darestilo(thisbutton,tercero,thisbutton.getText().length(),tercero.getText().length()); }
            case 4:
                if(cuarto!=null){
                    reiniciarestilo(cuarto,cuarto.getText().length());
                    darestilo(thisbutton,cuarto,thisbutton.getText().length(),cuarto.getText().length()); }
            case 5:
                if(quinto!=null){
                    reiniciarestilo(quinto,quinto.getText().length());
                    darestilo(thisbutton,quinto,thisbutton.getText().length(),quinto.getText().length()); }
            case 6:
                if(sexto!=null){
                    reiniciarestilo(sexto,sexto.getText().length());
                    darestilo(thisbutton,sexto,thisbutton.getText().length(),sexto.getText().length()); }
            case 7:
                if(septimo!=null){
                    reiniciarestilo(septimo,septimo.getText().length());
                    darestilo(thisbutton,septimo,thisbutton.getText().length(),septimo.getText().length()); }
            case 8:
                if(octavo!=null){
                    reiniciarestilo(octavo,octavo.getText().length());
                    darestilo(thisbutton,octavo,thisbutton.getText().length(),octavo.getText().length()); }
            case 9:
                if(noveno!=null){
                    reiniciarestilo(noveno,noveno.getText().length());
                    darestilo(thisbutton,noveno,thisbutton.getText().length(),noveno.getText().length());}
            case 10:
                if(decimo!=null){
                    reiniciarestilo(decimo,decimo.getText().length());
                    darestilo(thisbutton,decimo,thisbutton.getText().length(),decimo.getText().length()); }
            default:
                reiniciarestilo(primero,primero.getText().length());
                darestilo(thisbutton,primero,thisbutton.getText().length(),primero.getText().length());
        }
    }
}
