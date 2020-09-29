package start;

import org.example.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("context.xml");

        Object obj = applicationContext.getBean("t1000v2");

        if(obj instanceof ModelT1000) {

            ModelT1000 t1000 = (ModelT1000) obj;
            t1000.dance();
            t1000.fire();
        }
    }
}
