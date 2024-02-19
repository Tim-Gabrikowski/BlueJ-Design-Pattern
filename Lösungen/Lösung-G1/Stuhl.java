import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;


/**
 * Ein Stuhl, der manipuliert werden kann und sich selbst auf einer Leinwand zeichnet.
 * 
 * @author Claus Albowski
 * @version 2.3  (sept 07)
 */
public class Stuhl extends Moebel
{

    /**
     * Erzeuge einen neuen Stuhl mit einer Standardfarbe und Standardgroesse
     * an einer Standardposition. (Standardkonstruktor)
     */
    public Stuhl() {
        xPosition = 60;
        yPosition = 80;
        farbe = "blau";
        orientierung = 270;
        istSichtbar = false;
        breite = 40;
        tiefe  = 40;
    }
    
    /**
     * Erzeuge einen neuen Stuhl mit einer Standardgroesse.
     */
    public Stuhl(int xPosition,
                int yPosition,
                String farbe,
                int orientierung) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.farbe = farbe;
        this.orientierung = orientierung;
        istSichtbar = false;
        breite = 40;
        tiefe  = 40;
    }
    
    /**
     * Berechnet das zu zeichnende Shape anhand der gegebenen Daten
     * [ Zum Anzeigen der Attributwerte über Inspect muss hier die Sichtbarkeit 
     *  auf public gesetzt werden. ]
     */
    protected Shape gibAktuelleFigur() {
        // einen GeneralPath definieren
        GeneralPath stuhl = new GeneralPath();
        stuhl.moveTo(0 , 0);
        stuhl.lineTo(breite, 0);
        stuhl.lineTo(breite+(breite/20+1), tiefe);
        stuhl.lineTo(-(breite/20+1), tiefe);
        stuhl.lineTo(0 , 0);
        // Das ist die Umrandung. Das Stuhl bekommt noch eine Lehne:
        stuhl.moveTo(0 , (breite/10+1));
        stuhl.lineTo(breite, (breite/10+1));    
        return transformiere(stuhl);
    }
    
}
