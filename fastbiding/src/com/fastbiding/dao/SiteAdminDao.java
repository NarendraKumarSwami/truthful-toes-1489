package com.fastbiding.dao;

import java.util.List;

import com.fastbiding.exception.SiteAdminException;
import com.fastbiding.model.Project;
import com.fastbiding.model.SiteAdmin;
import com.fastbiding.model.Tender;
import com.fastbiding.model.TenderAdmin;
import com.fastbiding.model.Vendor;

public interface SiteAdminDao {
       
	  public SiteAdmin login(String username, String password)  throws SiteAdminException;
	
	  public List<TenderAdmin> getAllTenderAdmin() throws SiteAdminException;
	  
	  public List<Vendor> getAllVendors() throws SiteAdminException;
	  
	  public List<Project> getAllProjects() throws SiteAdminException;
	  
	  public List<Tender>  getAllTenders() throws SiteAdminException;
	  
	  public String removeAVendor(int vid) throws SiteAdminException;
	  
	  public String removeATenderAdmin(int tid) throws SiteAdminException;
}
