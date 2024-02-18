import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Testklasse für den ArrayListIterator
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class Main
{
    // Main-Methode zum Testen der ArrayListKlasse
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Liste mit 100 integern zwischen 0 und 100 füllen
        for(int i = 0; i < 100; i++) {
            list.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        
        ArrayListIterator it = new ArrayListIterator(list);
        
        it.start();
        
        while(it.hasNext()) {
            System.out.println(it.getCur().toString());
            it.next();
        }
    }
}
