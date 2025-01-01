package Klausuren.Juli_2024.Aufgabe_003;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class X {

    // Die methode macht alle leerzeichen weg
    public String f(String s) {
        return s.replace(" ", "");
    }

    public List<String> g(String s, int n) {
        if (n >= 100) {
            List<String> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(String.valueOf(s.length() * n));
            }
            return list;
        } else {
            throw new IllegalArgumentException("Parameter n is too small. ");
        }
    }


    X x;

    @Before
    public void setup() {
        x = new X();
    }

    @Test
    public void testFMitLeerzeichen() {
        assertEquals("Hallo", x.f("H a l l o"));
    }

    @Test
    public void testFOhneLeerzeichen() {
        assertEquals("Hallo", x.f("Hallo"));
    }

    @Test
    public void testGMitNGroßerNull() {
        // Act
        List<String> list = x.g("Hallo", 150);

        // Assert
        assertEquals(150, list.size());
    }

    @Test
    public void testGMitNKleinerNull() {
        // Assert
        assertThrows(IllegalArgumentException.class, () -> x.g("Hallo", 50));
    }
}
