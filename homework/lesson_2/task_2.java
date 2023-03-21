package homework.lesson_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class task_2 {

    // Создать файл с названием file.txt. Если файл уже есть,
    // то создавать не надо. Записать в него Слово "TEXT" 100 раз

    public static void main(String[] args) throws IOException  {
        FileOutputStream f = new FileOutputStream("homework/lesson_2/file.txt");
        
        String text = "TEXT\n";
        for (int i = 0; i < 100; i++) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            
            f.write(bytes);
        }
        f.close();
    }
}

