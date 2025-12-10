package Day7;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHan {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Files in Java are seriously good!!");
            writer.close();

            System.out.println("Successfully Written");
        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
