import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;


/**
 * Ein Schrank, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author Java-MS Groupies
 * hier claus albowski
 * Michael K�lling und David J. Barnes und Axel Schmolitzky
 * @version 1.2  (25.02.04)
 */
public class Schrank extends Moebel
{

  /**
   * Erzeuge einen neuen Schrank.
   */
    public Schrank()
  {
    xPosition = 60;
    yPosition = 80;
    farbe = "rot";
    orientierung = 0;
    istSichtbar = false;
    breite = 100;
    tiefe  = 60;
  }
    public Schrank(int x, int y, String f, int o, int b, int t)
  {
    xPosition = x;
    yPosition = y;
    farbe = f;
    orientierung = o;
    istSichtbar = false;
    breite = b;
    tiefe  = t;
  }
  
  /**
   * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
   */
  protected Shape gibAktuelleFigur()
  {
      GeneralPath schrank = new GeneralPath();
      Shape rahmen = new Rectangle2D.Double(0, 0, breite, tiefe);
      Shape linie1 = new Line2D.Double(0, 0, breite, tiefe);
      Shape linie2 = new Line2D.Double(breite, 0, 0, tiefe);
      schrank.append(rahmen, false);
      schrank.append(linie1, false);
      schrank.append(linie2, false);
      
      return  transformiere(schrank);
  }
  
}
