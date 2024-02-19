/**
 * Eine Temperaturanzeige
 * 
 * @author Tim Gabrikowski 
 * @version 18.02.2024
 */
public class WindspeedDisplay extends Display
{
    public WindspeedDisplay (SensorStation station) {
        super(station);
    }
    public void display() {
        System.out.println("Windspeed: " + _weather.getWindspeed() + " km/h");
    }
}