package Lesson_3;


import java.util.Scanner;
import java.util.Random;

public class Lesson_3 {
    public static void main(String[] args) {

        lesson3HomeWork1();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        lesson3HomeWork2(words);

    }

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    /// 1	Написать программу, которая загадывает случайное число от 0 до 9
    // и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
    // больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).

    private static void lesson3HomeWork1() {
        int userInt;
        int n = 3;
        System.out.printf("Программа загадывает случайное число от 0 до 9. Угадайте это число. У вас %d попытки %n", n);
        int randX = rand.nextInt(10);
        for (int i = 0; i < n; i++) {
            System.out.printf("Попытка № %d Введите число: %n", (1 + i));
            userInt = sc.nextInt();
            if (userInt >= 10 || userInt < 0) {
                System.out.println("Вы ввели значение которое не входит в диопазон от 0 до 9!");
                lesson3HomeWork1Return();
                return;
            } else if (userInt > randX && i < 2) {
                System.out.println("Ваше значение больше");
            } else if (userInt < randX && i < 2) {
                System.out.println("Ваше значение меньше");
            } else if (userInt == randX) {
                System.out.println("Поздравляем, Вы угадали!");
                lesson3HomeWork1Return();
                return;
            } else {
                System.out.printf("Вы проиграли. Загаданое число = %d %n", randX);
                lesson3HomeWork1Return();
                return;
            }
        }
        sc.close();
    }

    private static void lesson3HomeWork1Return() {
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
        int n = sc.nextInt();
        if (n == 1) {
            lesson3HomeWork1();
        }
    }

    //2	* Создать массив из слов
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
    // "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
    // "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    // сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
    // Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Угаданные в прошлые ответы буквы запоминать не надо. То есть при следующем ответе:
    // carpet (ковер, не фрукт, но это всего лишь пример), будет выведено:####e##########
    //Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple";
    //char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово.
    //Используем только буквы в нижнем регистре.

    private static void lesson3HomeWork2(String[] words) {

        int n = rand.nextInt(words.length);
        String userSt;
        String str = "###############";
        char index;
        System.out.printf("Программа загадывает случайное слово из набора слов: %n");
        printArraysString(words);

        do {
            System.out.printf("%n Угадайте это слово %n ");
            userSt = sc.next();
            if (words[n].equals(userSt)) {
                System.out.println(" Вы выйграли!");
                return;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[n].length() && i < userSt.length() && words[n].charAt(i) == userSt.charAt(i)) {
                        System.out.print(words[n].charAt(i));
                    } else {
                        index = str.charAt(i);
                        System.out.print(index);
                    }
                }
            }
        } while (!userSt.equals(words[n]));
    }

    private static void printArraysString(String[] words) {
        for (int i = 0; i < words.length; i = i + 5) {
            for (int j = i; j < 5 + i; j++) {
                System.out.print(words[j]);
                System.out.print(", ");
            }
            System.out.printf("%n");
        }
    }
}
