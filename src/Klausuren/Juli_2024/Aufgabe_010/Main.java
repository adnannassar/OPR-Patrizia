package Klausuren.Juli_2024.Aufgabe_010;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

    public static void main(String[] args) {
        try {
            Reader r1 = new FileReader("IO_Files/src.txt");
            Reader r2 = new FileReader("IO_Files/src2.txt");

            boolean result = haveSamePrefix(r1, r2, 4);
            System.out.println("haveSamePrefix: " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean haveSamePrefix(Reader r1, Reader r2, long n) throws IOException {
        int i = 0;
        int temp1;
        int temp2;
        while ((temp1 = r1.read()) != -1 && (temp2 = r2.read()) != -1 && i < n) {
            if (temp1 != temp2) {
                return false;
            }
        }
        return true;
    }
}
