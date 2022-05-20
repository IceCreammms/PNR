package src.modele.donnee;

import java.sql.Time;
import java.util.ArrayList;
import java.sql.Date;

/**
 * Cette classe permet de numériser un protocol d'observation de 
 * l'espèce Batracien, cette classe est aussi une sous-classe de 
 * la classe Observation.
 * @author Naël Jomaa
 */
public class ObsBatracien extends Observation {
	private int nombreAdultes;
  private int nombreAmplexus;
  private int nombreTetard;
  private int nombrePonte;
  private EspeceBatracien espece;

  /**
   * Constructeur de ObsBatracien.
   * @param id l'identification du batracien.
   * @param date la date de l'observation.
   * @param heure l'heure de l'observation.
   * @param lieu le lieu de l'observation.
   * @param observateurs la personne qui a fait l'observation.
   * @param resObs tableau qui contient 4 entiers indiquant le résultat de l'observation.
   * @param lEspece le type d'espece de batracien observée.
   * @throws IllegalArgumentException Si un argument donne n'est pas correct.
   */
  public ObsBatracien(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> Observateurs, int[] resObs, EspeceBatracien lEspece) throws IllegalArgumentException {
	  super(id, date, heure, lieu, Observateurs);
	  if (resObs.length < 4) {
      throw new IllegalArgumentException("Err - ObsBatracien : resObs < 4.");
    }
    if (lEspece == null) {
      throw new IllegalArgumentException("Err - ObsBatracien : lEspece est null.");
    }
    else {
      this.espece = lEspece;
    }
	}

  //----------------------------------------------------------------------------------------------------
  //----------------------------------------------------------------------------------------------------

  /**
   * Renvoie le nombre de batraciens adultes observé.
   * @return le nombre d'adultes.
   */
  public int getNombreAdultes() {
    return this.nombreAdultes;
  }
  /**
   * Renvoie le nombre d'amplexus observé.
   * @return le nombre d'amplexus.
   */
  public int getNombreAmplexus() {
    return this.nombreAmplexus;
  }
  /**
   * Renvoie le nombre de tetards observé.
   * @return le nombre de tetards.
   */
  public int getNombreTetard() {
    return this.nombreTetard;
  }
  /**
   * Renvoie le nombre d'oeufs observé.
   * @return le nombre d'oeufs.
   */
  public int getNombrePonte() {
    return this.nombrePonte;
  }
  /**
   * Renvoie l'espece observée.
   * @return l'espece observée.
   */
  public EspeceBatracien getEspece() {
    return this.espece;
  }

  //----------------------------------------------------------------------------------------------------
  //----------------------------------------------------------------------------------------------------

  /**
   * L'espece de batracien observée.
   * @return BATRACIEN.
   */
  public EspeceObserve especeObs() {
  	return EspeceObserve.BATRACIEN;
  }
}