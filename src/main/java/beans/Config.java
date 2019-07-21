package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public A getA() {
        return new A();
    }

    @Bean
    public B getB() {
        return new B();
    }
}
