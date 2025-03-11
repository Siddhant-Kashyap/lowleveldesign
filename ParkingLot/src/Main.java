//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(2,4);
        Vehicle sureshAudi = new Vehicle("KA01MH1234",VehicleType.CAR);
        Vehicle maheshTruck = new Vehicle("KA01MH1235",VehicleType.TRUCK);
        Vehicle myBike = new Vehicle("KA01MH1236",VehicleType.BIKE);
        Vehicle myCar = new Vehicle("KA01MH1237",VehicleType.CAR);
        Vehicle xBike = new Vehicle("KA01MH1238",VehicleType.BIKE);

        parkingLot.parkVehicle(sureshAudi);
        parkingLot.parkVehicle(maheshTruck);
        parkingLot.parkVehicle(myBike);
        parkingLot.parkVehicle(myCar);
//        parkingLot.unparkVehicle(sureshAudi.numberPlate);
        parkingLot.parkVehicle(xBike);
        parkingLot.displayParkingMap();
    }
}