package Lesson_4;

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    static void start() {
        System.out.println("Введите размер игрового поля:");
        char[][] field = emptyField(scanner.nextInt());
        int user = userNumber(field);
        char[] symbol = masSymbol(user);
        int[] masHV = new int[2];

        drawField(field);

        while (true) {
            masHV = doPlayerMove(field, 'X');
            drawField(field);
            if (checkingResults(field, 'X')) {
                break;
            }
            for (int i = 0; i < user; i++) {
                doAIMove(field, symbol[i], masHV);
                drawField(field);
                if (checkingResults(field, symbol[i])) {
                    break;
                }
            }
        }
    }

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    static char[] masSymbol(int length) {
        char[] symbol = new char[length];

        for (int i = 0; i < length; i++) {
            symbol[i] = (char) ('A' + random.nextInt(22));
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++)
                if (symbol[i] == symbol[j]) {
                    symbol[i] = (char) ('A' + random.nextInt(22));
                }
        }

        return symbol;
    }

    static int userNumber(char[][] field) {
        int user;
        do {
            System.out.println("Введите количество играков (количество фишек):");
            user = scanner.nextInt() - 1;

        } while (user >= field.length - 1 || user < 1);

        return user;
    }

    static int[] doPlayerMove(char[][] field, char symbol) {
        int h, v;

        do {
            h = getCoordinate(field.length, 'h');
            v = getCoordinate(field.length, 'v');
        } while (isOccupiedCell(field, h, v));

        field[h][v] = symbol;
        int[] masHV = {h, v};

        return masHV;
    }

    static void doAIMove(char[][] field, char symbol, int[] masHV) {

        int h, v;
        int num;

        do {
            num = random.nextInt(3);
            if (num == 0) {
                h = random.nextInt(field.length);
                v = random.nextInt(field.length);
            } else if (num == 1) {
                h = masHV[0];
                v = random.nextInt(field.length);
            } else {
                h = random.nextInt(field.length);
                v = masHV[1];
            }

        } while (isOccupiedCell(field, h, v));

        field[h][v] = symbol;
    }


    static int getCoordinate(int length, char symbol) {

        int coordinate;

        do {
            System.out.printf("Пожалуйста введите %s-значение ...%n", symbol);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= length);

        return coordinate;
    }

    static boolean isOccupiedCell(char[][] field, int h, int v) {
        return field[h][v] != '-';
    }

    static boolean checkingResults(char[][] field, char symbol) {
        if (isWin(field, symbol)) {
            String message = symbol == 'X' ? "Поздравляем! Вы выйграли" : "Увы, но вы проиграли...";
            System.out.println(message);
            return true;
        }
        if (isDraw(field)) {
            System.out.println("Вот и ничья, игра закончена.");
            return true;
        }
        return false;
    }

    static boolean isWin(char[][] field, char symbol) {

        int indXY = 0, indYX = 0;

        for (int i = 0; i < field.length; i++) {
            int indX = 0, indY = 0;

            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == symbol) {
                    indX++;
                }
                if (field[j][i] == symbol) {
                    indY++;
                }
            }

            if (field[i][i] == symbol) {
                indXY++;
            }
            if (field[i][field.length - 1 - i] == symbol) {
                indYX++;
            }
            if (indX == field.length || indY == field.length || indXY == field.length || indYX == field.length) {
                return true;
            }

        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (!isOccupiedCell(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static char[][] emptyField(int size) {
        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = '-';
            }
        }
        return field;
    }

    static void drawField(char[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
