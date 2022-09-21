package Test;

import org.testng.annotations.Test;

import java.util.concurrent.LinkedTransferQueue;

public class TestArray {

    @Test
    public void checkArray() {

//        for (int i = 0; i < 10; i++) {
//            System.out.println(100);
//        }
//        String name = "Vlad";

//        for (int iter = 0; iter < name.length(); iter ++) {
//            System.out.println(name.charAt(iter));
//        }
        int[] nums = {2,3,6,22,332,123,12,12,3,123};

        for (int element: nums){
            System.out.println(element);
        }
    }
}

