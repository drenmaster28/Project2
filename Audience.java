package audience.information;

import java.util.ArrayList;
import java.util.*;

public class Audience extends Persons {
	long id;
	char section;
	long seatNumber;
	String phone;
	Address address;
	double price;
	String offer;
	
	Scanner input = new Scanner(System.in);
	
	public Audience(String fName, String lName) {
		super(fName, lName);
		// TODO Auto-generated constructor stub
	}
	// enter complete audience data
	public Audience(String fName, String lName, String phone) {
		super(fName, lName);
		this.phone = phone;
	}
	
	public void setId() {
		this.id = (long)Math.random()*1000000000;
	}
	public void setSection(char section) {
		this.section = section;
		
	}
	public void setSeatNumber(long seatNumber) {
		this.seatNumber = seatNumber;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public void setPrice(char section) {
		if (section == 'a') {
			this.price = 59;	
		}else if(section == 'b') {
			this.price = 72;
		}else if(section == 'c') 
			this.price = 88;
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
	

	//check if Section is valid
	public boolean isValidSection() {
		if (section == 'a') {
			return true;
		}else if(section == 'b') {
			return true;
		}else if(section == 'c') {
			return true;
		}
		return false;
	}
	
	//asks the user to enter all the details of an audience then assigns the values to the data members
	public void inputDetail(){
		super.setFName(input.next());
		super.setLName(input.next());

		
		System.out.println("Please Enter your address");
		Address address = new Address();
		
		System.out.println("Street Number: ");
		address.setStreetNumber(input.next());
		
		System.out.println("City: ");
		address.setCity(input.next());
		
		System.out.println("State/Province: ");
		address.setState(input.next());

		System.out.println("Country: ");
		address.setCountry(input.next());
		
		System.out.println("PostCode: ");
		address.setPostCode(input.next());
		
		System.out.println("Please enter your phone number *no dash or space*: ");
		setphone(input.next());
		
		System.out.println("Select the Section: ");
		System.out.println("A: Wheelchair");
		System.out.println("B: Orchestra");
		System.out.println("C: Balcony");

		setSection(input.next().toLowerCase().charAt(0));
		
		System.out.println("Select Offer base on your Age: ");
		System.out.println("C. 12 or less");
		System.out.println("S. 18 or less");
		System.out.println("A. 64 or less");
		System.out.println("E. 65 or higher");
		setOffer(input.next().toUpperCase());
		
	}
	
	//prints the details of the audience (Id number, name, section, seat number, phone, price, if any special offer applied and total price)
	public void issueTicket() {
	
		System.out.println("Id number: " + getId());
		System.out.println("Name: " + super.getFullName());
		System.out.println("Section: " + getSection());
		System.out.println("Seat number: " + getSeatNumber());
		System.out.println("Phone: " + getPhone());
		System.out.println("Price: " + getPrice());
		System.out.println("Discount: " + getSpecialOffer());
		System.out.println("Total Price: " + (getPrice() - applyOffer()) );
	
	}
	// check Offer and set discount%
	public double getSpecialOffer() {
		if (offer == "A") {
		return 0;	
		}else if (offer == "S") {
		return 0.10;	
		}else if (offer == "C") {
		return 0.40;
		}else if (offer == "E") {
		return 0.30;
		}return 0;
	}	
	
	// calculate the discount
	public double applyOffer() {
		return getPrice() * getSpecialOffer();
	}
}
