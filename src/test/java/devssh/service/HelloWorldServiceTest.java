package devssh.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldServiceTest {
    public static final String GILGAMESH = "Gilgamesh";
    @InjectMocks
    HelloWorldService helloWorldService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        String expected = "Hello " + GILGAMESH + " from Java";
        String actual = helloWorldService.sayHelloWorld(GILGAMESH);
        assertEquals(expected, actual);
    }
}