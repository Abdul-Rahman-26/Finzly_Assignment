package Library_Management;

public class FacultyMember extends LibraryMember{
	 

		public FacultyMember(int memberID, String name) {
			super(memberID, name);
		}
		
		@Override
		public void borrowItem(LibraryItem item) {
		    System.out.print(name + " you got : " );
		    item.displayInfo();
		    System.out.println("By your Faculty memberID "+memberID);
		}

	}
