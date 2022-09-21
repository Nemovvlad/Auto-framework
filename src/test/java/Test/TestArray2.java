package Test;

import org.testng.annotations.Test;

public class TestArray2 {

    @Test
    public void checkArray() {
        String sentance = "Kiev is the best city in the world";
        // это для заметок "//"

        String email = "nemovvlad.ru@gmail.com";
        String[] emailSplitted = email.split("@");
        System.out.println(emailSplitted[0]);

        // "nemovvlad.ru", "gmail.com" - делится на 2 части

        String[] splitted = sentance.split(" ");
        System.out.println(splitted[1]);

        for (String word : splitted) {
            System.out.println(word);
        }
    }
}
