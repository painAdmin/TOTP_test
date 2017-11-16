package com.huate.web;

import java.util.List;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import com.warrenstrange.googleauth.ICredentialRepository;

public class ResposeClass implements ICredentialRepository{

	public String getSecretKey(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveUserCredentials(String userName, String secretKey, int validationCode, List<Integer> scratchCodes) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		GoogleAuthenticator gAuth = new GoogleAuthenticator();
		final GoogleAuthenticatorKey key = gAuth.createCredentials("Bob");
          String code=key.getKey();
          System.out.println(code);
	}

}
