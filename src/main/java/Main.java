import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Main {
    public static void main(String[] args) {
        //With annotations
        ApplicationContext ctx = new AnnotationConfigApplicationContext("beans");
        Car course = (Car) ctx.getBean(Car.class);

        //with xml:
    }
}
