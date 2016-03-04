package project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Jim on 4-3-2016.
 */
public class DrawingApp {

    public static void main(String[] args) {

        DrawingApp app = new DrawingApp();
       // Triangle triangle  = new Triangle();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();
    }
}
