import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jim on 4-3-2016.
 */
public class DrawingApp {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Shape shape = (Shape) context.getBean("circle");
        shape.draw();

    }
}
