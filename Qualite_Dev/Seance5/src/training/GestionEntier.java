package training;

public class GestionEntier {
    private int valeur;
    private int min;
    private int max;

    public GestionEntier(int initial, int min, int max) {
        if (initial < min || initial > max) {
            throw new IllegalArgumentException("La valeur initiale est hors des limites");
        }
        this.valeur = initial;
        this.min = min;
        this.max = max;
    }

    public void incrementer() {
        if (valeur >= max) {
            throw new RuntimeException("La valeur ne peut pas dépasser " + max);
        }
        valeur++;
    }

    public void decrementer() {
        if (valeur <= min) {
            throw new RuntimeException("La valeur ne peut pas être inférieure à " + min);
        }
        valeur--;
    }

    public int getValeur() {
        return valeur;
    }
}
