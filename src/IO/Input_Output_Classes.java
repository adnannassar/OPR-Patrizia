package IO;

import java.io.*;

public class Input_Output_Classes {
    public static void main(String[] args) {
        File file = new File("IO_Files/Test1.txt");

        readFromFile(file);

        writeInFile(file);
    }

    private static void readFromFile(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int temp;
            while ((temp = fis.read()) != -1) {
                System.out.print((char) temp);
            }
            System.out.println("\nSuccessfully read from file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeInFile(File file) {
        try {
            FileOutputStream fis = new FileOutputStream(file);
            String word = ". This is a test.";
            for (int i = 0; i < word.length(); i++) {
                fis.write(word.charAt(i));
            }
            System.out.println("Successfully written in file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
