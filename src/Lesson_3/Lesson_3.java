package Lesson_3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lesson_3 {
    public static void main( String [] args) {

        lesson3HomeWork1( );
        lesson3HomeWork2( );
        sc.close();
    }
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random( );

    /// 1	Написать программу, которая загадывает случайное число от 0 до 9
    // и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить,
    // больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).

    private static void  lesson3HomeWork1( ) {
        int userInt;
        int n = 3;
        System.out.println("Программа загадывает случайное число от 0 до 9. Угадайте это число. У Вас" + n +" попытки");
        int randX = rand.nextInt(10);
        for (int i=0; i < n; i ++){
            System.out.println("Попытка № " + (1+i) + "\n Введите число :");
            userInt = sc.nextInt();
            if (userInt>=10 || userInt<0 ){
                System.out.println("Вы ввели значение которое не входит в диопазон от 0 до 9!");
                lesson3HomeWork1Return( );
                return;
            }else if(userInt > randX && i < 2){
                    System.out.println("Вы ввели значений больше загаданного");
            } else if (userInt < randX && i < 2){
                    System.out.println("Вы ввели значений меньше загаданного");
            } else if (userInt == randX){
                    System.out.println("Поздравляем Вы угадали!");
                    lesson3HomeWork1Return( );
                    return;
            } else  {
                    System.out.println("Вы проиграли. Загаданое число  = " + randX );
                    lesson3HomeWork1Return( );
                    return;
                }
        }
    }
    private static void  lesson3HomeWork1Return( ) {
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»");
        int n= sc.nextInt();
        if (n == 1)  {
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

    private static void  lesson3HomeWork2( ) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n = rand.nextInt(words.length);
        String userSt;
        String str = "###############";
        char a;
        System.out.println("Программа загадывает случайное слово  из \n" );
        System.out.print (Arrays.toString (words));

        do {
            System.out.println("\n Угадайте это слово");
            userSt = sc.nextLine();
            if (words[n].equals(userSt)) {
                System.out.println("\n Вы выйграли!");
                return;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < words[n].length() && i < userSt.length() && words[n].charAt(i) == userSt.charAt(i)) {
                        System.out.print(words[n].charAt(i));
                    } else {
                        a = str.charAt(i);
                        System.out.print(a);
                    }
                }
            }
        }while (!userSt.equals(words[n]));

    }
}
