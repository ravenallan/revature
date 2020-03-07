package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
	private String firstName;
	private String lastName;
	private String email;
	private transient String ssn;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return "First Name: " + firstName + "\n" +
			   "Last Name: " + lastName + "\n" +
			   "email: " + email + "\n" +
			   "SSN: " + ssn + "\n";
	}
}
