package p3;
// Подсчёт букв в слове
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(; ;) {
            System.out.println("Введите слово: ");
            String word = scanner.next();
            if (word.length() <= 1) {
                System.out.println("Длина слова должна быть больше одного символа");
            } else {
                word.length();
                System.out.println("Длина слова = " + word.length() + " симв.");
            }
            continue;
        }
    }
}
