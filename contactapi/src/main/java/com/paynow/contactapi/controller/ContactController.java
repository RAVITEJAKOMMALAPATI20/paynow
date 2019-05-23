/**
 * 
 */
package com.paynow.contactapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.paynow.contactapi.pojo.Contact;
import com.paynow.contactapi.service.ContactService;

/**
 * @author ravitejakommalapati
 *
 */
@RequestMapping("users/{userID}")
@Controller
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@GetMapping("/contacts")
    public List<Contact> getContacts(@PathVariable("userID") String userID) {
		List<Contact>  contacts= contactService.getAllContactsService(userID);
        return contacts;
    }
	@GetMapping("/contacts/{contactID}")
    public Contact getContact(@PathVariable("userID") String userID,@PathVariable("contactID") String contactID) {
		Contact contact = null;
        return contact;
    }
	@PostMapping("/contacts")
    public Contact createContact(@PathVariable("userID") String userID,Contact contact) {
		Contact newcontact=contactService.createContactService(contact, userID);
        return newcontact;
    }
	
	@PutMapping("/contacts/{contactID}")
    public void updateContact(@PathVariable("userID") String userID,@PathVariable("contactID") String contactID,Contact contact) {
		//update it
    }
	@DeleteMapping("/contacts/{contactID}")
    public void deleteContact(@PathVariable("userID") String userID,@PathVariable("contactID") String contactID,Contact contact) {
    }
	
	
}
