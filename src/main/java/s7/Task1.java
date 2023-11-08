package s7;

/**
 * Написать generic interface Validator, где дженерик-тип, тип, который валидируется boolean isValid(T obj).
 * Написать валидаторы для класса Car, Driver. Для каждого поля, своя реализация валидатора.
 * Придумать и сделать "общий" валидатор, который полностью валидировал свою сущность, используя реализации по полям.
 */
public class Task1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setName("Alex");
        driver.setSex("MALE");
        driver.setAge(17);

        DrivaerValidator drivaerValidator = new DrivaerValidator();
        System.out.println(drivaerValidator.isValid(driver));
    }
}
