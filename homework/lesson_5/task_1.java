package homework.lesson_5;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;;

public class task_1 {
    public static void main(String[] args) {
        /*
         * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
         * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
         * проснись
         * и
         * ты
         * Еще
         * день друг Пора
         * ..
         *
         */
        String text = "Мороз и солнце день чудесный, Еще ты дремлешь друг прелестный, Пора красавица проснись";

        sortWords(text);
    }

    static void sortWords(String text) {
        text = text.replace(",", "");
        String[] words = text.split((" "));
        LinkedList<String> result = new LinkedList<>();
        System.out.println(Arrays.toString(words));
        Map<Integer, List<String>> letter = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            for (String s : words) {
                if (s.length() == i) {
                    letter.put(i, Collections.singletonList(s));
                    if (letter.get(i) != null) {
                        result.add(s);
                    }
                    letter.put(i, result);
                }
            }
            result = new LinkedList<>();
        }
        System.out.println(letter);
    }
}