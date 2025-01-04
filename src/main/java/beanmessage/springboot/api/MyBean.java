package beanmessage.springboot.api;


import org.springframework.stereotype.Component;

@Component
public class MyBean {
    public String getMessage() {
        return "Hello from MyBean!";
    }
}
