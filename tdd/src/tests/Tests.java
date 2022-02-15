package tests;
import app.MathLibrary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Tests {
    
    @Test
    public void IsTestHarnessWorking()
    {
        assertEquals(1, 1, "Test harness is working");
    }

    @Test
    public void SquareANumber()
    {
        assertEquals(25, MathLibrary.Square(5));
    }

    @Test
    public void ReverseEvenNumberOfDigits()
    {
        assertEquals(4321, MathLibrary.ReverseDigits(1234), "Test reversing an even number of digits");
    }

    @Test
    public void ReverseOddNumberOfDigits()
    {
        assertEquals(987654321, MathLibrary.ReverseDigits(123456789), "Test reversing an odd number of digits");
    }

}
