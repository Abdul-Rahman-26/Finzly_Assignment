package country;

import java.util.ArrayList;
import java.util.Scanner;

class Area {
    private String name;

    public Area(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class District {
    private String name;
    private ArrayList<Area> areas;

    public District(String name, Area... areas) {
        this.name = name;
        this.areas = new ArrayList<>();
        for (Area area : areas) {
            this.areas.add(area);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }
}

class State {
    private String name;
    private ArrayList<District> districts;

    public State(String name) {
        this.name = name;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }
}

public class Operation {

    ArrayList<State> createIndia() {

        Area chennai = new Area("Chennai");
        Area coimbatore = new Area("Coimbatore");
        Area madurai = new Area("Madurai");
        Area mumbai = new Area("Mumbai");
        Area pune = new Area("Pune");
        Area bangalore = new Area("Bangalore");

        District chennaiDistrict = new District("Chennai District", chennai);
        District coimbatoreDistrict = new District("Coimbatore District", coimbatore);
        District maduraiDistrict = new District("Madurai District", madurai);
        District mumbaiDistrict = new District("Mumbai District", mumbai);
        District puneDistrict = new District("Pune District", pune);
        District bangaloreDistrict = new District("Bangalore District", bangalore);

        State tamilNadu = new State("Tamil Nadu");
        tamilNadu.addDistrict(chennaiDistrict);
        tamilNadu.addDistrict(coimbatoreDistrict);
        tamilNadu.addDistrict(maduraiDistrict);

        State maharashtra = new State("Maharashtra");
        maharashtra.addDistrict(mumbaiDistrict);
        maharashtra.addDistrict(puneDistrict);

        State karnataka = new State("Karnataka");
        karnataka.addDistrict(bangaloreDistrict);


        ArrayList<State> india = new ArrayList<>();
        india.add(tamilNadu);
        india.add(maharashtra);
        india.add(karnataka);

        return india;
    }

    public static void main(String[] args) {
        Operation o = new Operation();
        ArrayList<State> india = o.createIndia();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Show All States");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Inside India");
                    for (State state : india) {
                        System.out.println("State: " + state.getName());

                        for (District district : state.getDistricts()) {
                            System.out.println("\tDistrict: " + district.getName());

                            for (Area area : district.getAreas()) {
                                System.out.println("\t\tArea: " + area.getName());
                            }
                        }
                    }
                    break;
                case 2:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
