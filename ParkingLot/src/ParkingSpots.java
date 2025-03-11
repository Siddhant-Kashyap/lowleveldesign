public class ParkingSpots {
    private int spotId;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpots(int spotId) {
        this.spotId = spotId;
        isAvailable = true;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable= false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        this.isAvailable = true;
    }
    public  boolean isAvailable(){
        return isAvailable;
    }
}
