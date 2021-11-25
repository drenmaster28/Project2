package audience.information;

public class Address{


	String streetNumber;
	String city;
	String state;
	String country;
	String postCode;
	String fullAddrees;
	
	public Address() {
	}
	
	public Address(String streetNumber, String city, String state, String country, String postCode) {
		this.streetNumber = streetNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postCode = postCode;
	}
	

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getFullAddress() {
		return (streetNumber + " " + city + " " + state + " " + country + " " + postCode);
	}
	
	}


