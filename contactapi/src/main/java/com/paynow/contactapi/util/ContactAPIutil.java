/**
 * 
 */
package com.paynow.contactapi.util;

import java.util.UUID;

/**
 * @author ravitejakommalapati
 *
 */
public class ContactAPIutil {

	
	//Generates Unique String
	public static String getUniqueString(String userID) {
		return userID+"-"+UUID.randomUUID().toString();
	}
}
