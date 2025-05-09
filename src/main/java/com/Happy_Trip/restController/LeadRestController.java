package com.Happy_Trip.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Happy_Trip.entity.Lead;
import com.Happy_Trip.repository.LeadRepository;



@RestController
@RequestMapping("/api")
public class LeadRestController {
	
	@Autowired
	private LeadRepository leadrepo;
	 
	@GetMapping("/listdata")
	public List<Lead> getAllLeadata(Lead lead){
			List<Lead> allleaddata=	leadrepo.findAll();
		return allleaddata;
	}
	
	@PostMapping("/savedata")
	public void saveLeadData(@RequestBody Lead lead) {
		leadrepo.save(lead);
	}	
	
	@PutMapping("/updatedata")
	public void updateLeadData(@RequestBody Lead lead)
	{
		leadrepo.save(lead);
	}
	@DeleteMapping("deleteapi/{id}")
	public void deletedata(@PathVariable("id") long id) {
		leadrepo.deleteById(id);
	}
}
