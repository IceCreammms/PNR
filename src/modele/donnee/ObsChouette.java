package src.modele.donnee;

import java.util.ArrayList;
import java.sql.Date;
import java.sql.Time;

/**
 * @author Naël Jomaa
 * Chouette
 */
public class ObsChouette extends Observation {
    private TypeObservation typeObs;

    public ObsChouette(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> Observateurs, TypeObservation type) {
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

    public TypeObservation getTypeObs() {
        return this.typeObs;
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

	public EspeceObserve especeObs() {
		// TODO Auto-generated method stub
		return EspeceObserve.CHOUETTE;
	}
}