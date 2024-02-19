
/**
 * Wetterdaten Container
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class WeatherData {
    private float temperature;
    private float humidity;
    private float windspeed;

    public WeatherData (float tmp, float hum, float wsp) {
        temperature = tmp;
        humidity = hum;
        windspeed = wsp;
    }
    float getTemperature () {
        return temperature;
    }
    float getHumidity () {
        return humidity;
    }
    float getWindspeed () {
        return windspeed;
    }
}
