package test;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;

import java.util.Optional;
public class Account {
    @ServiceActivator(inputChannel="requests", outputChannel="toJms")
    public String create(String message) {
        return message;
    }
}
