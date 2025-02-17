import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in) .nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in) .nextInt();
        System.out.println("Сумма: "+ (firstNumber + secondNumber));
        System.out.println("Разность: "+ (firstNumber - secondNumber));
        System.out.println("Произведение: "+ (firstNumber * secondNumber));
        System.out.println("Частное : "+ ((double)firstNumber / secondNumber));

    }

}