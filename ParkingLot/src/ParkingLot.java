import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    List<ParkingFloor> floors;
    HashMap<String,ParkingSpots> map = new HashMap<> ();
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
                map.put(vehicle.numberPlate,spot);
                System.out.println("Vehicle "+ vehicle.numberPlate+" Parked");
                return;
            }
        }
        System.out.println("No Slots Available !!");

    }
    public void  unparkVehicle(String numberPlate){
        ParkingSpots spot = map.get(numberPlate);
        if(spot!= null){
            spot.removeVehicle();
            map.remove(numberPlate);
            System.out.println("Vehicle has been removed");
        }else{
            System.out.println("Vehicle with number : "+numberPlate+" not available in Parking lot");
        }
    }
    public void displayParkingMap(){
        System.out.println(map);
    }
}
