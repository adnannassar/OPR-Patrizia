package Klausuren.September_2023.Aufgabe_010;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 65; i < 123; i++) {
            set.add(i);
        }
        try {
            FileInputStream fis = new FileInputStream("IO_Files/test.txt");
            FileOutputStream fos = new FileOutputStream("IO_Files/test_copy_2.txt");
            System.out.println("Anzahl kopierter Bytes: " + kopiere(fis, fos, set));
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static long kopiere(InputStream is, OutputStream os, Set<Integer> s) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int tmp;
        long count = 0;
        while ((tmp = bis.read()) != -1) {
            if (s.contains(tmp)) {
                bos.write(tmp);
                count++;
            } else {
                break;
            }
        }
        bis.close();
        bis.close();
        bos.flush();

        return count;
    }
}
