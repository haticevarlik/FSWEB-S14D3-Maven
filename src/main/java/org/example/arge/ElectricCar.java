package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }
    @Override
    public void startEngine() {
        System.out.println(getName() + "'s electric motor is starting.");
    }
    @Override
    public void drive(){
        System.out.println(getName() + " is driving.");
        runEngine();
    }
    @Override
    protected void runEngine() {
        System.out.println(getName() + " is running on battery with " + batterySize + " kWh capacity.");
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
