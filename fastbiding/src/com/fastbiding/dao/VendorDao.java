package com.fastbiding.dao;

import java.util.List;

import com.fastbiding.exception.VendorException;
import com.fastbiding.model.CompletedProject;
import com.fastbiding.model.SelectedApplication;
import com.fastbiding.model.Tender;
import com.fastbiding.model.Vendor;

public interface VendorDao {
     
	
	public String register(Vendor vendor)  throws VendorException;
	
	public Vendor login(String username, String password)  throws VendorException;
	
	public List<Tender>  getAllTender() throws VendorException;
	
	public  String       getTenderDetails(int tenderId) throws VendorException;	
	
	public String  applyforTender(int vendor, int tenderId, String detailsDoc) throws VendorException;
	
    public List<SelectedApplication>  getAllOffer(int vendorId) throws VendorException;
	
//	public String getB2Bdetails(int tenderId) throws VendorException;
	
	public List<CompletedProject> getProfile(int vid) throws VendorException;
	
}	
