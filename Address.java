package audience.information;

public class Address {


	String streetNumber;
	String city;
	String state;
	String country;
	String postCode;
	String fullAddrees;
	
	public Address() {
	
	}
	
	public Address(String streetNumber, String city, String state, String contry, String postCode) {
		this.fullAddrees = (streetNumber + " " + city + " " + state + " " + contry + " " + postCode); 
	}
	
	public void getStreetNumber(String streetNumber){
		this.streetNumber = streetNumber;
	}
	public void getCity(String city) {
		this.city = city; 
	}
	
	public void getState(String state) {
		this.state = state ; 
	}
	public void getCounty(String country) {
		this.country = country ; 
	}
	public void getPostCode(String postCode) {
		this.postCode = postCode ; 
	}
	
	
	
		
	}


