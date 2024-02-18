
/**
 * Grundlage für eine Anzeige
 * 
 * @author Tim Gabrikowski
 * @version 18.02.2024
 */
public abstract class Display
{
    protected WeatherData _weather;
    private SensorStation _station;
    
    public Display(SensorStation station)
    {
        _station = station;
    }
    
    public abstract void display();
}
