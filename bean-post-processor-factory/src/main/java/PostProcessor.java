import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Jim on 6-3-2016.
 */
public class PostProcessor implements BeanPostProcessor{

    //called before init --> pass object and name
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("In BEFORE init method. Bean name is: " +s);
        return o;
    }

    //called after init --> pass object and name
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("In AFTER init method. Bean name is: " +s);
        return o;
    }
}
