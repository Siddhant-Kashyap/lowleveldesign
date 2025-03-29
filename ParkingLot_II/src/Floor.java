import java.util.ArrayList;
import java.util.List;

public class Floor {
    String floorId;
    List<Slot> slots;

    public Floor(String floorId) {
        this.floorId = floorId;
        slots = new ArrayList<>();
    }
    public Slot getSlot(){
        for(Slot slot:slots){
            if(slot.isAvailable()){
                return slot;
            }
        }
        return null;
    }

    public boolean addSlot(Slot slot){
        slots.add(slot);
        return true;
    }
    public boolean removeSlot(Slot slot){
        slots.remove(slot);
        return true;
    }

}
