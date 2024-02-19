/**
 * Eine Temperaturanzeige
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class HumidityDisplay extends Display
{
    public HumidityDisplay (SensorStation station) {
        super(station);
    }
    public void display() {
        System.out.println("Humidity: " + _weather.getHumidity() + " %");
    }
}
