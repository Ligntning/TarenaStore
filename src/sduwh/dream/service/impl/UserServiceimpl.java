package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.pojo.User;
import sduwh.dream.service.UserService;
import sduwh.dream.util.JDBCTools;

public class UserServiceimpl implements UserService {

	@Override
	public List getUserList() {
		List userList=new ArrayList();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM users";
				
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				User user=new User();
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));
				
				userList.add(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		
		return userList;
	}
	
	public User getUserByID(String userid) {
		User user=new User();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM users where userid = '"+userid+"'";
				
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				
				user.setUserid(rs.getString("userid"));
				user.setPassword(rs.getString("password"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		
		return user;
	}

}
