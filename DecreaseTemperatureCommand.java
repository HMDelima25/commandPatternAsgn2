public class DecreaseTemperatureCommand implements Command {

    private Thermostat thermostat;

    public DecreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}
