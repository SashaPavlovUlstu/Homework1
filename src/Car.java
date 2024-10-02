public class Car extends Vehicle implements Electric {
    private int batteryLevel;

    public Car(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryLevel = 100;
    }

    @Override
    public void chargeBattery(int percentage) {
        if (percentage < 0) {
            System.out.println("Некорректный уровень заряда.");
            return;
        }
        batteryLevel += percentage;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Батарея заряжена до " + batteryLevel + "%.");
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Модель автомобиля: " + brand + " " + model + ", год выпуска: " + year + ", уровень заряда: " + batteryLevel + "%.");
    }
}
