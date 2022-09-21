package Collection;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arreyList1 = new ArrayList<>();
        arreyList1.add("Vlad");
        arreyList1.add("Zaur");
        arreyList1.add("Ivan");

        Iterator<String> iterator = arreyList1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
