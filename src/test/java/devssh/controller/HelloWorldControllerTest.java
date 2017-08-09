package devssh.controller;

import devssh.service.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldControllerTest {
    public static final String DAVE = "Dave";
    @InjectMocks
    HelloWorldController helloWorldController;

    @Mock
    HelloWorldService helloWorldService;

    @Test
    public void shouldCallHelloWorldService() throws Exception {
        String expectedMessage = "Hi " + DAVE;
        when(helloWorldService.sayHelloWorld(DAVE)).thenReturn(expectedMessage);

        String actual = helloWorldController.sayHello(DAVE);
        assertEquals(expectedMessage, actual);
    }
}