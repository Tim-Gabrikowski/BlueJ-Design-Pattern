import java.util.ArrayList;
/**
 * Eine Sensorstation, die als Subjekt dienen soll und somit Wetterdaten speichert und ver�ndert
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class SensorStation
{
    private static WeatherData _weather;
    
    private ArrayList<Display> observers;
    
    public SensorStation () {
        _weather = new WeatherData(25.7f, 52.5f, 15.6f);
        observers = new ArrayList<Display>();
    }

    public void changeWeather(float t, float h, float w) {
        _weather = new WeatherData(t, h, w);
        // Notify Observers
        for(Display dp : observers) dp.refresh(_weather);
    }
    public WeatherData getWeather(){
        return _weather;
    }
    public void subscribe(Display dp) {
        observers.add(dp);
    }
    public void unsubscribe(Display dp) {
        observers.remove(dp);
    }
}
