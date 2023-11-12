package test;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Volt";
        System.out.println(cat.name);
        System.out.println(cat);
        changeName(cat);
        System.out.println(cat.name);
        System.out.println(cat);

    }

    public static void changeName(Cat cat) {
        cat.name = "Misha";
        System.out.println(cat.name);
        System.out.println(cat);
    }
}

class Cat {
    String name;
}
