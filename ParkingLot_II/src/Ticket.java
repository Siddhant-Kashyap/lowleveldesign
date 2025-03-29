import java.time.LocalDateTime;

public class Ticket {
    String ticketId;
    Vehicle vehicle;
    Slot slot;
    LocalDateTime entryTime;
    LocalDateTime exitTime;

    public Ticket(String ticketId, Vehicle vehicle, Slot slot, LocalDateTime entryTime, LocalDateTime exitTime) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }
    public String getTicketId(){
        return ticketId;
    }
    public void setExitTime(){
        this.exitTime = LocalDateTime.now();
    }

}
