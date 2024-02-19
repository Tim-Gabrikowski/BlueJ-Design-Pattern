
/**
 * Beschreiben Sie hier die Klasse LokaleTransformation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class LokaleTransformation extends Transformation
{
    protected Transformation _parent;

    /**
     * Konstruktor für Objekte der Klasse LokaleTransformation
     */
    public LokaleTransformation(int x, int y, Transformation p)
    {
        super(x, y);
        _parent = p;
    }

    public int getGlobalX() {
        return _x + _parent.getX();
    }
    public int getGlobalY() {
        return _y + _parent.getY();
    }
}
