import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
 * Ein Tisch, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author Claus Albowski
 * @version 2.3  (sept 07)
 */
public class Tisch extends Moebel
{
    
    /**
     * Erzeuge einen neuen Tisch mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Tisch()  {
        xPosition = 120;
        yPosition = 50;
        orientierung = 0;
        farbe = "rot";
        istSichtbar = false;
        breite = 120;
        tiefe  = 100;
    }
    
    /**
     * Erzeuge einen neuen Tisch.
     */
    public Tisch(int xPosition,
                int yPosition,
                String farbe,
                int orientierung,
                int breite,
                int tiefe) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.farbe = farbe;
        this.orientierung = orientierung;
        istSichtbar = false;
        this.breite = breite;
        this.tiefe  = tiefe;
    }
    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     * [ Zum Anzeigen der Attributwerte über Inspect muss hier die Sichtbarkeit 
     *  auf public gesetzt werden. ]
     */
    protected Shape gibAktuelleFigur()
    {
        Shape tisch = new Ellipse2D.Double(0 , 0, breite, tiefe);
        return transformiere(tisch);
    }
}
