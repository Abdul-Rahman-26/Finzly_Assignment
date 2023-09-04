package exceptionHandling.hotelManagementSystem2;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void makeReservation(Reservation reservation, String roomNumber) throws InvalidReservationException, RoomNotFoundException {
       
    	Room room = null;
        for (Room r : rooms) {
            if (r.getRoomNumber().equals(roomNumber)) {
                room = r;
                break;
            }
        }

        if (room == null) {
            throw new RoomNotFoundException("Room not found: " + roomNumber);
        }

        if (room.isAvailable()) {


        	room.setAvailable(false);
        } else {
            throw new InvalidReservationException("Room is not available for booking.");
        }
    }

    public void showAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room Number: " + room.getRoomNumber() + " - Room Type: " + room.getRoomType());
            }
        }
    }
}
