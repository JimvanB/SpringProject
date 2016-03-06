import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Jim on 6-3-2016.
 */
public class Circle implements Shape {



    private Point center;

    public void draw() {
        System.out.println("Drawing Circle..");
        System.out.println("Circle: Center point is: "+ center.toString());
    }

    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("jemoeder")
    public void setCenter(Point center) {
        this.center = center;
    }
}
