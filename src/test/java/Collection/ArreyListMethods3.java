package Collection;

import java.util.ArrayList;

public class ArreyListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arreyList1 = new ArrayList<>();
        arreyList1.add("Vlad");
        arreyList1.add("Zaur");
        arreyList1.add("Ivan");

        System.out.println(arreyList1);

        ArrayList<String> arreyList2 = new ArrayList<>();
        arreyList2.add("!!!");
        arreyList2.add("???");
        arreyList1.addAll(1,arreyList2);
        System.out.println(arreyList1);
// метод очистки clear()
        arreyList1.clear();
        System.out.println(arreyList1);
    }
}
