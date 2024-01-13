package test;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test);
        test.add(2, 0);
        System.out.println(test);

        System.out.println("---");
        test.stream().filter(p -> p > 1).forEach(System.out::println);
        System.out.println("---");

        List<Integer> listTest = new ArrayList<>();
        listTest.add(1);
        listTest.add(2);
        listTest.add(3);
        System.out.println("BEFORE ITERATOR");
        System.out.println(listTest);
        Iterator<Integer> i = listTest.iterator();
        while (i.hasNext()) {
            Integer a = i.next();
            if (a == 2) {
                i.remove();
            }
        }
        System.out.println("AFTER ITERATOR");
        System.out.println(listTest);


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
