package Klausuren.Januar_2024.Aufgabe_009;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("IO_Files/long_text.txt"));
            Set<String> content = content(bufferedReader, "stop");
            for (String s : content) {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static Set<String> content(Reader r, String stopp) throws IOException {
        Set<String> result = new LinkedHashSet<>();
        BufferedReader bufferedReader = new BufferedReader(r);
        String tmp;
        while ((tmp = bufferedReader.readLine()) != null) {
            if (tmp.contains(stopp)) {
                break;
            }
            result.add(tmp);
        }
        return result;
    }
}
