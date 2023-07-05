package test;

import main.CalculerNote;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculerNoteTestCSV {

    @ParameterizedTest
    @CsvFileSource(resources = "/test/resources/test_scores.csv", numLinesToSkip = 1,  delimiter = ',')
    public void calculerNote_ShouldReturnExpectedGrade(String score,String expectedGrade) {
        int intscore= Integer.parseInt(score);
        int intexpectedGrade = Integer.parseInt(expectedGrade);

        int actualGrade = CalculerNote.calculerNote(intscore);
        assertEquals(intexpectedGrade, actualGrade);
    }
}
