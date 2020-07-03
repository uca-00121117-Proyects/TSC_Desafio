package Main.Resources.Values;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class TamaniosValues {
    public static void tamaniosbarras(AnchorPane superior, AnchorPane inferior){
        superior.setPrefHeight(Values.BarraY());
        inferior.setPrefHeight(Values.BarraY());
        superior.setPrefWidth(Values.AppHeight());
        inferior.setPrefWidth(Values.AppHeight());
    }
    public static void posicionpanelfragmento(AnchorPane padre,AnchorPane hijodm){
        padre.setTopAnchor(hijodm,Values.PanelYInicio());
        padre.setLeftAnchor(hijodm, Values.PanelAncho());
        padre.setBottomAnchor(hijodm, Values.BarraY());
        hijodm.setStyle("-fx-border-color: transparent;-fx-border-width: 0px 0px 0px 0px");
//        hijodm.setPadding(new Insets(15, 12, 15, 12));
    }
    public static void bordefragmento(AnchorPane padre, BorderPane hijodm){
        padre.setTopAnchor(hijodm,10.0);
        padre.setLeftAnchor(hijodm, 10.0);
        padre.setBottomAnchor(hijodm,10.0);
        padre.setRightAnchor(hijodm,10.0);
        hijodm.setStyle("-fx-border-color: transparent;-fx-border-width: 0px 0px 0px 0px");
//        hijodm.setPadding(new Insets(15, 12, 15, 12));
    }
    public static void tamaniopanelmenu(AnchorPane padre,AnchorPane menu){
        menu.setPrefWidth(Values.PanelAncho());
        padre.setTopAnchor(menu,Values.PanelYInicio());
        padre.setBottomAnchor(menu,Values.PanelYInicio());
        // #212121
        menu.setStyle("-fx-background-color: #212121");
    }
    public static void tamaniopanelmenuconscroll(AnchorPane padre,AnchorPane menu){
        menu.setPrefWidth(Values.PanelAncho()+20);
        padre.setTopAnchor(menu,Values.PanelYInicio());
        padre.setBottomAnchor(menu,Values.PanelYInicio());
        menu.setStyle("-fx-background-color: #212121");
    }
    public static void posicionpanelfragmentoconscrool(AnchorPane padre,AnchorPane hijodm){
        padre.setTopAnchor(hijodm,Values.PanelYInicio());
        padre.setLeftAnchor(hijodm, Values.PanelAncho()+20);
        padre.setBottomAnchor(hijodm, Values.BarraY());
    }
    public static void posicionpanelgrande(AnchorPane padre,AnchorPane hijodm){
        padre.setTopAnchor(hijodm,Values.BarraY());
        padre.setBottomAnchor(hijodm,Values.BarraY());
    }

    public static void tamaniobotones(Button primero,Button segundo,Button tercero,Button cuarto,Button quinto,Button sexto,Button septimo,Button octavo,Button noveno,Button decimo){
        if(primero!=null){ primero.setPrefWidth(Values.PanelAncho());primero.setPrefHeight(Values.PanelAncho()/3.5); }
        if(segundo!=null){ segundo.setPrefWidth(Values.PanelAncho());segundo.setPrefHeight(Values.PanelAncho()/3.5); }
        if(tercero!=null){ tercero.setPrefWidth(Values.PanelAncho());tercero.setPrefHeight(Values.PanelAncho()/3.5); }
        if(cuarto!=null){ cuarto.setPrefWidth(Values.PanelAncho());cuarto.setPrefHeight(Values.PanelAncho()/3.5); }
        if(quinto!=null){ quinto.setPrefWidth(Values.PanelAncho());quinto.setPrefHeight(Values.PanelAncho()/3.5); }
        if(sexto!=null){ sexto.setPrefWidth(Values.PanelAncho());sexto.setPrefHeight(Values.PanelAncho()/3.5); }
        if(septimo!=null){ septimo.setPrefWidth(Values.PanelAncho());septimo.setPrefHeight(Values.PanelAncho()/3.5); }
        if(octavo!=null){ octavo.setPrefWidth(Values.PanelAncho());octavo.setPrefHeight(Values.PanelAncho()/3.5); }
        if(noveno!=null){ noveno.setPrefWidth(Values.PanelAncho());noveno.setPrefHeight(Values.PanelAncho()/3.5); }
        if(decimo!=null){ decimo.setPrefWidth(Values.PanelAncho());decimo.setPrefHeight(Values.PanelAncho()/3.5); }

    }

    public static void tamanioimagen01(ImageView imagen){
        imagen.setFitHeight(Values.Imagen1Y());
        imagen.setFitWidth(Values.Imagen1X());
    }


}


// https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm
// borde https://stackoverflow.com/questions/31560908/i-want-to-make-border-around-three-sides-of-anchorpane-not-four