public class Truck extends Vehicle implements OffRoad {
    private boolean fourWheelDrive;

    public Truck(String brand, String model, int year) {
        super(brand, model, year);
        this.fourWheelDrive = false;
    }

    @Override
    public void engageFourWheelDrive() {
        fourWheelDrive = true;
        System.out.println("Включен полный привод.");
    }

    @Override
    public void displayInfo() {
        String driveType = fourWheelDrive ? "4WD" : "2WD";
        System.out.println("Модель грузовика: " + brand + " " + model + ", год выпуска: " + year + ", тип привода: " + driveType + ".");
    }
}