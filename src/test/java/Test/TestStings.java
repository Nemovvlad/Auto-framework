package Test;

import org.testng.annotations.Test;

public class TestStings {

    @Test
    public void testSimpleString() {
        String sourceStr = "Hello my name is Vlad";
        System.out.println(sourceStr.length());
        System.out.println(sourceStr.charAt(0));
        System.out.println(sourceStr.substring(8, 15));
        System.out.println(sourceStr.contains("Vlad"));

    }
}
