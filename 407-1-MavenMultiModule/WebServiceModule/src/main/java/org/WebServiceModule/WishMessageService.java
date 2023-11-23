package org.WebServiceModule;

import java.time.LocalDateTime;

public class WishMessageService {
	
	public void wishMessage(String user){
		
		LocalDateTime dt=LocalDateTime.now();
		int hour = dt.getHour();
		
		if(hour<12) {
			System.out.println("good morning  "+user);
		}else if(hour<16) {
			System.out.println("Good evening "+user);
		}else if(hour<20) {
			System.out.println("Good Evening "+user);
			
		}else {
			System.out.println("Good night");
		}
	}

}
