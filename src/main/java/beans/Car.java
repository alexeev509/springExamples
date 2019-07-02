package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Car {
    @Value("Volkswagen")
    private String marka;


    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                '}';
    }

    public Car() {
        System.out.println("I am here");
    }

    @PostConstruct
    public void startMethodForAnnotation() {
        System.out.println("It will be after object will be created for annotations");
    }

    public void startMethodForXml() {
        System.out.println("It will be after object will be created for xml");
    }



    //will be exception because we have 2 beans Car
//    @Bean
//    public Car car() {
//        return new Car();
//    }
}
