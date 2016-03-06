import java.util.List;

/**
 * Created by Jim on 4-3-2016.
 */
public class Triangle {

    private List<Point> points;


    public void draw(){

       for(Point point: points){
           System.out.println("Point: ("+point.getX() + ", " +point.getY()+")");
       }
     }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
