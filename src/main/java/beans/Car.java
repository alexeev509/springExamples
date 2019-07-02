package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

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

    //will be exception because we have 2 beans Car
//    @Bean
//    public Car car() {
//        return new Car();
//    }
}
