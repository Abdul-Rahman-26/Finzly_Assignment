package Library_Management;

public class StudentMember extends LibraryMember {

    public StudentMember(int memberID, String name) {
        super(memberID, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.print(name + " you got: ");
        item.displayInfo();
        System.out.println("By your Student memberID " + memberID);
    }
}