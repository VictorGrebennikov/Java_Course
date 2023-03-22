package homework.lesson_3;

import java.util.ArrayList;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        
        // 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
        // Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        // ["string", "s", "my_value"]

        ArrayList<String> list1 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        textList1(list1);
        System.out.println(list1);

    }

    private static void textList1(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            try {
                Integer.parseInt(arr.get(i));
                arr.remove(i--);
            }
            catch (Exception e){}
        }
    }
}
