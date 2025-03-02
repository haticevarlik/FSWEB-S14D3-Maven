package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getName() + "'s hybrid engine is starting.");
    }
    @Override
    public void drive(){
        System.out.println(getName() + " is driving.");
        runEngine();
    }
    @Override
    protected void runEngine() {
        System.out.println(getName() + " is running on hybrid mode with " + cylinders + " cylinders and a " + batterySize + " kWh battery.");
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
