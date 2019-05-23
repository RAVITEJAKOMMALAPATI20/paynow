package com.paynow.contactapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.paynow.contactapi.dao.ContactDAO;
import com.paynow.contactapi.pojo.Contact;
import com.paynow.contactapi.util.ContactAPIutil;

@Component
public class ContactService {

	@Autowired
	ContactDAO contactDAO;
	
	public List<Contact> getAllContactsService(String userID) {
		List<Contact> contacts=contactDAO.findByUserID(userID);
		return contacts;
	}
	public Contact getContactService(Contact contact) {
		contactDAO.findById(contact.getContactId());
		return contact;
	}
	
	public Contact createContactService(Contact contact,String userID) {
		contact.setContactId(ContactAPIutil.getUniqueString(userID));
		contactDAO.save(contact);
		return contact;
	}
	
	public void updateContactService(Contact contact) {
		
		contactDAO.save(contact);
	}
	public void deleteContactService(Contact contact) {
		contactDAO.deleteById(contact.getUserID());
		
	}
	
	
}
