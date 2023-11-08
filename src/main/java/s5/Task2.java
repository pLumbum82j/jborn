package s5;

/**
 * Нужно переопределить методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры ComplexNumber по
 * содержимому полей re и im, а hashCode() был бы согласованным с equals(), то есть был бы выполнен контракт hashCode.
 */
public class Task2 {
    public static void main(String[] args) {
        ComplexNumber complexNumberOne = new ComplexNumber(2.0, 2.0);
        ComplexNumber complexNumberTwo = new ComplexNumber(2.0, 2.0);
        ComplexNumber complexNumberThee = new ComplexNumber(2.0, 3.0);

        System.out.println("hashCode объекта №1 = " + complexNumberOne.hashCode());
        System.out.println("hashCode объекта №2 = " + complexNumberTwo.hashCode());
        System.out.println("hashCode объекта №3 = " + complexNumberThee.hashCode());
        System.out.println("объект №1 равен объекту №2 = " + complexNumberOne.equals(complexNumberTwo));
        System.out.println("объект №1 равен объекту №3 = " + complexNumberOne.equals(complexNumberThee));
    }
}
