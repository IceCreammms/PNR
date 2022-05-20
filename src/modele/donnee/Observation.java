package src.modele.donnee;

import java.sql.*;
import java.util.ArrayList;

import src.modele.exceptions.ObservationException;


/**
 * Observation
 * @author Tanguy Sergent
 */
public abstract class Observation {

    /**
     * Identifiant de l'observation
     */
    protected int idObs;

    /**
     * Date de l'observation
     */
    protected java.sql.Date dateObs;

    /**
     * Heure de l'observation
     */
    protected java.sql.Time heureObs;

    /**
     * Lieu de l'observation
     */
    protected Lieu lieuObs;

    /**
     * ArrayList des observateurs
     */
    protected ArrayList<Observateur> lesObservateurs;
    

    /**
     * Constructeur d'une observation
     * @param id identifiant de l'obs
     * @param date date de l'obs
     * @param heure heure de l'obs
     * @param lieu lieu de l'obs
     * @param observateurs ArrayList des observateurs
     */
    public Observation(int id, java.sql.Date date, java.sql.Time heure, Lieu lieu, ArrayList<Observateur> observateurs) {
        if(id >= 0 ){

            this.idObs = id;

        }else{

            this.idObs = -1;
        }

        try{
            if(date == null) {
                throw new IllegalArgumentException();
            } else {
                this.dateObs = date;
            }
        } catch(IllegalArgumentException e) {
            System.err.println("Err - Date null");
        }

        try{
            if(heure == null) {
                throw new IllegalArgumentException();
            } else {
                this.heureObs = heure;
            }
        } catch(IllegalArgumentException e) {
            System.err.println("Err - Heure null");
        }
        
        try{
            if(lieu == null) {
                throw new IllegalArgumentException();
            } else {
                this.lieuObs = lieu;
            }
        } catch(IllegalArgumentException e) {
            System.err.println("Err - Lieu null");
        }

        this.lesObservateurs = new ArrayList<Observateur>();

    }

    /**
     * Ajoute un observateur a la liste des observateurs
     * @param o l'observateur a ajouter
     */
    public void ajouteObservateur(Observateur o) {
        this.lesObservateurs.add(o);
    }

    /**
     * permet de retirer un observateur de la liste des observateurs
     * @param o l'observateur a retirer de la liste
     */
    public void retireObservateur(Observateur o) {
        this.lesObservateurs.remove(o);
    }

    /**
     * Retourne l'espece que l'on observe
     * @return L'espece observé
     */
    public abstract EspeceObserve especeObs();
    
    /**
     * retourne l'identifiant de l'observation
     * @return l'identifiant de l'observation
     */
    public int getIdObs() {
        return idObs;
    }

    /**
     * permet de définir l'identifiant de l'observation
     * @param idObs le nouvel identifiant de l'observation
     */
    public void setIdObs(int idObs) {
        this.idObs = idObs;
    }

    /**
     * retourne la date de l'observation
     * @return la date de l'observation
     */
    public java.sql.Date getDateObs() {
        return dateObs;
    }

    /**
     * permet de définir une nouvelle date pour l'observation
     * @param dateObs la nouvelle date de l'observation
     */
    public void setDateObs(java.sql.Date dateObs) {
        this.dateObs = dateObs;
    }

     /**
     * retourne l'heure de l'observation
     * @return l'heure de l'observation
     */
    public java.sql.Time getHeureObs() {
        return heureObs;
    }

    /**
     * permet de définir une nouvelle heure pour l'observation
     * @param heureObs la nouvelle heure de l'observation
     */
    public void setHeureObs(java.sql.Time heureObs) {
        this.heureObs = heureObs;
    }
    
     /**
     * retourne la liste des observateurs
     * @return la liste des observateurs
     */
    public ArrayList<Observateur> getLesObservateurs() {
        return lesObservateurs;
    }

    /**
     * Permet de définir une nouvelle liste d'observateurs
     * @param lesObservateurs L'arrayList a définir comme nouvelle liste d'observateurs
     */
    public void setLesObservateurs(ArrayList<Observateur> lesObservateurs) {
        this.lesObservateurs = lesObservateurs;
    }

    /**
     * retourne le lieu de l'observation
     * @return le lieu de l'observation
     */
    public Lieu getLieuObs() {
        return lieuObs;
    }

    /**
     * Permet de définir un nouveau lieu pour l'observation
     * @param lieuObs le nouveau lieu de l'observation
     */
    public void setLieuObs(Lieu lieuObs) {
        this.lieuObs = lieuObs;
    }

}
