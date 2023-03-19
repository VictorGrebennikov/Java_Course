package homework.lesson_1;

import java.util.Scanner;
import java.util.Arrays;

public class task_1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = in.nextInt();
        System.out.println(isLeapYear(year));

        in = new Scanner(System.in);
        System.out.println("Введите длину: ");
        int len = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int initialValue = in.nextInt();

        int[] arr = createArray(len, initialValue);
        System.out.println(Arrays.toString(arr));

        changeBinValue();
        multArrValue();

        fillArray(5);
    
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int s = a + b;
        if ((20 >= s) & (s >= 10)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return false;
        }
        return true;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initalValue;
        }
        return array;
    }

    private static void changeBinValue() {
        // * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
        // * заменить 0 на 1, 1 на 0;
        int[] binArr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < binArr.length; i++) {
            if (binArr[i] == 1) {
                binArr[i] = 0;
            } else {
                binArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(binArr));
    }

    public static void multArrValue() {
        // * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // * циклом, и числа меньшие 6 умножить на 2;
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void fillArray(int arg) {
        // * 3. Создать квадратный двумерный целочисленный массив (количество строк и
        // * столбцов одинаковое),
        // * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
        // * только одну из диагоналей, если обе сложно).
        // * Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы
        // * таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // * * Также заполнить элементы побочной диагонали
        int[][] array = new int[arg][arg]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j || j == array.length - 1 - i) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

