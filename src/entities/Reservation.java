package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer number;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {
		}
	
	public Reservation(Integer number, Date checkin, Date checkout) {
		
		this.number = number;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
   @Override
	public String toString() {
		return "Reservation Room "+ number + ", checkin: " + sdf.format(checkin) + ", checkout: " + sdf.format(checkout) +", " + duration() +" nights" ;
	}
	
	
	
	
}
