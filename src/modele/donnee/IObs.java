import java.util.ArrayList;

public interface IObs {

    public void ajouteUneObs(T obs);
    public void ajoutePlsObs(ArrayList<T> obs);
    public void videObs();
    public boolean retireObs(int idObs);
    public int nbObs();
    
}