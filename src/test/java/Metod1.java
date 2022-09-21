import org.testng.annotations.Test;

import java.security.SecureRandom;

public class Metod1 {

    @Test
    public void checkRep() {
        System.out.println(rep("aaa"));
    }

    public String rep(String str) {

        return str.replace("a", ".");
    }
}
