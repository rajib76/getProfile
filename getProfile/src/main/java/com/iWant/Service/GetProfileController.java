package com.iWant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iWant.repository.Profile;
@RestController
@RequestMapping(value="/api")
@CrossOrigin("*")
public class GetProfileController {
	@Autowired
	private GetProfileService getProfileService;

	@RequestMapping(method=RequestMethod.GET,value="/getProfile/{firstName}")
	public Profile findName(@PathVariable String firstName)
	{
		return this.getProfileService.find(firstName);
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getProfile")
	public List findAll()
	{
		return this.getProfileService.findAll();
		
	}
}
