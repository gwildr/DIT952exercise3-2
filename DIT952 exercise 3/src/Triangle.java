import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Triangle extends Polygon {
    Triangle(int x, int y) {
        super(x,y);
    }
    Triangle(){
        super(0,0);
    }

    public void triangleMethod(){
        System.out.println("Hi, I'm a triangle!");
    }
   @Override
    public void paint(Graphics g){
        g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
        g.drawLine(centerPoint.x-10, centerPoint.y+10,
                centerPoint.x+10, centerPoint.y+10);
        g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
    }
}
