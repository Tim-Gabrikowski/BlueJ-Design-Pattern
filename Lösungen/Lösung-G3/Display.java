
/**
 * Grundlage f�r eine Anzeige
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
        _station.subscribe(this);
        _weather = _station.getWeather();
    }
    
    public abstract void display();
    
    public void refresh(WeatherData weather) {
        _weather = weather;
        display();
    }
}
