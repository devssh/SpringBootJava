package devssh.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    public String sayHelloWorld(String name) {
        return "Hello " + name + " from Java";
    }
}
