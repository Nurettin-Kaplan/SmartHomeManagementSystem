public class SecuritySystem extends Appliance {
    private boolean alarm = false;
    private boolean camerasAreOn = false;

    public SecuritySystem(){
        super.turnOn();
    }
    public void setAlarm(){
        this.alarm = true;
        System.out.println("The alarm has been set.");
    }
    public void CancelAlarm(){
        this.alarm = false;
        System.out.println("The alarm was canceled.");
    }
    public void TurnOnCameras(){
        this.camerasAreOn = true;
        System.out.println("The cameras are on.");
    }
    public void TurnOffCameras(){
        this.camerasAreOn = false;
        System.out.println("The cameras are off.");
    }
    public boolean areOnCameras(){
        return camerasAreOn;
    }
    public boolean isOnAlarm(){
        return alarm;
    }
}
