public class Main {

    public static void main(String[] args) {

        // Create devices
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        Command increaseTemperature =
                new IncreaseTemperatureCommand(thermostat);

        Command decreaseTemperature =
                new DecreaseTemperatureCommand(thermostat);

        Command playMusic =
                new PlayMusicCommand(musicPlayer);

        Command stopMusic =
                new StopMusicCommand(musicPlayer);

        // Create central hub
        SmartHomeHub hub = new SmartHomeHub();

        // Turn light on
        hub.setCommand(lightOn);
        hub.pressButton();

        // Turn light off
        hub.setCommand(lightOff);
        hub.pressButton();

        // Increase temperature
        hub.setCommand(increaseTemperature);
        hub.pressButton();

        // Decrease temperature
        hub.setCommand(decreaseTemperature);
        hub.pressButton();

        // Play music
        hub.setCommand(playMusic);
        hub.pressButton();

        // Stop music
        hub.setCommand(stopMusic);
        hub.pressButton();
    }
}
