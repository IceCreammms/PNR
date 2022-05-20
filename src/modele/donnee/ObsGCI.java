package src.modele.donnee;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Cette classe permet de numériser un protocol d'observation de 
 * l'espèce Gravelotd, cette classe est aussi une sous-classe de 
 * la classe Observation.
 * @author Nael Jomaa
 */
public class ObsGCI extends Observation {
    private int nombre;
    private ContenuNid natureObs;

    /**
     * Constructeur de ObsGCI
     * @param id l'identification du GCI.
     * @param date la date de l'observation.
     * @param heure l'heure de l'observation.
     * @param lieu le lieu de l'observation.
     * @param observateurs la personne qui a fait l'observation.
     * @param nature le contenu du nid (selon l'enum).
     * @param leNombre le nombre d'"objets" dans le nid (ex: 2 oeufs).
     * @throws IllegalArgumentException Si un argument donne n'est pas correct.
     */
    public ObsGCI(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, ContenuNid nature, int leNombre) throws IllegalArgumentException {
        super(id, date, heure, lieu, observateurs);
        if (nature == null) {
            throw new IllegalArgumentException("Err - ObsGCI : nature est null.");
        }
        else {
          this.natureObs = nature;
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

    /**
     * Renvoie le nombre d'objet observé (ex: 2 oeufs).
     * @return le nombre.
     */
    public int getNombre() {
        return this.nombre;
    }

    //----------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------

  /**
   * L'espece de GCI observée.
   * @return GCI.
   */
	public EspeceObserve especeObs() {
		return EspeceObserve.GCI;
	}
}