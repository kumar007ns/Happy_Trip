package com.Happy_Trip.services;

import java.util.List;

import com.Happy_Trip.entity.Lead;

public interface LeadServices {
public void saveLeadData(Lead lead);
	
	public List<Lead> listAllInfo(Lead lead);

	public void deleteById(long id);

	public Lead updatebyid(long id);

	public void updatedata(Lead lead);
	

}
