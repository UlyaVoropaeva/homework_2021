package Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
        variableUser ();

        System.out.println("Результат " + ABCD());

        boolean resultXY = XY(20, 20);
        System.out.println("Результат (X+Y)>=10 && (X+Y)<= 20 " + resultXY);

        int it = -10;
        integerNumber(it);

        boolean resItBool = intBooleanNumber(it);
        System.out.println("Результат  " + resItBool);

        HelloString("В.В. Путин");
        int years = 2021;
        leapYears (years);
    }


    // Создать переменные всех пройденных типов данных и инициализировать их значения.
    private static void variableUser (){

        char ch = 'A';
        String ST = "Создать переменные всех пройденных типов данных и инициализировать их значения:";
        int it = 1;
        float fl = 3.14159265f;
        boolean bool = true;
        byte bt = -128;
        short sh = 32767;
        long lg = 9223372036854775807l;
        double db = 170000000000000000000000000000000000000000000000000000d;
        System.out.println(ST + "\n char = " + ch + "\n int = " + it + "\n float = " + fl + "\n byte = " + bt + " \n short = " + sh + "\n long =  " + lg + "\n double = " + db + " \n boolean = " + bool);
    }

    //  Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    private static float ABCD () {

        float a = 10f, b = 20f, c = 40.45f, d = 2f;
        float result;
        result = a * (b + (c / d));
        return result;
    }

    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.

    private static boolean XY ( int X, int Y ){

        boolean bool = (X + Y) >= 10 && (X + Y) <= 20;
        if (bool) {
            return bool;
       } else  return bool;

    }

    //5. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    private static void integerNumber ( int A){

        if (A >= 0) {
            System.out.println("Число положительное " + A);
        } else
            System.out.println("Число отрицательное " + A);
    }

    // Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    private static boolean intBooleanNumber ( int a){
        if (a < 0) {
            return true;
        } else return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    private static void HelloString (String HelloStr){

        System.out.println("Привет, " + HelloStr + " !");
    }

    // 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    private static void leapYears ( int years){

        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    System.out.println(" Год високосный = " + years);
                } else System.out.println("Нe високосный год= " + years);
            } else System.out.println(" Год високосный = " + years);
        } else System.out.println(" Год не високосный = " + years);

    }

    }
