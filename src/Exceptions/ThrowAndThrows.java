package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ThrowAndThrows {
    public static void main(String[] args) {
        testReadFile();
    }

    public static void testReadFile() {
        try {
            readFile();
        } catch (IOException e) {
            System.err.println("File not found!");
        }

    }

    public static void readFile() throws IOException {
        try {
            FileReader stringReader = new FileReader("test.txt");
            int a;
            while ((a = stringReader.read()) != -1) {
                System.out.printf("%c", a);
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }
}
