package test;

import main.*;
import org.junit.Assert;
import org.junit.Test;

public class CalculerNoteTest {

    @Test
    public void testCalculerNote() {
        // Test case 1: Score below 0 should return 99
        int result1 = CalculerNote.calculerNote(-10);
        Assert.assertEquals(99, result1);

        // Test case 2: Score above 100 should return 99
        int result2 = CalculerNote.calculerNote(110);
        Assert.assertEquals(99, result2);

        // Test case 3: Score of 95 should return 5
        int result3 = CalculerNote.calculerNote(95);
        Assert.assertEquals(5, result3);

        // Test case 4: Score of 85 should return 4
        int result4 = CalculerNote.calculerNote(85);
        Assert.assertEquals(4, result4);

        // Test case 5: Score of 75 should return 3
        int result5 = CalculerNote.calculerNote(75);
        Assert.assertEquals(3, result5);

        // Test case 6: Score of 65 should return 2
        int result6 = CalculerNote.calculerNote(65);
        Assert.assertEquals(2, result6);

        // Test case 7: Score of 55 should return 1
        int result7 = CalculerNote.calculerNote(55);
        Assert.assertEquals(1, result7);
    }
}
