package src.modele.donnee;
import java.sql.*;
import java.util.ArrayList;

/**
 * Cette classe permet de numériser un protocol d'observation de 
 * l'espèce Loutre, cette classe est aussi une sous-classe de 
 * la classe Observation.
 * @author Erwan LE ROUX
 */
public class ObsLoutre extends Observation{
    
    /**
     * Indice de la loutre.
     */
    private IndiceLoutre indice;

    /**
     * Constructeur de ObsLoutre appelle le constructeur de Observation.
     * 
     * @param id L'identifiant de la loutre.
     * @param date La date de l'observation.
     * @param heure L'heure de l'observation.
     * @param lieu Le lieu de l'observation.
     * @param observateurs La liste des observateurs.
     * @param lIndiceLoutre L'indice de la loutre.
     * @throws IllegalArgumentException Si un argument donne n'est pas correct.
     */
    public ObsLoutre(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, IndiceLoutre lIndiceLoutre) throws IllegalArgumentException{

        super(id, date, heure, lieu, observateurs);

        if(lIndiceLoutre != null){

            this.indice = lIndiceLoutre;
            
        }else{

            throw new IllegalArgumentException("Err - src/modele/donnee/ObsLoutre - L'indice de la loutre doit être fourni.");

        }

    }

    /**
     * Retourne l'espece que l'on observe, ici Loutre
     * @return L'espece LOUTRE
     */
    public EspeceObserve especeObs(){

        return EspeceObserve.LOUTRE;

    }
    
}