import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите текст и нажмите <Enter>:");
        String text = new Scanner(System.in) .nextLine();
        System.out.println("Длина текста: " + text.length());


    }
}