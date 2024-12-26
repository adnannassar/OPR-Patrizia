package IO;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("IO_Files/Test.txt");

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }


        String[] names = file.list();
        for (String n : names) {
            System.out.println(n);
        }
    }
}
