import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4,3));
        points.add(new Point(2,3));
        points.add(new Point(7,4));
       
        Collections.sort(points, (p1, p2) -> (p2.getX() - p2.getY()) - (p1.getX() - p1.getY()));

        
        for (Point p : points) {
            System.out.println(p);
        }
        
    }
}
