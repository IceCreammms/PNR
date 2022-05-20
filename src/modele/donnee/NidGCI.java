package src.modele.donnee;

/**
 * Cette classe permet de numériser un protocol d'observation
 * du nid de l'expèce Batracien, cette classe est aussi une 
 * sous-classe de la classe Observation.
 * @author Stévan JEANNE
 */
public class NidGCI implements IObs {

  private int idNid;

  private int nbEnvol;

  private String nomPlage;

  private ArrayList<ObsGCI> lesObservations;

  /**
   *
   */
  public NidGCI(int id, String plage) throws IllegalArgumentException {
    if(id < 0)
      throw new IllegalArgumentException("Erreur src/donnee/NidGCI constructeur : id invalide ");
    
    this.idNid = id;

    this.nbEnvol = 0;

    if(plage == null)
      throw new IllegalArgumentException("Erreur src/donnee/NidGCI constructeur : plage invalide ");

    this.nomPlage = plage;

    this.lesObservations = new ArrayList<ObsGCI>();
  }

  public Date dateDebutObs() {
    
  }

  public Date dateFinObs() {
    
  }

  public int getIdNid() {
    return this.idNid;
  }

  public void setIdNid(int id) {
    if(id < 0)
      System.err.println("Erreur src/donnee/NidGCI setIDNid : id invalide");
    else  
      this.idNid = id;
  }

  public int getNBEnvol() {
    return this.nbEnvol;
  }

  public void setNBEnvol(int envol) {
    if(envol < 0)
      System.err.println("Erreur src/donnee/NidGCI setNBEnvol : envol invalide");
    else  
      this.nbEnvol = envol;
  }

  public String getNomPlage() {
    return this.nomPlage;
  }

  public void setNomPlage(String plage) {
    if(plage == null)
      System.err.println("Erreur src/donnee/NidGCI setNomPlage : plage invalide");
    else  
      this.nomPlage = plage;
  }

  public ArrayList<ObsGCI> getLesObservations() {
    return this.lesObservation;
  }

  public void ajouteUneObs(ObsGCI obs) {
    if(obs == null)
      System.err.println("Erreur src/donnee/NidGCI ajouteUneObs : obs invalide");
    else  
      this.lesObservations.add(obs);
  }

  public void ajoutePisObs(ArrayList<ObsGCI> obs) {
    if(obs == null)
      System.err.println("Erreur src/donnee/NidGCI ajoutePisObs : obs invalide");
    else {

      for(ObsGCI ob : obs) {
        ajouteUneObs(ob);
      }
    }
  }

  public void videObs() {
    this.lesObservations.clear();
  }

  public boolean retireObs(int idObs) {
    
    boolean ret = false;
    int i = 0;
    
    while(i < this.lesObservations.size() && !ret) {
      if(this.lesObservations.get(i).getIdObs() == idObs) {
        this.lesObservations.remove(i)
          ret = true;
      }
    }

    return ret;
  }

  public int nbObs() {
    return this.lesObservations.size();
  }
}