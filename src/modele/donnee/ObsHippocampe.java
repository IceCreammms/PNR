package src.modele.donnee;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * ObsHippocampe
 @author Stévan JEANNE
 */
public class ObsHippocampe extends Observation {

    private double taille;

    private boolean estGestant;

    private Peche typePeche;

    private EspeceHippocampe espece;

    private Sexe sexe;

    /**
     *
     */
    public ObsHippocampe(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, double laTaille, Peche leTypePeche, EspeceHippocampe lEspece, Sexe leSexe) throws IllegalArgumentException{
        super(id, date, heure, lieu, observateurs);

        this.estGestant = false;

        if(laTaille <= 0.0) 
            throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : laTaille invalide ");

        this.taille = laTaille;

        if(leTypePeche == null)
            throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : leTypePeche invalide ");

        this.typePeche = leTypePeche;

        if(lEspece == null)
            throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : lEspece invalide ");

        this.espece = lEspece;

        if(leSexe == null)
            throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : leSexe invalide ");

        this.sexe = leSexe;
        
    }

	
	public EspeceObserve especeObs() {
		
		return EspeceObserve.HPPOCAMPE;
	}

    public double getTaille() {
        return this.taille;
    }
}