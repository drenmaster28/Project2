package audience.information;

public class Audience {
	long id;
	char section;
	long seatNumber;
	String phone;
	// address();
	double price;
	String offer;
	
	
	public Audience() {
		// TODO Auto-generated constructor stub
	}
	// enter complete audience data
	public Audience(long id) {
		
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setSection(char section) {
	//add if (check valid section)
		this.section = section;
		
	}
	public void setSeatNumber(long seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public void setPrice(double price) {
		this.price = price;
		// set 3 differnet price in method
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public long getId() {
		return id;
	}
	public char getSction() {
		return section;
	}
	public long getSeatNumber() {
		return seatNumber;
	}
	public String getPhone() {
		return phone;
	}
	public double getPrice() {
		return price;
	}
	public String getOffer() {
		return offer;
	}

	// check valid section 
	
	// input detail 
	//public 
	
	
	
	
	
}
