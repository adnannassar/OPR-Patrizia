package Klausuren.September_2023.Aufgabe_003;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertThrows;

public class Aufgabe_003 {
    public static void main(String[] args) {

    }

    @Test
    public void testNextThrowsException() {
        // Arrange
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        Iterator<String> iterator = set.iterator();

        // Act
        iterator.next();
        iterator.next();

        // Assert
        assertThrows(NoSuchElementException.class, () -> iterator.next());
        assertThrows(NoSuchElementException.class, iterator::next);
    }


}
