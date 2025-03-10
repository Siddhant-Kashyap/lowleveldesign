import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    public int noOfSpots;
    public List<ParkingSpots> spots;

    public ParkingFloor(int noOfSpots) {
        spots = new ArrayList<>();
       for(int i=0;i<noOfSpots;i++){
           spots.add(new ParkingSpots(i));
       }
    }
    public ParkingSpots getAvailableSpot(){
        for(ParkingSpots spot : spots){
            if(spot.isAvailable()){
                return spot;
            }
        }
        return null;
    }

}
