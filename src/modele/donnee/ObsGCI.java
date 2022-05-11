package src.modele.donnee;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * @author Nael Jomaa
 * ObsGCI
 */
public class ObsGCI extends Observation {
    private int nombre;
    
    public ObsGCI(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) {
        super(id, date, heure, lieu, observateurs);
        if (nature == null) {
            throw new IllegalArgumentException("Err - ObsGCI : nature est null.");
        }

        if (leNombre < 0) {
            throw new IllegalArgumentException("Err - ObsGCI : leNombre < 0.");
        }
        else {
            this.nombre = leNombre;
        }
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

    public int getNombre() {
        return this.nombre;
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

	public EspeceObserve especeObs() {
        
		return EspeceObserve.GCI;

	}
}