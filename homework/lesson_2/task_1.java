package homework.lesson_2;

import java.util.Scanner;

public class task_1 {

    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
    // строку длины N,
    // которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b')
    // -> "ababab"

    public static void main(String[] args) {

        System.out.println("Длина строки: ");
        Scanner in_c = new Scanner(System.in);
        int N = in_c.nextInt();
        System.out.println("Символ 1: ");
        Scanner in_c1 = new Scanner(System.in);
        String c1 = in_c1.nextLine();
        System.out.println("Символ 2: ");
        Scanner in_c2 = new Scanner(System.in);
        String c2 = in_c2.nextLine();
        in_c.close();
        in_c1.close();
        in_c2.close();

        System.out.println(strConcat(N, c1, c2));
    }

    static String strConcat(int arg, String c1, String c2) {

        StringBuffer res = new StringBuffer(c1);
        while (res.length() != arg) {
            res.append(c2);
            if (res.length() != arg) {
                res.append(c1);
            }
        }
        return res.toString();
    }
}
