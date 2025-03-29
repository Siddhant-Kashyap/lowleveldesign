public class Slot {
    String slotId;
    String slotType;
    boolean isAvailable;


    public Slot(String slotId, String slotType, boolean isAvailable) {
        this.slotId = slotId;
        this.slotType = slotType;
        this.isAvailable = isAvailable;
    }

    public String getSlotId() {
        return slotId;
    }
    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }
    public String getSlotType() {
        return slotType;
    }
    public void setSlotType(String slotType) {
        this.slotType = slotType;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public Slot park(Vehicle vehicle,Slot slot){
        slot.isAvailable = false;
        return slot;
    }
    public Slot unPark(Vehicle vehicle,Slot slot){
        slot.isAvailable = true;
        return slot;
    }
}
