package devssh.controller;

import devssh.service.HelloWorldService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Slf4j
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/java", method = RequestMethod.GET, produces = "application/json")
    public String sayHello() {
        String name="dave";
        return helloWorldService.sayHelloWorld(name);
    }

}
