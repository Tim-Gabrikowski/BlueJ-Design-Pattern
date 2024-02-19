/**
 * Eine Temperaturanzeige
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class TemperatureDisplay extends Display
{    
    public TemperatureDisplay (SensorStation station) {
        super(station);
    }
    public void display() {
        System.out.println("Temperature: " + _weather.getTemperature() + " C");
    }
}
