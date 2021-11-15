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
	
	public void setStreetNumber(String streetNumber){
		this.streetNumber = streetNumber;
	}
	public void setCity(String city) {
		this.city = city; 
	}
	
	public void setState(String state) {
		this.state = state ; 
	}
	public void setCounty(String country) {
		this.country = country ; 
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode ; 
	}
	
	public String getStreetNumber(String streetNumber){
		return streetNumber;
	}
	public String getCity(String city) {
		return city; 
	}
	
	public String getState(String state) {
		return state ; 
	}
	public String getCounty(String country) {
		return country ; 
	}
	public String getPostCode(String postCode) {
		return postCode ; 
	}
	
	
	
		
	}


