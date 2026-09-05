public class Light {

    private int brightness;
    public Light() {
        brightness = 0;
    }

    public void turnOn() {
        brightness = 100;
        System.out.println("Light is ON. Brightness is at " + brightness + "%");
    }

    public void turnOff() {
        brightness = 0;
        System.out.println("Light is OFF.");
    }

    public void setBrightness(int Brightness) {
        this.brightness = brightness;
        System.out.println("Light brightness is set to " + brightness + "%");
    }
}
    
