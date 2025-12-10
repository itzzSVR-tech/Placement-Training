package Day7;

import java.io.File;
import java.io.IOException;

public class FileHandle {
    public static void main(String[] args) {
        try {
            File Obj = new File("myFile.txt");
            if (Obj.createNewFile()) {
                System.out.println("File Created: " + Obj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
}
