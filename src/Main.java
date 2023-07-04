import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.next();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.next();

        // Проверка количества букв в словах
        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Ошибка! Введите два слова, состоящих из четного количества букв.");
        } else {
            String half1 = word1.substring(0, word1.length() / 2);  // Первая половина первого слова
            String half2 = word2.substring(word2.length() / 2);      // Вторая половина второго слова
            String result = half1 + half2;
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}

