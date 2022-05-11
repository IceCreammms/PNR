package src.modele.donnee;
import java.sql.*;
import java.util.ArrayList;

/**
 * ObsLoutre
 */
public class ObsLoutre extends Observation{
    

    private IndiceLoutre indice;

    public ObsLoutre(int id, Date date, Time heure, Lieu lieu, ArrayList<Observateur> observateurs, IndiceLoutre lIndiceLoutre) throws IllegalArgumentException{

        super(id, date, heure, lieu, observateurs);

        if(lIndiceLoutre != null){

            this.indice = lIndiceLoutre;
            
        }else{

            throw new IllegalArgumentException("Err - src/modele/donnee/ObsLoutre - L'indice de la loutre doit être fourni.");

        }

    }

    public EspeceObserve especeObs(){

        return EspeceObserve.LOUTRE;

    }
    
}