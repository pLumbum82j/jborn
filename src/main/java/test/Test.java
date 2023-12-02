package test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test);
        test.add(2,0);
        System.out.println(test);


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
