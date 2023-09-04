package exceptionHandling.hotelManagementSystem2;

public class SuiteRoom extends Room {
 
	public SuiteRoom(String roomNumber, boolean isAvailable) {
        super(roomNumber, isAvailable);
    }

    
	@Override
    public String getRoomType() {
        return "Suite Room";
    }
}