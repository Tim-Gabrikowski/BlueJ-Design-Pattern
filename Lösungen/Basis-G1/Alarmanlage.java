
/**
 * Beschreiben Sie hier die Klasse Alarmanlage.
 * 
 * @author Tim Gabrikowski
 * @version 18.02.2024
 */
public class Alarmanlage
{
    private static Alarmanlage _instance;

    private boolean armed;

    public static Alarmanlage getInstance() {
        if(_instance == null) _instance = new Alarmanlage();
        return _instance;
    }

    private Alarmanlage()
    {
        armed = false;
    }
    public void arm() {
        armed = true;
    }
    public void dearm() {
        armed = false;
    } 
}
