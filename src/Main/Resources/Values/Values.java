package Main.Resources.Values;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;

public class Values {
    public static Rectangle2D r = Screen.getPrimary().getBounds();
    public static double AppWidht()
    {
        return r.getWidth();
    }
    public static double AppHeight()
    {
        return r.getHeight();
    }
    public static double Imagen1X(){return r.getWidth()/2;}
    public static double Imagen1Y(){return r.getHeight()/2;}
    public static double Imagen1_3X(){return r.getWidth()/2.3;}
    public static double Imagen1_3Y(){return r.getHeight()/2.3;}
    public static double Imagen1_5X(){return r.getWidth()/2.5;}
    public static double Imagen1_5Y(){return r.getHeight()/2.5;}
    public static double Imagen2X(){return r.getWidth()/3;}
    public static double Imagen2Y(){return r.getHeight()/3;}
    public static double Imagen3X(){return r.getWidth()/4;}
    public static double Imagen3Y(){return r.getHeight()/4;}
    public static double Imagen4X(){return r.getWidth()/5;}
    public static double Imagen4Y(){return r.getHeight()/5;}
    public static double BarraX(){return r.getWidth();}
    public static double BarraY(){return r.getHeight()/8;}
    public static double PanelYInicio(){return r.getHeight()/8;}
    public static double PanelXFinal(){return r.getWidth()/4;}
    public static double PanelAncho(){return r.getWidth()/4;}



}
