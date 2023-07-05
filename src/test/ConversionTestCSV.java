package test;

import main.Conversion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTestCSV {

    @ParameterizedTest
    @CsvFileSource(resources = "/test/resources/test_conversion.csv", numLinesToSkip = 1)
    public void testConversion(String mode, String sens, String valeur, String valeurAttendue) {
        Conversion conversion = new Conversion();
        double modeValue = Double.parseDouble(mode);
        double sensValue = Double.parseDouble(sens);
        double valeurValue = Double.parseDouble(valeur);
        double valeurAttendueValue = Double.parseDouble(valeurAttendue);

        double resultat = conversion.convert((int) modeValue, (int) sensValue, valeurValue);
        assertEquals(valeurAttendueValue, resultat, 0.01);
    }
}
