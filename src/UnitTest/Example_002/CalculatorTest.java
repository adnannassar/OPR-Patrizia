package UnitTest.Example_002;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }


    @Test
    public void testAddGivesACorrectResult() {
        // Act
        int result = calculator.add(5, 5);


        // Assert
        int expected = 10;
        assertEquals(expected, result);
    }

    @Test
    public void testSubtractGivesGivesCorrectResultWithWrongExpected() {
        // Act
        int result = calculator.subtract(5, 3);

        // Assert
        int expected = 10;
        assertNotEquals(expected, result);
    }

}
