import java.util.ArrayList;
import java.util.List;

/**
 * Created by asam82 on 2016-02-03.
 */
public class TestSubTyping {
    public static void main(String[] args) {
        Polygon[] parray;
        Triangle[] tarray;
        List<Polygon> plist;
        List<Triangle> tlist;

        parray = new Polygon[10];
        tarray = new Triangle[10];
        plist = new ArrayList<>(10);
        tlist = new ArrayList<>(10);

//        parray[0] = new Object();
        parray[0] = new Triangle(1, 1);

//        tarray[0] = new Polygon(1,1);

//        plist.add(new Polygon(1,1));


//        tlist.add(new Object());
//        tlist.add(new Polygon(1,1));

//        System.out.println()

//        parray = new Triangle[10];
//        tarray = new Polygon[10];

//        plist = tlist;


//        Mellan vilka kan ni tilldela alla element från den
//        ena till den andra (genom en for-
//                loop)?


//        for (int i = 0; i < 10; i++) {
//            parray[i] = new Polygon(1, 1);
//            tarray[i] = new Triangle(1, 1);
//            plist.add(new Polygon(1, 1));
//            tlist.add(new Triangle(1, 1));
//        }

//        for (int i = 0; i < 10; i++) {
//            parray[i] = tlist.get(i);
//        }
        plist.add(new Triangle(1,1));
        parray[0] = new Triangle(1, 1);
        Triangle t = (Triangle) plist.get(0);


        List<? extends Polygon> extendspolygon;
        List<? super Polygon> superpolygon;

        extendspolygon = new ArrayList<Triangle>(10);
        superpolygon = new ArrayList<Object>(10);
    }
}