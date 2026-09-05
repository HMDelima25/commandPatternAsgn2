public class Thermostat {

  private double temperature;

  public Thermostat() {
    temperature = 22.0;

  public void increaseTemperature() {
    temperature += 1.0;
    System.out.println("Temperature is increased to " + temperature + "C");

  }

  public void decreaseTemperature() {
    temperature -= 1.0;
    System.out.println("Temperature decreased to " + temperature + "C");
  }
}
