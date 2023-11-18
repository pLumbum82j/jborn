package s8;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.AccessDeniedException;

/**
 * Написать метод, которому аргументом приходят: путь к файлу входных данных и путь к файлу результата.
 * Формат входного файла:
 * 1 2 3 4 5 6
 * Программа должна посчитать сумму чисел в последовательности. Варианты поведения: файл не существует,
 * к файлу нет доступа, неверный формат файла, недопустимый формат числа (если в числе будет буква),
 * сумма превышает допустимых значения Long.MAX_VALUE.
 * <p>
 * Так как тему чтения/записи не проходили, то две функции уже реализованы:
 * <p>
 * Чтение из файла
 * static String readFirstLine(File file) throws IOException {
 * FileInputStream stream = new FileInputStream(file);
 * BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
 * String first = reader.readLine();
 * reader.close();
 * stream.close();
 * return first;
 * }
 * <p>
 * Запись строки в файл
 * static void writeToFirst(File file, String value) throws IOException {
 * FileWriter writer = new FileWriter(file, false);
 * writer.write(value);
 * writer.flush();
 * writer.close();
 * }
 */
public class Task1 {
    public static void main(String[] args) {
        String fileFist = "C:/Users/pLumbum82/IdeaProjects/jborn/src/main/java/s8/fileFirst.txt";
        String fileResult = "C:/Users/pLumbum82/IdeaProjects/jborn/src/main/java/s8/fileResult.txt";

        readFile(fileFist, fileResult);

    }

    public static void readFile(String fileFirst, String fileResult) {

        String[] fileName = fileFirst.split("\\.");
        if (!fileName[1].equals("txt")) {
            throw new RuntimeException("Формат файла неправильный");
        }

        try {
            String firstLine = readFirstLine(new File((fileFirst)));
            System.out.println(firstLine);
            String[] value = firstLine.split(" ");
            long tempValue;
            BigDecimal result = BigDecimal.valueOf(0L);
            for (String v : value) {
                try {
                    tempValue = Long.parseLong(v);
                } catch (NumberFormatException numberFormatException) {
                    throw new NumberFormatException("Недопустимый формат числа (в числе буква)");
                }
                result = result.add(BigDecimal.valueOf(tempValue));
                int test = result.compareTo(BigDecimal.valueOf(Long.MAX_VALUE));
                if (test > 0) {
                    throw new RuntimeException("Сумма превышает допустимых значения Long.MAX_VALUE");
                }
            }
            writeToFirst(new File(fileResult), String.valueOf(result));
            System.out.println(result);

        } catch (NullPointerException e) {
            throw new RuntimeException("Файл пустой");
        } catch (AccessDeniedException e) {
            throw new RuntimeException("Нет доступа к файлу");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не существует");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Чтение из файла
     */
    static String readFirstLine(File file) throws IOException {
        FileInputStream stream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String first = reader.readLine();

        reader.close();
        stream.close();
        return first;
    }

    /**
     * Запись строки в файл
     */
    static void writeToFirst(File file, String value) throws IOException {
        FileWriter writer = new FileWriter(file, false);

        writer.write(value);
        writer.flush();
        writer.close();
    }
}
