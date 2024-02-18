import java.util.ArrayList;
/**
 * Eine Sensorstation, die als Subjekt dienen soll und somit Wetterdaten speichert und verändert
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class SensorStation
{
    private static WeatherData weather;
    
    private ArrayList<Display> observers;
    
    public SensorStation () {
        weather = new WeatherData(25.7f, 52.5f, 15.6f);
        observers = new ArrayList<Display>();
    }

    public void changeWeather(float t, float h, float w) {
        weather = new WeatherData(t, h, w);
        // Notify Observers
        for(Display dp : observers) dp.refresh(weather);
    }
    public void subscribe(Display dp) {
        observers.add(dp);
    }
    public void unsubscribe(Display dp) {
        observers.remove(dp);
    }
}
