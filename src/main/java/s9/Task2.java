package s9;

import java.io.*;
import java.util.Random;

/**
 * Записать в файл numbers поочерёдно 100 положительных и 100 отрицательных случайных целых чисел, перечислив их через пробел.
 * Затем прочитать этот файл и раскидать прочитанные числа в 2 файла: positive_numbers и negative_numbers,
 * с положительными и отрицательными числами соответственно.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        File numbers = new File("src/main/java/s9/numbers.txt");
        File positiveNumbers = new File("src/main/java/s9/positiveNumbers.txt");
        File negativeNumbers = new File("src/main/java/s9/negativeNumbers.txt");

        if (numbers.exists()) {
            numbers.delete();
            positiveNumbers.delete();
            negativeNumbers.delete();
        }
        numbers.createNewFile();
        positiveNumbers.createNewFile();
        negativeNumbers.createNewFile();

        putNumbers(numbers);

        FileInputStream fisNumbers = new FileInputStream(numbers);
        InputStreamReader isr = new InputStreamReader(fisNumbers);
        FileOutputStream fisPositive = new FileOutputStream(positiveNumbers);
        OutputStreamWriter oswPositive = new OutputStreamWriter(fisPositive);
        FileOutputStream fisNegative = new FileOutputStream(negativeNumbers);
        OutputStreamWriter oswNegative = new OutputStreamWriter(fisNegative);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        String[] map = str.split(" ");
        for (String value : map) {
            if (Integer.parseInt(value) >= 0){
                oswPositive.write(value + " ");
            } else {
                oswNegative.write(value + " ");
            }
        }
        oswPositive.close();
        oswNegative.close();
        fisNumbers.close();
        fisPositive.close();
        fisNegative.close();
    }

    public static void putNumbers(File file) throws IOException {
        int max = 100;
        FileOutputStream fos = new FileOutputStream(file);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        Random random = new Random();
        for (int i = 0; i < max; i++) {
            osw.write(random.nextInt(100) + " ");

        }
        for (int i = 0; i < max; i++) {
            osw.write("-" + random.nextInt(100));
            if (i != 99) {
                osw.write(" ");
            }
        }
        osw.close();
        fos.close();
    }
}
