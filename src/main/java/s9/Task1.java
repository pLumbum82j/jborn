package s9;

import java.io.File;

/**
 * Реализовать рекурсивный поиск в каталоге по строке названия файла (проверять на вхождение), используя классы Path и Files.
 * Вернуть массив объектов Path.
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/java");
        String fileName = "fileResult";
        recursiveSearch(file, fileName);
    }

    public static void recursiveSearch(File file, String fileName) {
        for (File item : file.listFiles()) {
            if (item.isFile() && item.getName().equals(fileName)) {
                System.out.println(item.getAbsolutePath());
            }
            if (item.isDirectory()) {
                recursiveSearch(new File(item.getPath()), fileName);
            }
        }
    }
}
