package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.dao.ContactInfoDao;
import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.util.JDBCTools;

public class ContactInfoDaoImpl implements ContactInfoDao {

	@Override
	public ContactInfo getContactInfo(String userid) {
		ContactInfo contactInfo=new ContactInfo();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM contactinfo where userid = '"+userid+"'";
			System.out.println(sql);	
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				contactInfo.setCellPhone(rs.getString("cellphone"));
				contactInfo.setCity(rs.getString("city"));
				contactInfo.setCountry(rs.getString("country"));
				contactInfo.setEmail(rs.getString("email"));
				contactInfo.setHomePhone(rs.getString("homephone"));
				contactInfo.setOfficePhone("officephone");
				contactInfo.setProvince(rs.getString("province"));
				contactInfo.setStreet1(rs.getString("street1"));
				contactInfo.setStreet2(rs.getString("street2"));
				contactInfo.setUserId(rs.getString("userid"));
				contactInfo.setZip(rs.getString("zip"));				
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		return contactInfo;
	}

}
