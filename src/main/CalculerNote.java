package main;

public class CalculerNote {

    public CalculerNote() {
        // Default constructor
    }

    public static int calculerNote(int score) {
        if (score < 0 || score > 100) {
            return 99; // Erreur;
        } else if (score >= 90) {
            return 5; // A
        } else if (score >= 80) {
            return 4; // B
        } else if (score >= 70) {
            return 3; // C
        } else if (score >= 60) {
            return 2; // D
        } else {
            return 1; // E
        }
    }
}
