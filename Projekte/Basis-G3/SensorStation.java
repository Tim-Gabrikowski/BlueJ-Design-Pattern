
/**
 * Eine Sensorstation, die als Subjekt dienen soll und somit Wetterdaten speichert und verändert
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class SensorStation
{
    private static WeatherData weather;
    
    public SensorStation () {
        weather = new WeatherData(25.7f, 52.5f, 15.6f);
    }

    public void changeWeather(float t, float h, float w) {
        weather = new WeatherData(t, h, w);
        // Notify Observers
    }
}
