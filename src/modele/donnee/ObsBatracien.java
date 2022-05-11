package src.modele.donnee;

import java.sql.Time;
import java.util.ArrayList;
import java.sql.Date;

/**
 * @author Naël Jomaa
 * ObsBatracien
 */
public class ObsBatracien extends Observation {
	private int nombreAdultes;
  private int nombreAmplexus;
  private int nombreTetard;
  private int nombrePonte;
  private EspeceBatracien espece;

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

  public int getNombreAdultes() {
    return this.nombreAdultes;
  }
  public int getNombreAmplexus() {
    return this.nombreAmplexus;
  }
  public int getNombreTetard() {
    return this.nombreTetard;
  }
  public int getNombrePonte() {
    return this.nombrePonte;
  }
  public EspeceBatracien getEspece() {
    return this.espece;
  }

  //----------------------------------------------------------------------------------------------------
  //----------------------------------------------------------------------------------------------------

  public EspeceObserve especeObs() {
  	return EspeceObserve.BATRACIEN;
  }
}