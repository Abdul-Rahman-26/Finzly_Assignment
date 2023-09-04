package exceptionHandling.hotelManagementSystem2;

public class StandardRoom extends Room{
	
	
	public StandardRoom(String roomNumber, boolean isAvailable) {
		super(roomNumber, isAvailable);
	}

	@Override
	public String getRoomType() {
		return "Standard Room";
	}

	
}
