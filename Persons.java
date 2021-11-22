package audience.information;

public class Persons {
	
	String fName;
	String lName;


	public Persons(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}


	public void setFName(String fName) {
		this.fName = fName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getFName() {
		return fName;
	}
	public String getLName() {
		return lName;
	}
	public String getFullName() {
		return (fName  + " " + lName);
	}
	
}
