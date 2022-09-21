public class Demo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        System.out.println("Имя первого кота: " + cat1.name);
        System.out.println("Возраст первого кота: " + cat1.age);
        System.out.println();
        System.out.println("Имя второго кота: " + cat2.name);
        System.out.println("Возраст второго кота: " + cat2.age);

        Cat cat3 = new Cat("Red", 2);
        Cat cat4 = new Cat("Pit", 7);

        System.out.println("Имя первого кота: " + cat3.name);
        System.out.println("Возраст первого кота: " + cat3.age);
        System.out.println();
        System.out.println("Имя второго кота: " + cat4.name);
        System.out.println("Возраст второго кота: " + cat4.age);
    }
}

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }
}

