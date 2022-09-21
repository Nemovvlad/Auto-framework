package Test;

import org.testng.annotations.Test;

public class TestArray1 {

    @Test
    public void checkArray() {
        int[] arr = {10, 25, 35, 50};
        System.out.println(arr[1]);

        arr[0] = 12;

        int arrDefault[] = new int[10];

        System.out.println(arrDefault[3]);
    }
}
