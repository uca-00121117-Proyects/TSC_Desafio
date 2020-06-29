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
}
