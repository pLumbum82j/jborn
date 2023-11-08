package s7;

/**
 * Написать интерфейс конвертера, который способен конвертировать любые типы. Написать один из вариантов реализации.
 */
public class Task2 {

    public static void main(String[] args) {
        DriverToConvertCar driverToConvertCar = new DriverToConvertCar();
        Driver driver = new Driver();
        driver.setName("Sergey");
        driver.setSex("MALE");
        driver.setAge(22);
        System.out.println(driverToConvertCar.toConvert(driver));
    }
}
