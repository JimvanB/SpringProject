import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jim on 4-3-2016.
 */
public class DrawingApp2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
        triangle.getPointA().setX(100);
        triangle.draw();

        Triangle tri = (Triangle) context.getBean("triangle");
        tri.draw();

    }
}
