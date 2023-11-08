package s6;

/**
 * !!! НЕ РЕШЕНО, не выполнено 3-е т.к. время!!!
 * У вас есть интерфейс Handler с методом handleMessage(String message), возвращающим String. Написать три имплементации
 * 1. LowerCaseHandler: приводит исходное сообщение к нижнему регистру и убирает пробелы из начала и конца сообщения.
 * 2. AlphabetHandler: возвращает исходное сообщение, если оно состоит из буквенных символов и пробелов (пробелов может и не быть), иначе null.
 * 3. LongWordHandler: проверяет сообщение на количество слов (группа символов, разделённая пробелом)
 * не менее m с длиной не менее n (эти параметры задаются в конструкторе), если проверка завершилась успешно,
 * то возвращается строка без изменений, иначе null. таким образом, чтобы их можно было соединить их в цепочку.
 *
 * Реализовать последовательность обработки 1 🠖 2 🠖 3. Проконтролировать NullPointerException.
 */
public class Task4 {
    public static void main(String[] args) {
        LowerCaseHandler lowerCaseHandler = new LowerCaseHandler();
        AlphabetHandler alphabetHandler = new AlphabetHandler();

        System.out.println(alphabetHandler.handleMessage("в цвц цвцл wdjhwjdh wjwjdn"));
        System.out.println(lowerCaseHandler.handleMessage("ОВЦЛ лвцдвл"));

    }
}
