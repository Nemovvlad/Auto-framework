package Collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Animals {
    void voice();

    void speed();
}

class Cat implements Animals {
    @Override
    public void voice() {
        System.out.println("may may");
    }

    @Override
    public void speed() {
        System.out.println("20 km");
    }
}

class Dog implements Animals {
    public void voice() {
        System.out.println("gav gav");
    }

    public void speed() {
        System.out.println("25 km");
    }

}

class Main {
    public static void main(String[] args) {
        Animals cat1;

        cat1 = new Cat();

        cat1.voice();
        cat1.speed();

        cat1 = new Dog();

        cat1.voice();
        cat1.speed();
    }
}