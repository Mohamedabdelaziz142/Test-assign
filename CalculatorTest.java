import org.junit.*;
public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator c = new Calculator();
        Assert.assertEquals(10, c.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        Calculator c = new Calculator();
        Assert.assertEquals(3, c.subtract(8, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator c = new Calculator();
        Assert.assertEquals(15, c.multiply(3, 5));
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDivision() {
        Calculator c = new Calculator();
        Assert.assertEquals(2.5, c.divide(10, 4));
    }
}


