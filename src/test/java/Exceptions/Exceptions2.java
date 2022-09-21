package Exceptions;

import org.openqa.selenium.devtools.v85.io.IO;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("User adds something other than 0");
                }
            }
        }
    }
}
