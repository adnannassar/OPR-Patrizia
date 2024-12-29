package Klausuren.September_2022.Aufgabe_008;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        try {
            FileInputStream is = new FileInputStream("IO_Files/test.txt");
            IntPredicate filter = value -> value != 35;

            FilteredInputStream filteredInputStream = new FilteredInputStream(is, filter);
            System.out.println(filteredInputStream.read());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
