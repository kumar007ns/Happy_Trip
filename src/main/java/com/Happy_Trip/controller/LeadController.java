package com.Happy_Trip.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Happy_Trip.entity.Lead;
import com.Happy_Trip.services.LeadServices;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/happy_trip")
public class LeadController {
	@Autowired
	private LeadServices leadserv;
	
	@GetMapping("/show")
	public String show() {
		
		return "show1";
	}
	
	@PostMapping("/savedata")
	public String savedata(Lead lead) {
		leadserv.saveLeadData(lead);
		//ResponseEntity.ok( "Your Data is Stored");
		return "show1";
		
	}
	
			
			
			
	@GetMapping("/listdata")
	public String listAllData(Lead lead, Model model) {
	    List<Lead> listdata = leadserv.listAllInfo(lead);
	    model.addAttribute("listdata", listdata); // Pass to JSP
	    return "showdata";
	}
	@GetMapping("/delete")
	public String Delete(@RequestParam("id")long id) {
		leadserv.deleteById(id);
		
		return "redirect:/happy_trip/listdata";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id")long id,Model model) {
		
		Lead lead=leadserv.updatebyid(id);
		model.addAttribute("lead",lead);
		
		return "update_data";
	}
	@PostMapping("/updatedata")
public String updatedata(Lead lead) {
	leadserv.updatedata(lead);
	return "redirect:/happy_trip/listdata";
}
}

