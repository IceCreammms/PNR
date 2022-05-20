package src.modele.donnee;

import src.modele.donnee.Sexe;
import src.modele.donnee.EspeceChouette;

/**
 * Chouette
 * 
 * @author Tanguy Sergent
 * 
 */
public class Chouette implements IObs {

  private ArrayList<ObsChouette> lesObservations;
  private String idChouette;
  private Sexe sexe;
  private EspeceChouette espece;

  /**
   * Constructeur de chouette
   */
  public Chouette(String id, Sexe leSexe, EspeceChouette lEspece) {
    this.idChouette = id;
    this.sexe = leSexe;
    this.espece = espece;

    this.lesObservations = new ArrayList<ObsChouette>();

    if (id.equals(null)) {
      throw new IllegalArgumentException("Err - id null");
    } else if (leSexe == null) {
      throw new IllegalArgumentException("Err - sexe null");
    } else if (lEspece == null) {
      throw new IllegalArgumentException("Err - Espece null");
    }
  }

  public void ajouteUneObs(ObsChouette obs) {

    if (obs == null) {
      throw new IllegalArgumentException("Err - Observation null");
    } else {
      this.lesObservations.add(obs);
    }
  }

  public void ajoutePlsObs(ArrayList<ObsChouette> obs) {
    if(obs == null) {
      throw new IllegalArgumentException("Err - ArrayList d'observation null");
    } else {
      for(ObsChouette observation : obs) {
        this.lesObservations.add(observation);
      }
    }
  }

  public void videObs() {
    this.lesObservations.clear();
  }

  public boolean retireObs(int idObs) {
    int i = 0;
    boolean found = false;
    while(found = false) {
      if(this.lesObservations.get(i).getIdObs() == idObs) {
        this.lesObservations.remove(i);
        found = true;
      }
      i++;
    }
    return found;
  }

  public String getIdChouette() {
    return idChouette;
  }

  public Sexe getSexe() {
    return sexe;
  }

  public EspeceChouette getEspece() {
    return espece;
  }

  public void setIdChouette(String idChouette) {
    this.idChouette = idChouette;
  }

  public void setSexe(Sexe sexe) {
    this.sexe = sexe;
  }

  public void setEspece(EspeceChouette espece) {
    this.espece = espece;
  }

}