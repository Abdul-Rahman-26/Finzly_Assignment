package exceptionHandling.hotelManagementSystem2;

public class DeluxeRoom extends Room {

	public DeluxeRoom(String roomNumber, boolean isAvailable) {
        super(roomNumber, isAvailable);
    }

    
	@Override
    public String getRoomType() {
        return "Deluxe Room";
    }
}