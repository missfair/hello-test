import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class HelloTest {
    @Test
    @DisplayName("ทดสอบ case01")
    public  void case01(){
        Hello hello = new Hello();
        String name = "Eig";
        String actualResult = hello.sawadee(name);
        assertEquals("Hello Eig", actualResult);
    }
}