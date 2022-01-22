import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpoTest {
    @org.junit.jupiter.api.Test
    public void testExpOne() {
        assertEquals(2, HelloWorld.exponent(1,1));
    }

    @org.junit.jupiter.api.Test
    public void testExpTwo() {
        assertEquals(-4, HelloWorld.exponent(-2,1));
    }

    @org.junit.jupiter.api.Test
    public void testExpThree() {
        assertEquals(2560, HelloWorld.exponent(10,8));
    }
}
