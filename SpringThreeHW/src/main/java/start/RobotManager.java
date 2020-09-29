package start;

import org.example.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotManager {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("contextThreeHW.xml") {
        };

        Object obj = applicationContext.getBean("t1000v2");
        ModelT1000 t1000 = (ModelT1000) obj;

        if(obj instanceof ModelT1000) {
            System.out.println(t1000);
            System.out.println(t1000.getHand());
//            t1000.dance();
//            t1000.fire();

        }
        obj = applicationContext.getBean("t1000v2");

        if(obj instanceof ModelT1000) {
            t1000 = (ModelT1000) obj;
            System.out.println(t1000);
            System.out.println(t1000.getHand());
//            t1000.dance();
//            t1000.fire();

        }
        obj = applicationContext.getBean("t1000v2");

        if(obj instanceof ModelT1000) {
            t1000 = (ModelT1000) obj;
            System.out.println(t1000);
            System.out.println(t1000.getHand());
//            t1000.dance();
//            t1000.fire();

        }

        obj = applicationContext.getBean("t1000Full");

        if(obj instanceof ModelT1000) {
            t1000 = (ModelT1000) obj;
            System.out.println(t1000);
            System.out.println(t1000.getHand());

        }
    }
}
