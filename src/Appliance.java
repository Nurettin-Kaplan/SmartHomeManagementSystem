
public class Appliance implements Controllable{

    private boolean status = false;

    @Override
    public void turnOn() {
        System.out.println("The device is on.");
        this.status = true;
    }

    @Override
    public void turnOff() {
        System.out.println("The device is off.");
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }
}
