package com.fastbiding.app;

import java.util.Scanner;

import com.fastbiding.usecase.ProposalAdminUseCase;

public class Main {
     // this is main class of application
	// this is the entry point.
	public static  Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Fast Biding");
		
		// option - SiteAdmin , ProposalAdmin, Vendor
		 System.out.println("Enter Number :");
         System.out.println("1 for SiteAdmin");	
         System.out.println("2 for Porject or Proposal Administatrator ");	
         System.out.println("3 for Vendor");	
         
         int num = sc.nextInt();
         
         switch (num) {
		case 1: {
			
		    	siteAdmin();
		    	break;
		}
		case 2: {
			
	    	proposalAdmin();
	    	break;
	    }
      case 3: {
			
	    	vendor();
	    	break;
	    }
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
        
	}
	
	
	public static void siteAdmin() {
		    // login
		    System.out.println("Please Enter Credientails for Login");
		    System.out.println("Enter Email Id :");
		    String email = sc.next();
		    System.out.println("Enter the password :");
		    String password = sc.next();
		
		    // options for all process that a website Administrator can do;
		  
	}

	public static void proposalAdmin() {
		// create a instance of ProposalAdminUseCase class
		   ProposalAdminUseCase pAdminUseCase = new ProposalAdminUseCase();
		   
		   
		  
		   System.out.println("Enter Option as 1 & 2 ");
		   
		   
		   System.out.println("1 for Registeration ");
		   System.out.println("2 for Login");
		   
		   
		   int key = sc.nextInt();
		   
		   
		   switch (key) {
		case 1: {
			
			pAdminUseCase.register();
			break;
		}
     	case 2: {
			
			pAdminUseCase.login();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}
	
	public static void vendor() {
		   // call usecase of vendor
	}
	
	
	
}
