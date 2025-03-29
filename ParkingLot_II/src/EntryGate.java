public class EntryGate {
    String entryGateId;
    ParkingLot parkingLot;

    public EntryGate(String entryGateId, ParkingLot parkingLot) {
        this.entryGateId = entryGateId;
        this.parkingLot = parkingLot;
    }
    public Ticket issueTicket(Vehicle vehicle){
        Ticket ticket = parkingLot.park(vehicle);
        if()
    }
}
