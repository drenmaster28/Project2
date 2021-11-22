package audience.information;

public class Audience extends Persons {
	long id;
	char section;
	long seatNumber;
	String phone;
	Address getAddress = new Address();
	double price;
	String offer;
	
	
	public Audience(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}
	// enter complete audience data
	public Audience(String fName, String lName,  long id, String phone, Address Address) {
		super(fName, lName);
		this.id = id;
		this.phone = phone;
		this.getAddress = Address;
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
	public char getSection() {
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

	
	
	public issueTicket() {
	
		// input detail (Id number, name, section, seat number, phone, price, if any special offer applied and total price).
	}
	// check valid section 
	
	
	//public 
	
	
	
	
	
}
