package Test;

public class TestPerson {

    public static void main(String[] args) {
        Person vlad = new Person("Vlad", 31);
        Person vlad1 = new Person("Vlad", 31);
        Person vlad2 = new Person("KLNljnva", 331);
        Person vlad3 = new Person("kmlvnlk", 321);

        System.out.println(vlad.getAge());
        System.out.println(vlad2.getAge());
        System.out.println(vlad1.getAge());
        System.out.println(vlad3.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}


