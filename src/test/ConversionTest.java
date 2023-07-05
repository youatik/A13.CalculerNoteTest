package test;

import main.Conversion;
import org.junit.Assert;
import org.junit.Test;

public class ConversionTest {
    //la valeur delta est utilisée dans les comparaisons pour tenir compte de l'imprécision de l'arithmétique à virgule flottante.
    //la classe Conversion utlise une formule C->F erronee par consequent les tests ne passent pas tous
    @Test
    public void testConversionMode1Sens1() {
        // Conversion de Celsius en Fahrenheit (Sens 1)
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(1, 1, 25);
        Assert.assertEquals("La conversion de Celsius en Fahrenheit (Sens 1) a échoué. Paramètres : mode = 1, sens = 1, valeur = 25", 77, resultat, 0.01);
    }

    @Test
    public void testConversionMode1Sens2() {
        // Conversion de Fahrenheit en Celsius (Sens 2)
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(1, 2, 86);
        Assert.assertEquals("La conversion de Fahrenheit en Celsius (Sens 2) a échoué. Paramètres : mode = 1, sens = 2, valeur = 86", 30, resultat, 0.01);
    }

    @Test
    public void testConversionMode1SensInvalide() {
        // Conversion avec un sens invalide
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(1, 3, 25);
        Assert.assertEquals("La conversion avec un sens invalide a échoué. Paramètres : mode = 1, sens = 3, valeur = 25", 0, resultat, 0.01);
    }

    @Test
    public void testConversionMode1ValeurCelsiusInvalide() {
        // Conversion avec une valeur Celsius invalide
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(1, 1, 600);
        Assert.assertEquals("La conversion avec une valeur Celsius invalide a échoué. Paramètres : mode = 1, sens = 1, valeur = 600", 0, resultat, 0.01);
    }

    @Test
    public void testConversionMode2Sens1() {
        // Conversion de Miles en Kilomètres (Sens 1)
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(2, 1, 10);
        Assert.assertEquals("La conversion de Miles en Kilomètres (Sens 1) a échoué. Paramètres : mode = 2, sens = 1, valeur = 10", 16, resultat, 0.01);
    }

    @Test
    public void testConversionMode2Sens2() {
        // Conversion de Kilomètres en Miles (Sens 2)
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(2, 2, 16);
        Assert.assertEquals("La conversion de Kilomètres en Miles (Sens 2) a échoué. Paramètres : mode = 2, sens = 2, valeur = 16", 10, resultat, 0.01);
    }

    @Test
    public void testConversionMode2SensInvalide() {
        // Conversion avec un sens invalide
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(2, 3, 10);
        Assert.assertEquals("La conversion avec un sens invalide a échoué. Paramètres : mode = 2, sens = 3, valeur = 10", 0, resultat, 0.01);
    }

    @Test
    public void testConversionMode2ValeurMilesInvalide() {
        // Conversion avec une valeur Miles invalide
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(2, 1, -5);
        Assert.assertEquals("La conversion avec une valeur Miles invalide a échoué. Paramètres : mode = 2, sens = 1, valeur = -5", 0, resultat, 0.01);
    }

    @Test
    public void testConversionModeInvalide() {
        // Conversion avec un mode invalide
        Conversion conversion = new Conversion();
        double resultat = conversion.convert(3, 1, 25);
        Assert.assertEquals("La conversion avec un mode invalide a échoué. Paramètres : mode = 3, sens = 1, valeur = 25", 0, resultat, 0.01);
    }
}
