
/**
 * Entwickelt einen Iterator f�r eine ArrayList.
 *
 * @author Tim Gabrikowski
 * @version 06.02.2024
 */
import java.util.ArrayList;
class ArrayListIterator {
    // Exemplarvariablen (erg�nzt eigene)
    private ArrayList<?> list;
    
    private int _cursor;

    // Konstruktor
    public ArrayListIterator(ArrayList<?> aList) {
        list = aList;
        _cursor = 0;
        // initialisiere weitere Variablen
    }
    public void start() {
        // Springe zum ersten Element der Liste (Index 0)
        _cursor = 0;
    }
    public void next () {
        // springe zum N�chsten Objekt der Liste (wenn schon beim letzten, mache nichts)
        if(hasNext()) _cursor++;
    }
    public boolean hasNext() {
        // gibt es noch ein weiteres Element?
        return (_cursor + 1) < list.size(); // muss ge�ndert werden!
    }
    public Object getCur() {
        // gebe das Aktuelle Element zur�ck
        return list.get(_cursor); // muss ge�ndert werden!
    }
}
