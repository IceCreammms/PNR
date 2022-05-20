package src.modele.donnee;

import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;

/**
 * Cette classe permet de numériser un protocol d'observation de 
 * l'espèce Chouette, cette classe est aussi une sous-classe de 
 * la classe Observation.
 * @author Naël Jomaa
 */
public class ObsChouette extends Observation {
    private TypeObservation typeObs;

    /**
     * Constructeur de ObsChouette.
     * @param id l'identification de la chouette.
     * @param date la date de l'observation.
     * @param heure l'heure de l'observation.
     * @param lieu le lieu de l'observation.
     * @param observateurs la personne qui a fait l'observation.
     * @param type le type de l'observation.
     * @throws IllegalArgumentException Si un argument donne n'est pas correct.
     */
    public ObsChouette(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> Observateurs, TypeObservation type) throws IllegalArgumentException {
        super(id, date, heure, lieu, Observateurs);
        if (type == null) {
            throw new IllegalArgumentException("Err - ObsBatracien : type est null.");
        }
        else {
            this.typeObs = type;
        }
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

    /**
     * Renvoie le type de l'observation.
     * @return le type de l'observation.
     */
    public TypeObservation getTypeObs() {
        return this.typeObs;
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

    /**
     * L'espece de chouette observée.
     * @return CHOUETTE.
     */
	  public EspeceObserve especeObs() {
  		return EspeceObserve.CHOUETTE;
	  }
}