package homework.lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class task_1 {
    // Реализовать консольное приложение, которое:
    // Принимает от пользователя строку вида text~num
    // 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
    // num.
    // 2. Если введено print~num, выводит строку из позиции num в связном списке.
    // 3. Если введено exit, завершаем программу

    // Пример:
    // string~4
    // num~3
    // print~3
    // > num
    // print~4
    // > string
    // my_value~1
    // print~1
    // > my_value

    public static void main(String[] args) {
        System.out.println("Enter the data and index to save via '~' (or 'exit' for exit)':");
        System.out.print("-> ");
        Scanner in_data = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = in_data.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("~")[1]);
                func(text, listData);
            } catch (Exception e) {
                System.out.println("Error! Try again!");
            }
        }
    }
    
    static void func(String text, ArrayList<String> listData) {
        String[] consData = text.split("~");
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
            for (int i = 0; i <= localSize; i++) {
                listData.add(null);
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } else {
                listData.set(num, consData[0]);
            }
    }
}
