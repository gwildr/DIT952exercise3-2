import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asam82 on 2016-02-03.
 */
public class TestSubTyping {
    Polygon[] parray;
    Triangle[] tarray;
    static List<Polygon> plist = new ArrayList<>(10);;
    static List<Triangle> tlist = new ArrayList<>(10);;
    static List<Object> olist = new ArrayList<Object>(10);


    static List<? super Polygon> superpolygon;// = plist;
    static List<? extends Polygon> extendspolygon; // = tlist;

    TestSubTyping(){
        extendspolygon = plist;

    }

    static void moveElements(List<? extends Polygon> from, List<? super
            Polygon>
            to){
        for (int i = 0; i < to.size(); i++){
            to.add(i, from.get(i));
        }
    }
    public static void main(String[] args) {
        moveElements(tlist, plist);
        moveElements(plist,tlist);
        moveElements(extendspolygon, superpolygon);
        moveElements(superpolygon, extendspolygon);
    }



    void paintAll1(Graphics g, List<Polygon> l) {
        for(Polygon p: l){
            p.paint(g);
        }
    }
//  covariant
    void paintAll2(Graphics g, List<? extends Polygon> l) {
        for(Polygon p: l){
            p.paint(g);
        }
    }
//  contravariant - this won't work at all, since Object doesn't have a
// default paint method, and the only type of objects we can extract
// from a super polygon list are Object objects.
    void paintAll3(Graphics g, List<? super Polygon> l) {
        for(Object p: l){
//            p.paint(g);
            System.out.println("Hoj");
        }
    }
    void testPaintAll(Graphics g){
//        paintAll1(g, extendspolygon); extendspolygon is still not of a
// subtype to list polygon, since list types are invariant
        // You can assign a polygon list to an extendspolygon, but not
        // the other way around.

//        paintAll1(g, tlist);

        paintAll2(g, plist);
        paintAll2(g, tlist);
        paintAll2(g, extendspolygon);
//        paintAll2(g , superpolygon); the type may be too high here
        paintAll3(g, plist);
//        paintAll3(g, tlist); not ok, triangle doesn't super polygon
        paintAll3(g, olist);
//        paintAll3(g, extendspolygon);   not ok, list of lower type
// than polygon
        paintAll3(g, superpolygon);
    }


}