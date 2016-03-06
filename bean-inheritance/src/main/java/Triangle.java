import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by Jim on 4-3-2016.
 */
public class Triangle {

    private List<Point> points;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw(){

        System.out.println(getPointA() + ", " + getPointB() + ", " + getPointC());
     }

    public void drawList(){

        for(Point point:points){
            System.out.println(point.getX() +", "+point.getY());
        }
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
