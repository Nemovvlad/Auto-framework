package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArreyListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arreyList1 = new ArrayList<>();
        arreyList1.add("Vlad");
        arreyList1.add("Zaur");
        arreyList1.add("Ivan");

        System.out.println(arreyList1);

        ArrayList<String> arreyList2 = new ArrayList<>(200);
        arreyList2.add("Vlad");
        arreyList2.add("Zaur");

        List<String> arreyList3 = new ArrayList<>();
        ArrayList<String> arreyList4 = new ArrayList<>(arreyList1);
        System.out.println(arreyList4);
    }
}
