
/**
 * Entwickelt einen Iterator für eine ArrayList.
 *
 * @author Tim Gabrikowski
 * @version 06.02.2024
 */
import java.util.ArrayList;
class ArrayListIterator {
    // Exemplarvariablen (ergänzt eigene)
    private ArrayList<?> list;

    // Konstruktor
    public ArrayListIterator(ArrayList<?> aList) {
        list = aList;
        // initialisiere weitere Variablen
    }
    public void start() {
        // Springe zum ersten Element der Liste (Index 0)
    }
    public void next () {
        // springe zum Nächsten Objekt der Liste (wenn schon beim letzten, mache nichts)
    }
    public boolean hasNext() {
        // gibt es noch ein weiteres Element?
        return true; // muss geändert werden!
    }
    public Object getCur() {
        // gebe das Aktuelle Element zurück
        return new Object(); // muss geändert werden!
    }
}
