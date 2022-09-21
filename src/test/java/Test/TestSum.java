package Test;

import org.checkerframework.checker.signature.qual.BinaryName;
import org.testng.annotations.Test;

public class TestSum {


    @Test
    public void test() {
        sum(1, 3);
        minus(5, 3);
        mnoz(3, 3);
        delenie(30, 2);

    }

    private void sum(int a, int b) {
        System.out.println(a + b);
    }

    private void minus(int a, int b) {
        System.out.println(a - b);
    }

    private void mnoz(int a, int b) {
        System.out.println(a * b);
    }

    private void delenie(int a, int b) {
        println(a / b);
    }

    private void println(int x) {
        System.out.println(x);
    }

}
