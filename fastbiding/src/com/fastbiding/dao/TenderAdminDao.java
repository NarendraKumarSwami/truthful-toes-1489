package com.fastbiding.dao;

import java.sql.Date;
import java.util.List;

import com.fastbiding.exception.TenderAdminException;
import com.fastbiding.model.Application;
import com.fastbiding.model.Feedback;
import com.fastbiding.model.Project;
import com.fastbiding.model.Tender;
import com.fastbiding.model.TenderAdmin;

public interface TenderAdminDao {
       public String  register(TenderAdmin admin)  throws TenderAdminException;
       
       public TenderAdmin login(String username, String password) throws TenderAdminException;
       
       
       public String addProject(Project pr) throws TenderAdminException;
       
       
       public List<Project> getAllProject(int tAdminId) throws TenderAdminException;
       
       public String createTenderofAproject(Tender tender) throws TenderAdminException;
       
       public String deleteTender(int projectId) throws TenderAdminException;
       
       public List<Application>  getAllAppOfTender(int projectId)  throws TenderAdminException;
       
       public  String   selectAppforTender(int appId, Date bidingDate, String city, String location) throws TenderAdminException;
       
       public  String  givefeeback(Feedback fb) throws TenderAdminException;
       
       
       
       
}
