package com.fastbiding.usecase;

import com.fastbiding.app.Main;
import com.fastbiding.dao.ProposalAdminDao;
import com.fastbiding.dao.ProposalAdminDaoImpl;
import com.fastbiding.exception.ProposalAdminException;
import com.fastbiding.model.ProposalAdmin;

public class ProposalAdminUseCase {
         // all the Usecases for the proposal admin are listed as individiual method
	  public ProposalAdminDao dao = new ProposalAdminDaoImpl();
	  
	  public void register() {
		  
		     System.out.println("Enter the details for registration");
		     Main.sc.nextLine();
		      
		      System.out.println("Enter company name :");
		      String client = Main.sc.nextLine();
		      
		      System.out.println("Enter Email");
		      String email = Main.sc.nextLine();
		      
		      System.out.println("Enter Country ");
		      String country = Main.sc.nextLine();
		      
		      System.out.println("Enter State");
		      String state = Main.sc.nextLine();
		      
		      System.out.println("Enter location");
		      String location = Main.sc.nextLine();
		      
		      System.out.println("Enter Company Registration No");
		      String comregistrationNo = Main.sc.nextLine();
		      
		      System.out.println("Enter Password");
		      String password = Main.sc.next();
		      
		      
		     ProposalAdmin pAdmin = new ProposalAdmin();
		      
		      pAdmin.setClient(client);
		      pAdmin.setEmail(email);
		      pAdmin.setCountry(country);
		      pAdmin.setState(state);
		      pAdmin.setLocation(location);
		      pAdmin.setCompanyRegistrationNo(comregistrationNo);;
		      pAdmin.setPassword(password);
		      
		      try {
			    String result =	dao.register(pAdmin);
			    System.out.println(result);
			} catch (ProposalAdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		      
	  }
	  
	  
	  
	  public void login() {
		     System.out.println("Enter Credentails for Login As Project/Proposal Admin");
		     Main.sc.nextLine();
		     
		     System.out.println("Enter Email Id :");
		     String email = Main.sc.nextLine();
		     
		     System.out.println("Enter Password ");
		     String password = Main.sc.next();
		     
		     
		     
		     
		     
		     try {
			    ProposalAdmin pAdmin =	dao.login(email, password);
			    System.out.println(pAdmin);
			} catch (ProposalAdminException e) {
				// TODO Auto-generated catch block
				  System.out.println(e.getMessage());
			}
		     
		     
	  }







}