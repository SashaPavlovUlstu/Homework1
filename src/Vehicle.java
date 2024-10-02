public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    private static int vehicleCount = 0;


    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        vehicleCount++;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }


    public abstract void displayInfo();
}