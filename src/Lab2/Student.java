package Lab2;

public class Student {
	
	private static int sID = 1000;
	private String lastName;
	private String firstName;
	private String SSN;
	private String email;
	private String userID;
	private String phone = "";
	private String city = "";
	private String state = "";
	
	Student (String lastName, String firstName, String SSN){
		sID++;
		this.lastName = lastName;
		this.firstName = firstName;
		this.SSN = SSN;
		setEmail();
		setUserId();
		
	}
	
	private void setEmail() {
		email = firstName + "." + lastName + "." + sID + "@somecollege.edu";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max-min));
		randNum = randNum + min;
		userID = "" + sID + randNum + SSN.substring(5);
		System.out.println("Your User ID: " + userID);
	}
	
	public String getUserID() {
		return userID;
	}
	
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
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


	public void enroll(){
		System.out.println("Signing up for courses.");
	}
	
	public void pay(){
		System.out.println("Making payment.");
	}
	
	public void checkBalance(){
		System.out.println("Checking balance.");
	}
	
	public String toString(){
		System.out.println("[" + lastName + "]");
		return lastName;
	}
	
	public void showCourses(){
		System.out.println("Listing courses");
	}

}
