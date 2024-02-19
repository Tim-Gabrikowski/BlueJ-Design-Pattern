
/**
 * Beschreiben Sie hier die Klasse Transformation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Transformation
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    protected int _x, _y;

    /**
     * Konstruktor für Objekte der Klasse Transformation
     */
    public Transformation(int x, int y)
    {
        // Instanzvariable initialisieren
        _x = x;
        _y = y;
    }
    public int getX() {
        return _x;
    }
    public int getY() {
        return _y;
    }
}
