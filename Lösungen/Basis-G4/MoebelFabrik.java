
/**
 * Beschreiben Sie hier die Klasse MoebelFabrik.
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class MoebelFabrik
{
    public MoebelFabrik() {
        
    }

    public static Stuhl baueStuhl() {
        return new Stuhl();
    }
    public static Tisch baueTisch() {
        return new Tisch();
    }
    public static Tischgruppe baueTischgruppe() {
        return new Tischgruppe();
    }
    public static Schrank baueSchrank() {
        return new Schrank();
    }
    public static Schrankwand baueSchrankwand(int anz) {
        return new Schrankwand(anz);
    }
}
