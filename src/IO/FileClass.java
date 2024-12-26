package IO;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("IO_Files");
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles((f, name) -> name.contains("s"));
            if (files != null && files.length > 0) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
