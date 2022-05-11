package src.modele.donnee;

/**
 * Observateur
 * @author Erwan LE ROUX
 */
public class Observateur {

    /**
     * Identifiant de l'observateur.
     */
    private int idObservateur;
    /**
     * Nom de l'observateur.
     */
    private String nom;
    /**
     * Prénom de l'observateur.
     */
    private String prenom;

    /**
     * Constructeur de l'observateur
     * @param id Identifiant de l'observateur.
     * @param leNom Nom de l'observateur.
     * @param lePrenom Prénom de l'observateur.
     */

    public Observateur(int id, String leNom, String lePrenom){

        if(id >= 0 ){

            this.idObservateur = id;

        }else{

            this.idObservateur = -1;                                   //Un identifiant égal à -1 indique un identifiant incorrect.
        }

        if(leNom != null){

            this.nom = leNom;

        }else{

            leNom = "Non Défini";                                       //Un nom "Non Défini" indique un identifiant incorrect.

        }

        if(lePrenom != null){

            this.prenom = lePrenom;                                     //Un prénom "Non Défini" indique un identifiant incorrect.

        }else{

            lePrenom = "Non Défini";

        }

    }

    /**
     * Récupère l'identifiant de l'observateur.
     */
    public int getIdObservateur() {
        return idObservateur;
    }

    /**
     * Récupère le nom de l'observateur.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le prénom de l'observateur.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifie l'identifiant de l'observateur.
     */
    public void setIdObservateur(int idObservateur) {
        if(idObservateur >= 0 ){

            this.idObservateur = idObservateur;

        }
    }

    /**
     * Modifie le nom de l'observateur.
     */
    public void setNom(String nom) {
        if(nom != null){

            this.nom = nom;

        }
    }

    /**
     * Modifie le prénom de l'observateur.
     */
    public void setPrenom(String prenom) {
        if(prenom != null){

            this.prenom = prenom;

        }
    }
    
}