
/**
 * Beschreiben Sie hier die Klasse GlobaleTransformation.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GlobaleTransformation extends Transformation
{
    /**
     * Konstruktor für Objekte der Klasse LokaleTransformation
     */
    public GlobaleTransformation(int x, int y)
    {
        super(x, y);
    }

    public static GlobaleTransformation fromLocalTransform(LokaleTransformation t) {
        return new GlobaleTransformation(t.getGlobalX(), t.getGlobalY());
    }
}
