import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Polygon extends JComponent{
    Point centerPoint;

    private Polygon(Point center){
        this.centerPoint = center;
    }

    public Polygon(int x, int y){
        this(new Point(x,y));
    }

//    @Override
//    public abstract void paint(Graphics g)//paint
//    ;
}
