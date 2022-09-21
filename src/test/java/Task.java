import org.testng.annotations.Test;

import javax.annotation.Tainted;
import java.util.Random;

public class Task {

//    public static void main(String[] args) {
//        int arry[] = new int[]{15, 72, 33, 54, 75, 32, 33, 65, 67, 100};
//
//        for (int i = arry.length - 1; i >= 0; i--) {
//            System.out.print(arry[i] + " ");
//        }
//    }

    public static int generateRandomNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        // генерируем случайное число от 0 до `n`
        return new Random().nextInt(n + 1);
    }

    public static void main(String[] args) {
        // генерируем случайные числа от 0 до 5
        int n = 20;
        int[] aaray = new int[n];
        for (int i = 0; i < 10; i++) {
            aaray[i] = generateRandomNumber(n);
//            System.err.print(generateRandomNumber(n) + " ");
        }
        // найти минимальный и максимальный
        int min = aaray[0];
        int max = aaray[0];
        for (int num : aaray) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }

//    @Test
//    public void task() {
//        for (int i = 2; i <= 20; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(i + " ");
//            }
//        }
//    }

}


