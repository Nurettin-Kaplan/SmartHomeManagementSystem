public class Thermostat extends Appliance{
    private double temperature = 23;
    public Thermostat(){
        super.turnOn();
    }
    public void setTemperature(double temperature){
        if(temperature >= 18 && temperature <= 29){
            this.temperature = temperature;
        }
        else {
            System.out.println("Please enter a valid temperature in degrees Celsius (°C). The default temperature has been set to 23°C.");
        }
    }
    public double getTemperature(){
        return this.temperature;
    }
}
