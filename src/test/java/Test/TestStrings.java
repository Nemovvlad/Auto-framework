package Test;

import org.testng.annotations.Test;

public class TestStrings {

    @Test
    public void testSimpleString() {
        String sourceStr = "Hello my name is Vlad";

        for (int i = sourceStr.length() - 1; i >= 0; i--) {
            System.out.print(sourceStr.charAt(i));

        }
    }
}
