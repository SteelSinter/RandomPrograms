package bank;

public class User {
	private String firstName, lastName, DOB, dateCreated;
	
	java.util.Date date = new java.util.Date();
	
	/**
	 * Creates an account for "Default User".
	 */
	public User() {
		firstName = "Default";
		lastName = "User";
		DOB = "00/00/0000";
		dateCreated = date.toString();
	}
	
	/**
	 * Creates a user account with a first name, last name, and date of birth.
	 * @param firstName String: first name of the user
	 * @param lastName String: last name of the user
	 * @param dateOfBirth String: date of birth of the user in format MM/DD/YYYY.
	 */
	public User(String firstName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dateOfBirth;
		dateCreated = date.toString();
	}
	
	/**
	 * Sets the date of birth for a user account with format MM/DD/YYYY.
	 * @param dateOfBirth
	 */
	public void setDOB(String dateOfBirth) {
		DOB = dateOfBirth;
	}
	
	/**
	 * 
	 * @param first
	 * @param last
	 */
	public void setOwnerName(String first, String last) {
		
	}
	
}
