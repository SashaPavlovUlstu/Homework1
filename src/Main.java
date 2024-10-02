//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model S", 2022);
        car.displayInfo();
        car.chargeBattery(-10);
        car.chargeBattery(20);
        car.displayInfo();

        Truck truck = new Truck("Ford", "F-150", 2020);
        truck.displayInfo();
        truck.engageFourWheelDrive();
        truck.displayInfo();

        System.out.println("Общее количество транспортных средств: " + Vehicle.getVehicleCount());
    }
}