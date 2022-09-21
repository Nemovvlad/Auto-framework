import org.testng.annotations.Test;

public class OblastVidim {

    double age = 10.0;
    String name = "Vlad" +  " is here";
    boolean yup = true;
    int a = 10;
    int b = 12;

    @Test
    public void duit() {
        System.out.println(a == b);
    }

    @Test
    public void duitTo() {
        System.out.println(age);
        age = 20.5;
        System.out.println(age);
    }
}