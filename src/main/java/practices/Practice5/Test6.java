package practices.Practice5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test6 {

    public static void main(String[] args) throws IOException {
        try {


            File file = new File("C:\\practice\\moshe1.txt");
            String content = "hello world";

            FileWriter writer = new FileWriter(file);
            writer.write(content);

            writer.close();

        } catch (Exception e) {

        }
    }
}