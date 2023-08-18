package Library_Management;

public class Main {
	public static void main(String[] args) {
	
		Book book = new Book("BEN10",2001,"Omnitrix");
		book.displayInfo();
		System.out.println();
		DVD dvd = new DVD("JAILER",2023,180);
		dvd.displayInfo();
		System.out.println();
		
		StudentMember student = new StudentMember(4001,"AB");
		
		FacultyMember faculty = new FacultyMember(6135,"Sugaeshwari");
		student.borrowItem(book);
		
		System.out.println();
		faculty.borrowItem(dvd);
		
		System.out.println();
		LibraryMember student1 = new StudentMember(4045,"THIYA");
		student1.reserveItem(dvd);
}
	}
