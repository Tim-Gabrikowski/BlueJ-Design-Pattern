import java.awt.Shape;
import java.awt.geom.GeneralPath;

/**
 * Eine Schrankwand, die manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 */
public class Schrankwand extends Moebel
{
  private Moebel[] schraenke;
  private int anzahl;

  /**
   * Erzeuge eine neue Schrankwand mit einer Standardfarbe und Standardgroesse
   * an einer Standardposition.
   * Der Konstruktor muss die Zahl der Schränke übergeben bekommen.
   */
    public Schrankwand(int anzahl)
  {
    xPosition = 20;
    yPosition = 20;
    farbe = "schwarz";
    orientierung = 0;
    istSichtbar = false;
    int schrankbreite = 60;
    this.anzahl = anzahl;
    breite = schrankbreite*anzahl;
    tiefe  = 37;
    schraenke = new Moebel[anzahl];
    for (int i=0;i<anzahl;i++){
        schraenke[i] = new Schrank(i*schrankbreite, 0, farbe, orientierung, schrankbreite, tiefe);
    }
  }
  
  /**
   * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
   */
  protected Shape gibAktuelleFigur()
  {
      GeneralPath schrankwand = new GeneralPath();
      for (int i=0;i<anzahl;i++){
        schrankwand.append(schraenke[i].gibAktuelleFigur(), false);
      }
      return  transformiere(schrankwand);
  }
  
}
