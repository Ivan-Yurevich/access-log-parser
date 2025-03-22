import java.io.File;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int validFileCount = 0;
            while (true) {
                System.out.print("Введите путь к файлу: ");
                String filePath = scanner.nextLine();
                File file = new File("C:/Users/IYurevich/File.txt");
                boolean fileExists = file.exists();
                boolean isFile = file.isFile();
                if (!fileExists || !isFile) {
                    System.out.println("Файл не существует или указанный путь является путём к папке, а не к файлу.");
                    continue;
                } else {
                    validFileCount++;
                    System.out.println("Путь указан верно. Это файл номер " + validFileCount);
                }
            }
        }


    }

