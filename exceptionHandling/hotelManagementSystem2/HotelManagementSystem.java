package exceptionHandling.hotelManagementSystem2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelManagementSystem {

    public static void main(String[] args) {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new StandardRoom("101", true));
        rooms.add(new DeluxeRoom("102", true));
        rooms.add(new SuiteRoom("103", false));

        Hotel hotel = new Hotel(rooms);

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Options:");
            System.out.println("1. Book a Room");
            System.out.println("2. Show All Rooms");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter guest name: ");
                        String guestName = scanner.next();
                        long contactNumber;
                        while (true) {
                            try {
                                System.out.print("Enter guest contact number: ");
                                contactNumber = scanner.nextLong();
                                break;
                            } catch (java.util.InputMismatchException e) {
                                System.err.println("Invalid input. Please enter a valid number.");
                                scanner.next();
                            }
                        }
                        System.out.print("Enter guest address: ");
                        String address = scanner.next();

                        Guest guest = new Guest(guestName, contactNumber, address);

                        System.out.print("Enter room number: ");
                        String roomNumber = scanner.next();

                        Reservation reservation = new Reservation(guest, new Date(), new Date());

                        hotel.makeReservation(reservation, roomNumber);

                        System.out.println("Room booked successfully!");
                    } catch (InvalidReservationException e) {
                        System.err.println("Error: " + e.getMessage());
                    } catch (RoomNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    hotel.showAvailableRooms();
                    break;
                case 3:
                    
                	scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
