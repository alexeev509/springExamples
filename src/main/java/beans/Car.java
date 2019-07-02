package beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

@Configuration
//@PropertySource(value="classpath:application.properties")
public class Car {
    @Value("Volkswagen")
    private String marka;
    //Страны производители
    @Value("#{'Germany,Austria'.split(',')}")
    private List<String> produceСountries;

    public void setProduceСountries(List<String> produceСountries) {
        this.produceСountries = produceСountries;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public List<String> getProduceСountries() {
        return produceСountries;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", produceСountries=" + produceСountries +
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
