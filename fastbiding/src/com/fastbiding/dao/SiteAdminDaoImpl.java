package com.fastbiding.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fastbiding.exception.SiteAdminException;
import com.fastbiding.model.SiteAdmin;
import com.fastbiding.utility.DBUtil;

public class SiteAdminDaoImpl implements SiteAdminDao{

	@Override
	public SiteAdmin login(String username, String password) throws SiteAdminException {
		// TODO Auto-generated method stub
		SiteAdmin sa = null;
		
		try (Connection con = DBUtil.provideConnection()){
			     PreparedStatement ps =  con.prepareStatement("select * from siteAdmin where email = ? and password = ?");
		          ps.setString(1, username);
		          ps.setString(2, password);
		         ResultSet rs =	    ps.executeQuery();
		         
		         if(rs.next()) {
		        	 sa = new SiteAdmin(rs.getInt("sid"), rs.getString("sname"), rs.getString("email"), rs.getString("password"));
		         }else {
		        	 throw new SiteAdminException("Wrong Credentails");
		         }
		
		
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new SiteAdminException(e.getMessage());
		}
		
		return sa;
	}

}
