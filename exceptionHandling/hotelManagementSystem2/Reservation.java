package exceptionHandling.hotelManagementSystem2;

import java.util.Date;

public class Reservation {

	private Guest guest;
	private Date startDate;
	private Date endDate;
	
	public Reservation(Guest guest, Date startDate, Date endDate) {
		super();
		this.guest = guest;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Guest getGuest() {
		return guest;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
}
