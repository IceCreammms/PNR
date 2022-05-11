package src.modele;

import src.modele.donnee.Lieu;

public class ScenarioDonnee {
    public static void main(String[] args) {
        //Test de Lieu.java
        Lieu testLieu = new Lieu(3.2, 6.4);

        Double crash = null;
        Lieu crashLieu = new Lieu(crash, 3.4);
    }
}
