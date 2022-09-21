package Test;

import org.testng.annotations.Test;

public class TestClassForJavaDemo {

    int age = 32;
    Integer ageI = new Integer(40);

    @Test
    public void doIt() {
        int result = summ(5, 5);
        System.out.println(result);
    }

    public void run() {
        System.out.println("running");
    }

    public int summ(int firstVariable, int secondVariable) {
        return firstVariable * secondVariable;
    }

}
