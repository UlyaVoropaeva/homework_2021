package Lesson_2;
 import  java.util.Arrays;

public class Lesson_2 {
    public static void main( String [] args) {
        System.out.println( " Задача №1:  ");
        lesson2HomeWork1( );
        System.out.println( "\n Задача №2:  ");
        lesson2HomeWork2 ( );
        System.out.println( "\n Задача №3: ");
        lesson2HomeWork3 ( );
        System.out.println( "\n Задача №4: ");
        lesson2HomeWork4 ( );
        System.out.println( "\n Задача №5:  ");
        lesson2HomeWork5 ( );
        System.out.println( "\n Задача №6:  ");
        int[] mas = { 2, 2, 2,5,  1, 2, 2, 10, 1, 5 };
        lesson2HomeWork6 ( mas );
        System.out.println( "\n Задача №7:  ");
        int n = -5;
        lesson2HomeWork7 (mas, n );

    }
    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;


   private static void lesson2HomeWork1 (  ){
       int[] mas = {0, 1, 0, 1, 0, 1, 0, 1, 0 ,1};
       for (int i=0; i< mas.length; i++){
          switch (mas[i]) {
              case 0: mas[i] =1; break;
              case 1: mas[i] =0;
          }
       }
       System.out.print (Arrays.toString (mas));
   }
    //2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    private static void lesson2HomeWork2 (  ){
        int[] mas = new int[8];

        for (int i=0; i<mas.length; i++){
            mas[i] = i * 3;
        }
        System.out.print (Arrays.toString (mas));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;

    private static void lesson2HomeWork3 ( ){
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i=0; i < mas.length; i++){
            if(mas[i]<6) {
                mas[i]=mas[i]*2;
            }
        }
        System.out.print (Arrays.toString (mas));
    }

   //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    private static void lesson2HomeWork4 ( ){
        int[][] mas = new int [3][3];

        for (int i=0; i < mas.length; i++){
            for(int j=0; j<mas[i].length; j++) {
               if (i == j) {
                    mas[i][j] = 1;
                } else if ((mas.length-1-i)==(j)){
                    mas[(i)][j] = 1;
                }  else {
                    mas[i][j] = 0;
                }
                System.out.println(mas[i][j]);
            }
        }
    }
//5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void lesson2HomeWork5 ( ){
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,0 };
        int min = mas[0];
        int max = mas[0];
        for(int i=0; i < mas.length; i++) {
            if(mas[i]<min) {
                min =mas [i] ;
            } else if (mas[i]> max){
                max= mas [i] ;
            }
        }
        System.out.println ("Минимальное значение = " + min + "\nМаксимальное значение =" + max);
    }
//6. ** Написать метод, в который передается не пустой одномерный целочисленный масси
// метод должен вернуть true, если в массиве есть место, в котором сумма левой
// и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    private static  void lesson2HomeWork6 (int[] mas ){
        int sum1= 0,sum2;

        for(int i=0; i< mas.length; i++){
            sum1 += mas[i];
            sum2 = 0;
            for (int j = mas.length-1; j > i; --j) {
                sum2 += mas[j];
            }
            if (sum1 == sum2){
                System.out.println("сумма левой = " + sum1 +" и правой части =" + sum2 +" массива равны");
                break;
            }
        }
    }
    //7. **** Написать метод, которому на вход подается одномерный массив и число n
    // (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    private static  void lesson2HomeWork7 (int[] mas, int n ) {
        int x;
        if (n>0) {
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < mas.length ; i++) {
                    x = mas[i];
                    mas[i] = mas[mas.length - 1];
                    mas[mas.length - 1] = x;
                }
            }
        }else {
            for (int j = n; j < 0; j++) {
                for (int i = mas.length -1; i >= 0; i--) {
                    x = mas[i];
                    mas[i] = mas[mas.length - 1];
                    mas[mas.length - 1] = x;
                }
            }
        }
        System.out.print (Arrays.toString (mas));
    }
}

