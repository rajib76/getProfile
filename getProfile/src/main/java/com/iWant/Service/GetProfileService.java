package com.iWant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iWant.repository.Profile;
import com.iWant.repository.ProfileInterface;

@Service
public class GetProfileService  {
    
	@Autowired
	private ProfileInterface profile;
	public Profile find(String firstName) {
		System.out.println("rajib");
		//String firstName = null;
		return profile.findByFirstName(firstName);
		
		
	}
	public List findAll() {
		System.out.println("rajib");
		//String firstName = null;
		return profile.findAll();
	}

}
