import beans.BeanWithConstructorAndProperty;
import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //With annotations:
        ApplicationContext ctx = new AnnotationConfigApplicationContext("beans");
        Car car1 = ctx.getBean(Car.class);
        System.out.println(car1.toString());

        //with xml:
        ApplicationContext context = new ClassPathXmlApplicationContext("configFile.xml");
        Car car2 = context.getBean(Car.class);
        System.out.println(car2.toString() + " " + car2.getProduceСountries().getClass()); //Why this is arraylist?? not LinkeList for example?

        BeanWithConstructorAndProperty beanWithConstructorAndProperty = context.getBean(BeanWithConstructorAndProperty.class);
        System.out.println(beanWithConstructorAndProperty.getR());

        for (Map.Entry<String, Integer> entry : beanWithConstructorAndProperty.getMap().entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
