package audience.information;

public class Persons {
	
	String fName;
	String lName;
	String fullName;

	public Persons() {
		
	}
	public Persons(String fName) {
		// TODO Auto-generated constructor stub
	}

	public Persons(String fName, String lName) {
		this.fullName = (fName  + " " + lName);
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
		return fullName;
	}
	
}
