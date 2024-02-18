import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;


/**
 * Abstrakte Klasse Moebel
 * @author Claus Albowski
 * @version  2.1 (aug'06)
 */

public abstract class Moebel
{
  protected int xPosition;
  protected int yPosition;
  protected int orientierung;
  protected String farbe;
  protected boolean istSichtbar;
  protected int breite;
  protected int tiefe;


  /**
   * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
   */
  protected abstract Shape gibAktuelleFigur();
  
  /**
   * Transformiert das Shape, so dass es die richtige Position
   * und Orientierung einnimmt.
   */
  protected Shape transformiere(Shape shape)
  {
      AffineTransform t = new AffineTransform();
      t.translate(xPosition, yPosition);
      Rectangle2D umriss = shape.getBounds2D();
      t.rotate(Math.toRadians(orientierung),
               umriss.getX()+umriss.getWidth()/2,
               umriss.getY()+umriss.getHeight()/2);
      return  t.createTransformedShape(shape);
  }

  /**
   * Mache dieses Objekt sichtbar. Wenn es bereits sichtbar ist, tue
   * nichts.
   */
  public void zeige()
  {
    istSichtbar = true;
    zeichne();
  }

  /**
   * Mache dieses Objekt unsichtbar. Wenn es bereits unsichtbar ist, tue
   * nichts.
   */
  public void verberge()
  {
    loesche();
    istSichtbar = false;
  }

  /**
   * Drehe auf den angegebenen Winkel
   */
  public void dreheAuf(int neuerWinkel)
  {
     loesche();
     orientierung = neuerWinkel;
     zeichne();
  }

  /**
   * Bewege dieses Objekt horizontal um 'entfernung' Bildschirmpunkte.
   */
  public void bewegeHorizontal(int entfernung)
  {
    loesche();
    xPosition += entfernung;
    zeichne();
  }

  /**
   * Bewege dieses objekt vertikal um 'entfernung' Bildschirmpunkte.
   */
  public void bewegeVertikal(int entfernung)
  {
    loesche();
    yPosition += entfernung;
    zeichne();
  }
 
  /**
   * Aendere die Farbe dieses Objektes in 'neueFarbe'.
   * Gueltige Angaben sind "rot", "gelb", "blau", "gruen",
   * "lila" und "schwarz".
   */
  public void aendereFarbe(String neueFarbe)
  {
    farbe = neueFarbe;
    zeichne();
  }

  /**
   * Zeichne dieses Objekt mit seinen aktuellen Werten auf den Bildschirm.
   */
  private void zeichne()
  {
    if (istSichtbar)
    {
      Shape figur = gibAktuelleFigur();
      Leinwand leinwand = Leinwand.gibLeinwand();
      leinwand.zeichne (
        this,           // leinwand kennt das Objekt
        farbe,          // definiert seine Zeichenfarbe
        figur);         // definiert seinen grafischen Aspekt
      leinwand.warte(10);
    }
  }

  /**
   * Loesche dieses Objekt vom Bildschirm.
   */
  private void loesche()
  {
    if (istSichtbar)
    {
      Leinwand leinwand = Leinwand.gibLeinwand();
      leinwand.entferne(this);
    }
  }
}
