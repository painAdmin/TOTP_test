package com.huate.client;

import java.util.List;

import com.warrenstrange.googleauth.GoogleAuthenticator;



public class Client {

	public static void main(String[] args) {
		 GoogleAuthenticator gAuth = new GoogleAuthenticator();
	      int code = gAuth.getTotpPassword("7CWLRPW5X75KK4NE");
		      
		  System.out.println(code);
	
	}

	
}
