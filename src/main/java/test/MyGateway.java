package test;

import org.springframework.context.annotation.Bean;

public interface MyGateway {
    @Bean
    public void method(String s);
}
