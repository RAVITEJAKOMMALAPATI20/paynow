/**
 * 
 */
package com.paynow.contactapi.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ravitejakommalapati
 *
 */
@Document(collection = "contacts")
public class Contact {
@Id
private String contactID;
private String userID;
private String firstName;
private String lastName;
private String phoneNumber;
private String email;
private boolean isSafe;
public String getContactId() {
	return contactID;
}
public void setContactId(String contactID) {
	this.contactID = contactID;
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
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
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public boolean isSafe() {
	return isSafe;
}
public void setSafe(boolean isSafe) {
	this.isSafe = isSafe;
}
@Override
public String toString() {
	return "Contact [contactID=" + contactID + ", userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", isSafe=" + isSafe + "]";
}

}
