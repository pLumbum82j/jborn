package s9;

/**
 * Напишите метод, который прочитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 * Сигнатура метода должна выглядеть так: String readAsString(InputStream inputStream, Charset charset) throws IOException.
 * Используя java.io.Externalizable создать вручную сериализацию класса (модифицировать класс) User(firstName, lastName):
 *
 * public class User {
 *     private String firstname;
 *     private String lastname;

 *     public User(String firstname, String lastname) {
 *         this.firstname = firstname;
 *         this.lastname = lastname;
 *     }
 *
 *
 *
 *    public String getFirstname() {
 *         return firstname;
 *    }
 *
 *    public String getLastname() {
 *         return lastname;
 *    }
 *

 *   @Override
 *   public String toString() {
 *       return "User{" +
 *            "firstname='" + firstname + '\'' +
 *            ", lastname='" + lastname + '\'' +
 *            '}';
 *   }
 *               }
 *
 * Обратите внимание на конструктор по-умолчанию при экстернализации.
 */
public class Task3 {
}
