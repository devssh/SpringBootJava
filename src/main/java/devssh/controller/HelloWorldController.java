package devssh.controller;

import devssh.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/java", method = RequestMethod.GET, produces = "application/json")
    public String sayHello(@RequestParam("name") String name) {
        return helloWorldService.sayHelloWorld(name);
    }
}
