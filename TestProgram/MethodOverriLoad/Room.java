package TestProgram.MethodOverriLoad;

import java.util.Date;

public class Room {

	    private int roomNumber;
	    private int capacity;
	    private double pricePerNight;
	    private boolean reserved;

	    public Room(int roomNumber, int capacity, double pricePerNight) {
	        this.roomNumber = roomNumber;
	        this.capacity = capacity;
	        this.pricePerNight = pricePerNight;
	        this.reserved = false;
	    }

	    public boolean checkAvailable() {
	        return !reserved;
	    }

	    public void makeReservation() {
	        reserved = true;
	    }

	    public void makeReservation(Date checkIn, Date checkOut) {
	        reserved = true;
	        System.out.println("Room " + roomNumber + " reserved from " + checkIn + " to " + checkOut);
	        System.out.println();
	    }

	    @Override
	    public String toString() {
	        return "Room Number: " + roomNumber +
	               ", Capacity: " + capacity +
	               ", Price per Night: " + pricePerNight +
	               ", Available: " + (!reserved ? "Yes" : "No");
	    }
	    public static void main(String[] args) {
	        Room user1 = new Room(111, 2, 800.0);
	        Room user2 = new Room(131, 4, 1150.0);
	        Room user3 = new Room(118, 3,1350);

	        System.out.println(user1);
	        System.out.println();
	        System.out.println(user2);

	        System.out.println();
	        if (user1.checkAvailable()) {
	            user1.makeReservation();
	        }

	        if (user2.checkAvailable()) {
	            Date on = new Date();
	            Date checkOutDate = new Date(on.getTime() + 2*86400000); 
	            user2.makeReservation(on, checkOutDate);
	        }

	        System.out.println(user1.toString());
	        System.out.println();
	        System.out.println(user3.toString());
	        System.out.println();
		    System.out.println(user2.toString());
	    
	    }
	}


