import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @org.junit.jupiter.api.Test
    public void testSubOne() {
        assertEquals(0, HelloWorld.subtractTwoNumbers(1,1));
    }

    @org.junit.jupiter.api.Test
    public void testSubTwo() {
        assertEquals(-3, HelloWorld.subtractTwoNumbers(-2,1));
    }

    @org.junit.jupiter.api.Test
    public void testSubThree() {
        assertEquals(25, HelloWorld.subtractTwoNumbers(-25,-50));
    }
}
