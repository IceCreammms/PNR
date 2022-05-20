package src.modele.donnee;

/**
 * Lieu
 * 
 * @author Tanguy Sergent
 */
public class Lieu {

  /**
   * Coordonné X
   */
  private Double xCoord;

  /**
   * Coordonné Y
   */
  private Double yCoord;

  /**
   * Constructeur du Lieu
   * 
   * @param x coordonné X du lieu
   * @param y coordonné Y du lieu
   */
  public Lieu(double x, double y) throws NullPointerException {
    this.xCoord = x;
    this.yCoord = y;
  }

  /**
   * Permet de recuperer la valeur du coordonné X
   * 
   * @return xCoord
   */
  public Double getX() {
    return this.xCoord;
  }

  /**
   * Permet de recuperer la valeur du coordonné Y
   * 
   * @return yCoord
   */
  public Double getY() {
    return this.yCoord;
  }

  /**
   * Permet de changer la valeur du coordonné X
   * 
   * @param x nouvelle valeur de X
   */
  public void setX(Double x) {
    this.xCoord = x;
  }

  /**
   * Permet de changer la valeur du coordonné Y
   * 
   * @param x nouvelle valeur de Y
   */
  public void setY(Double y) {
    this.yCoord = y;
  }

}
