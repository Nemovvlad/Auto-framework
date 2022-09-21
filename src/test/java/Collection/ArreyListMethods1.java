package Collection;

import java.util.ArrayList;

public class ArreyListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arreyList1 = new ArrayList<>();
        arreyList1.add("Vlad");
        arreyList1.add("Zaur");
        arreyList1.add("Ivan");
        arreyList1.add(1,"Hylio");
        for (String s : arreyList1) {
            System.out.print(s + " ");
        }
//        System.out.println();
//        for (int i=0; i<arreyList1.size();i++){
//            System.out.println(arreyList1.get(i));
//        }
        arreyList1.set(1,"Dermo");
        arreyList1.remove(0);

        System.out.println(arreyList1);
    }
}
