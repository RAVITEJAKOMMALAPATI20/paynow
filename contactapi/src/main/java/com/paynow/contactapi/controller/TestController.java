package com.paynow.contactapi.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static String ipAddress="";
	
	@GetMapping("/ping")
    public String ping() {
		try {
		InetAddress inetAddress = InetAddress.getLocalHost();
		ipAddress=inetAddress.getHostAddress();
		}catch(Exception exp) {
			
		}
       
		return "Pong ContactAPI is ALIVE Running on "+ipAddress;
    }
	
}
