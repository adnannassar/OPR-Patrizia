package IO;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("IO_Files/Test.txt");
        System.out.println(file.getName());
    }
}
