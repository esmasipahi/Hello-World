import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTest {
    @org.junit.jupiter.api.Test
    public void testDivideOne() {
        assertEquals(1, HelloWorld.divideTwoNumbers(1,1));
    }

    @org.junit.jupiter.api.Test
    public void testDivideTwo() {
        assertEquals(-2, HelloWorld.divideTwoNumbers(-2,1));
    }

    @org.junit.jupiter.api.Test
    public void testDivideThree() {
        assertEquals(0.5, HelloWorld.divideTwoNumbers(-25,-50));
    }
}
