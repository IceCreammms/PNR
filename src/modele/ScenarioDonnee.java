package src.modele;

import src.modele.donnee.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class ScenarioDonnee {

  public static void testChouette() {
    boolean passed = true;
    try {
      Chouette ch = new Chouette("01",Sexe.MALE, EspeceChouette.EFFRAIE );
    } catch (Exception e) {
      passed = false;
    } finally {
      if (passed) {
        System.out.println("TestChouette ✅");
      } else {
        System.out.println("TestChouette ❌");
      }
    }
  }

  public static void testLieu() {
    boolean passed = true;
    try {
      Double nul = null;
      Lieu testLieu = new Lieu(7.2, 6.4);

      Lieu ErrLieu = new Lieu(nul, 5.0);
    } catch (Exception e) {
       if(!(e instanceof NullPointerException)) {
         passed = false;
       }
    } finally {
      if (passed) {
        System.out.println("TestLieu ✅");
      } else {
        System.out.println("TestLieu ❌");
      }
    }
  }

  public static void testNidGCI() {
   //TODO
  }

  public static void testObsBatracien() {
    boolean passed = true;
    try {
      Date date = new Date(2021, 10, 10);
      Time hour = new Time(20, 45, 0);
      Lieu lieu = new Lieu(3.14, 1.592);
      Observateur obs1 = new Observateur(1, "Rochefort", "Gudule");
      Observateur obs2 = new Observateur(2, "de Richbourg", "Karl");

      ArrayList<Observateur> observateurs = new ArrayList<>();
      observateurs.add(obs1);
      observateurs.add(obs2);

      int[] resObs = new int[4];

      ObsBatracien testBatracien = new ObsBatracien(4, date, hour, lieu, observateurs, resObs, EspeceBatracien.PELODYTE);
    } catch (Exception e) {
      passed = false;
    } finally {
      if (passed) {
        System.out.println("testObsBatracien ✅");
      } else {
        System.out.println("testObsBatracien ❌");
      }
    }
  }

  public static void testObsChouette() {
    
    boolean passed = true;
      try {
        Date date = new Date(2021, 10, 10);
        Time hour = new Time(20, 45, 0);
        Lieu lieu = new Lieu(3.14, 1.592);
        Observateur obs1 = new Observateur(1, "Rochefort", "Gudule");
        Observateur obs2 = new Observateur(2, "de Richbourg", "Karl");
  
        ArrayList<Observateur> observateurs = new ArrayList<>();
        observateurs.add(obs1);
        observateurs.add(obs2);
  
        ObsChouette testObsChouette = new ObsChouette(4, date, hour, lieu, observateurs, TypeObservation.SONORE_VISUELLE);
      } catch (Exception e) {
        passed = false;
      } finally {
        if (passed) {
          System.out.println("testObsChouette ✅");
        } else {
          System.out.println("testObsChouette ❌");
        }
      }
  }

  public static void testObservateur() {

    boolean passed = true;
    try {
      Observateur obsr = new Observateur(1, "Rochefort", "Gudule" );
    } catch (Exception e) {
      passed = false;
    } finally {
      if (passed) {
        System.out.println("TestObservateur ✅");
      } else {
        System.out.println("TestObservateur ❌");
      }
    }
    
  }

  public static void testObservation() {
    // TODO
  }

  public static void testObsGCI() {
    boolean passed = true;
      try {
        Date date = new Date(2021, 10, 10);
        Time hour = new Time(20, 45, 0);
        Lieu lieu = new Lieu(3.14, 1.592);
        Observateur obs1 = new Observateur(1, "Rochefort", "Gudule");
        Observateur obs2 = new Observateur(2, "de Richbourg", "Karl");
  
        ArrayList<Observateur> observateurs = new ArrayList<>();
        observateurs.add(obs1);
        observateurs.add(obs2);
  
        ObsGCI testObsGCI = new ObsGCI(4, date, hour, lieu, observateurs, ContenuNid.OEUF, 2);
      } catch (Exception e) {
        passed = false;
      } finally {
        if (passed) {
          System.out.println("testObsGCI ✅");
        } else {
          System.out.println("testObsGCI ❌");
        }
      }
  }

  public static void testObsHippocampe() {
    // TODO
  }

  public static void testObsLoutre() {
    
    boolean passed = true;
        try {
          Double nul = null;
          Date date = new Date(2021, 10, 10);
          Time hour = new Time(20, 45, 0);
          Lieu lieu = new Lieu(3.14, 1.592);
          Observateur obs1 = new Observateur(1, "Rochefort", "Gudule");
          Observateur obs2 = new Observateur(2, "de Richbourg", "Karl");

          ArrayList<Observateur> observateurs = new ArrayList<>();
          observateurs.add(obs1);
          observateurs.add(obs2);

          ObsLoutre testObsLoutre = new ObsLoutre(1, date, hour, lieu, observateurs, IndiceLoutre.POSITIF);
          ObsLoutre testObsLoutreErr = new ObsLoutre(1, date, hour, null, observateurs, IndiceLoutre.POSITIF);
        } catch (Exception e) {
          if(!(e instanceof NullPointerException) || !(e instanceof IllegalArgumentException)) {
            passed = false;
          }
        } finally {
          if (passed) {
            System.out.println("TestObsLoutre ✅");
          } else {
            System.out.println("TestObsLoutre ❌");
          }
      }
  }

 

  public static void main(String[] args) {
    testChouette();

    testLieu();

    testNidGCI();

    testObsBatracien();

    testObsChouette();

    testObservateur();

    testObservation();

    testObsGCI();

    testObsHippocampe();

    testObsLoutre();
  }
}
