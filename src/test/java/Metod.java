import org.testng.Assert;
import org.testng.annotations.Test;

public class Metod {
    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public void println(int p) {

        System.out.println("Print int = " + p);
    }

    @Test
    public void testMetod1() {
        int sum = sum(2, 3);
        println(sum);
        Assert.assertEquals(sum, 5);
        Assert.assertEquals(sum(20, 10), 30);
        Assert.assertEquals(sum(-10, +5), -5);
    }

    @Test
    public void testMetod2() {
        int minus = minus(6, 3);
        println(minus);

        Assert.assertEquals(minus, 3);
        Assert.assertEquals(minus(10, 3), 7);
        Assert.assertEquals(minus(-3, 3), -6);
    }

    @Test
    public void testMetod3() {
        int multiply = multiply(3, 3);
        println(multiply);

        Assert.assertEquals(multiply, 9);
        Assert.assertEquals(multiply(9, 8), 72);
    }

    @Test
    public void testMetod4() {
        int divide = divide(15, 3);
        println(divide);

        Assert.assertTrue(divide == 5);
    }

}
