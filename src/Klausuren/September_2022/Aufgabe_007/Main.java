package Klausuren.September_2022.Aufgabe_007;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("IO_Files/test.txt");
            System.out.println(hatMindestlaenge(inputStream, 5)); // true
            System.out.println(hatMindestlaenge(inputStream, 100)); // false
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean hatMindestlaenge(InputStream is, long mindestLaenge) throws IOException {
        if (is == null || mindestLaenge < 0) {
            throw new IllegalArgumentException("Mindestlaenge ist kleiner als 0");
        }

        // efficient way to read from file
        BufferedInputStream bis = new BufferedInputStream(is);
        int counter = 0;
        while (bis.read() != -1 && counter < mindestLaenge) {
            counter++;
        }
        return counter >= mindestLaenge;
    }
}
