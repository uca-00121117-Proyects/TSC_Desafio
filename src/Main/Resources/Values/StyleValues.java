package Main.Resources.Values;

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
        if (tamanio<14) {
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 8);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        else if(tamanio<20){
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 12);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        else if(tamanio<25){
            String tamanioletra = String.valueOf((Values.PanelAncho()) / 16);
            return "-fx-font-size: " + tamanioletra + "; -fx-text-fill: white;";
        }
        return " -fx-text-fill: white;";
    }
}
