package com.fastbiding.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.fastbiding.exception.ProposalAdminException;
import com.fastbiding.model.ProposalAdmin;
import com.fastbiding.utility.DBUtil;

public class ProposalAdminDaoImpl implements ProposalAdminDao{

	@Override
	public String register(ProposalAdmin admin) throws ProposalAdminException {
		// TODO Auto-generated method stub
		String message  = "Not registerd ...";
		
		try (Connection con =DBUtil.provideConnection()){
				 PreparedStatement ps = con.prepareStatement("insert into proposalAdmin(client, email, location, password, country, state, companyRegistrationNo) values(?,?,?,?,?,?,?) ");
				 ps.setString(1, admin.getClient()); 
				 ps.setString(2, admin.getEmail());
				 ps.setString(3, admin.getLocation());
				 ps.setString(4, admin.getPassword());
				 ps.setString(5, admin.getCountry());
				 ps.setString(6, admin.getState());
				 ps.setString(7, admin.getCompanyRegistrationNo());
			    int x =	 ps.executeUpdate();
			    
			    if(x>0)
			    	message = "Congratulation! Your company is registered Seccussfully";
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ProposalAdminException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public ProposalAdmin login(String username, String password) throws ProposalAdminException {
		// TODO Auto-generated method stub
		ProposalAdmin pAdmin = null;
		
		try (Connection con = DBUtil.provideConnection()){
			        con.prepareStatement("select * from proposalAdmin ")
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return pAdmin;
	}

}
