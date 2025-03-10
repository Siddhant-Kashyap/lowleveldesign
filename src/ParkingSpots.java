public class ParkingSpots {
    private int spotId;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpots(int spotId, Vehicle vehicle) {
        this.spotId = spotId;
        this.vehicle = vehicle;
        isAvailable = true;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable= false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        this.isAvailable = false;
    }
    public  boolean isAvailable(){
        return isAvailable;
    }
}
