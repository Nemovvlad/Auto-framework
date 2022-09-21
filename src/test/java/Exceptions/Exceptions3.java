package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
//        Checked Exception(Compile time exception) = исключительные случаи в работе программы
//        Unchecked (Runtime exception) = ошибка в работе программы(обрабатывать не нужно)
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Test");
        }

//        int a = 1/0; = Unchecked (Runtime exception)

//        String name = null;
//        name.length();  =  Unchecked (Runtime exception)

//        int[] arr = new int[2];
//        System.out.println(arr[2]);  =  Unchecked (Runtime exception)

    }
}
