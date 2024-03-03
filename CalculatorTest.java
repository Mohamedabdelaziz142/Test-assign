import org.junit.*;
public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testAddition() {
        Assert.assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(3, calc.subtract(8, 5));
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(2.5, calc.divide(10, 4), 0.0001);
    }}


