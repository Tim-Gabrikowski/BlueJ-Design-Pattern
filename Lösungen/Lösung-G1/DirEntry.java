import java.util.ArrayList;
/*
 * Eintrag im Dateisystem
 * 
 * @author Tim Gabrikowski 
 * @version 18.-02.2024
 */
public class DirEntry
{
    protected String _name;

    protected ArrayList<DirEntry> _children;

    public DirEntry(String name)
    {
       _name = name;
       _children = new ArrayList<DirEntry>();
    }

    public void addChild(DirEntry entry) {
        _children.add(entry);
    }
    public void print(int lvl)
    {
        String s = "";
        for(int i = 0; i < lvl; i++) {
            s += " ";
        }
        System.out.println(s + _name);

        for(DirEntry c : _children) c.print(lvl + 1);
    }
}
