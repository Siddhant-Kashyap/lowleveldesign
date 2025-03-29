public  abstract class Vehicle {
    String vehiclePlateNumber;
    VehicleType vehicleType;

    public Vehicle(String vehiclePlateNumber, VehicleType vehicleType) {
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.vehicleType = vehicleType;
    }
}
