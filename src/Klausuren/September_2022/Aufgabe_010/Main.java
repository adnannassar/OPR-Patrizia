package Klausuren.September_2022.Aufgabe_010;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import static org.junit.Assert.assertThrows;

public class Main {

    @Test
    public void testStringTokenizer() {
        // Arrange
        StringTokenizer st = new StringTokenizer("E-Bike", "-");

        // Act
        st.nextToken();
        st.nextToken();

        // Assert
        assertThrows(NoSuchElementException.class, st::nextToken);
        // Or
        // assertThrows(NoSuchElementException.class, () -> st.nextToken());
    }
}
