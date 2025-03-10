import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingFloor> floors;
    public ParkingLot(int numFloor, int spotPerFloor){
        floors= new ArrayList<>();
        for(int i=0;i<numFloor;i++){
            floors.add(new ParkingFloor(spotPerFloor));
        }
    }
    public void parkVehicle(Vehicle vehicle){
        for(ParkingFloor floor :floors){
            ParkingSpots spot = floor.getAvailableSpot();
            if(spot!= null){
                spot.assignVehicle(vehicle);
                System.out.println("Vehicle "+ vehicle+" Parked");
                return;
            }else{
                System.out.println("No empty slot !!!");
            }
        }
    }
    public void  unparkVehicle(){
            for(ParkingFloor floor : floors){
                for(ParkingSpots spot : floor.spots){
                    if(spot.)
                }
            }
    }
}
