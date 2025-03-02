package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "'s gas-powered engine is starting.");
    }
    @Override
    public void drive(){
        System.out.println(getName() + " is driving.");
        runEngine();
    }
    @Override
    protected void runEngine() {
        System.out.println(getName() + "'s engine is running with " + cylinders + " cylinders.");
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}

