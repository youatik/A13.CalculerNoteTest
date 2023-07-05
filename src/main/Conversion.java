package main;

public class Conversion {
    /**
     * La methode convert permet d'offrir les conversions suivantes : Mode 1 : elle
     * convertit des Celsius en Fahrenheit et inversement. Mode 2 : Elle convertit
     * des Miles en Kilometres et inversement.
     * @param mode   est un entier qui peut etre 1 ou 2.
     * @param sens   est un entier qui peut etre 1 ou 2.
     * @param valeur est la valeur ‡ convertir
     * @return Le resultat de la conversion en double.
     */
    public double convert(int mode, int sens, double valeur) {
        double resultat, tauxMK = 1.6;
        // Mode 1 : Convertisseur de tempÈrature
        if (mode == 1) {
            // Valeurs valides ‡ convertir
            if ((valeur <= 500) && (valeur >= -100)) {
                // Sens 1 : Celsius vers Fahrenheit
                if (sens == 1) {
                    resultat = (2 * valeur) + 32;
                }
                // Sens 2 : Fahrenheit vers Celsius
                else if (sens == 2) {
                    resultat = (valeur - 32) / 2;
                }
                // Valeurs invalides pour sens
                else {
                    resultat = 0;
                }
                // Valeurs invalides ‡ convertir
            } else {
                resultat = 0;
            }
        }
        // Mode 2 : Convertisseur de distance
        else if (mode == 2) {
            // Valeurs valides ‡ convertir
            if (valeur > 0) {
                // Sens 1 : Miles vers Km
                if (sens == 1) {
                    resultat = valeur * tauxMK;
                }
                // Sens 2 : Km vers Miles
                else if (sens == 2) {
                    resultat = valeur / tauxMK;
                }
                // Valeurs invalides pour sens
                else {
                    resultat = 0;
                }
            }
            // valeurs invalides ‡ convertir
            else {
                resultat = 0;
            }
        }
        // Valeurs invalides pour mode
        else {
            resultat = 0;
        }
        return resultat;
    }
}