
/**
 * Beschreiben Sie hier die Klasse Tischgruppe.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tischgruppe 
{
    Stuhl s1;
    Stuhl s2;
    Stuhl s3;
    Stuhl s4;
    Tisch t1;
    
    public Tischgruppe()
    {
    s1 = new Stuhl();
    s1.zeige();
    s1.bewegeHorizontal(100);
    s1.bewegeVertikal(80);
    s1.dreheAuf(180);
    
    s2 = new Stuhl();
    s2.zeige();
    s2.bewegeHorizontal(100);
    s2.bewegeVertikal(-80);
    s2.dreheAuf(0);
    
    s3 = new Stuhl();
    s3.zeige();
    s3.bewegeHorizontal(200);
    s3.dreheAuf(90);
   
    s4 = new Stuhl();
    s4.zeige();
    
    t1=new Tisch();
    t1.zeige();
    }


}
