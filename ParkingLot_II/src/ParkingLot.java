import java.util.HashMap;
import java.util.List;

public class ParkingLot {
    String lotId;
    List<Floor> floors;
    HashMap<Vehicle,Slot> parkMap = new HashMap<>();

    public ParkingLot(String lotId, List<Floor> floor) {
        this.lotId = lotId;
        this.floors = floor;
    }
    public Slot getSlotsOnFloor(){
        for(Floor floor:floors){
            Slot slot = floor.getSlot();
            if(slot != null){
                return  slot;
            }
        }
        return null;
    }
    public boolean park(Vehicle vehicle){
        Slot slot = getSlotsOnFloor();
        if(slot != null){
            slot.park(vehicle,slot);
            parkMap.put(vehicle,slot);
        }
        return false;
    }
    public boolean unpark(Vehicle vehicle){
        Slot slot = parkMap.get(vehicle);
        if(slot!= null){
            slot.unPark(vehicle,slot);
            return true;
        }
        return false;
    }

}
