package src.modele.donnee;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Cette classe permet de numériser un protocol d'observation de l'espèce
 * Hippocampe, cette classe est aussi une sous-classe de la classe Observation.
 * 
 * @author Stévan JEANNE
 */
public class ObsHippocampe extends Observation {

  /**
   * La taille de l'hippocampe
   */
  private double taille;

  /**
   * Si le spécimen est en gestation
   */
  private boolean estGestant;

  /**
   * Le type de peche utilisé pour recueillir le spécimen
   */
  private Peche typePeche;

  /**
   * L'espèced du spécimen
   */
  private EspeceHippocampe espece;

  /**
   * Le sexe de l'hippocampe
   */
  private Sexe sexe;

  /**
   *
   */
  public ObsHippocampe(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, double laTaille,
      Peche leTypePeche, EspeceHippocampe lEspece, Sexe leSexe) throws IllegalArgumentException {
    super(id, date, heure, lieu, observateurs);

    this.estGestant = false;

    if (laTaille <= 0.0)
      throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : laTaille invalide ");

    this.taille = laTaille;

    if (leTypePeche == null)
      throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : leTypePeche invalide ");

    this.typePeche = leTypePeche;

    if (lEspece == null)
      throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : lEspece invalide ");

    this.espece = lEspece;

    if (leSexe == null)
      throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe constructeur : leSexe invalide ");

    this.sexe = leSexe;

  }

  /**
   * 
   */
  public EspeceObserve especeObs() {
    return EspeceObserve.HPPOCAMPE;
  }

  public double getTaille() {
    return this.taille;
  }

  public void setTaille(double laTaille) throws IllegalArgumentException {

    if (laTaille <= 0.0)
      throw new IllegalArgumentException("Erreur src/donnee/ObsHippocampe setTaille : laTaille invalide ");

    this.taille = laTaille;
  }

  public boolean getEstGestant() {
    return this.estGestant;
  }

  public void setEstGestant(boolean gestant) {
    if (this.sexe == Sexe.MALE)
      System.err.println("Erreur src/donnee/ObsHippocampe setEstGestant : gestant invalide ");
    else if(this.sexe == Sexe.INCONNU)

    else
      this.estGestant = gestant;
  }

  public Peche getTypePeche() {
    return this.typePeche;
  }

  public void setTypePeche(Peche leTypePeche) {

    if (leTypePeche == null)
      System.err.println("Erreur src/donnee/ObsHippocampe setTypePeche : leTypePeche invalide ");

    this.typePeche = leTypePeche;
  }

  public EspeceHippocampe getEspece() {
    return this.espece;
  }

  public void setEspece(EspeceHippocampe lEspece) {

    if (lEspece == null)
      System.err.println("Erreur src/donnee/ObsHippocampe setEspece : lEspece invalide ");

    this.espece = lEspece;
  }

  public Sexe getSexe() {
    return this.sexe;
  }

  public void setSexe(Sexe leSexe) {

    if (leSexe == null)
      System.err.println("Erreur src/donnee/ObsHippocampe setSexe : leSexe invalide ");

    this.sexe = leSexe;
  }
}