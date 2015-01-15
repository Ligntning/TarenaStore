package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.dao.PayWayDao;
import sduwh.dream.pojo.PayWay;
import sduwh.dream.util.JDBCTools;

public class PayWayDaoImpl implements PayWayDao {

	@Override
	public PayWay getPayWay(float paywayId) {
		PayWay payWay=new PayWay();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM payway where paywayid = "+paywayId;
			System.out.println(sql);	
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				payWay.setPayStyle(rs.getString("paystyle"));
				payWay.setPaywayId(rs.getFloat("paywayid"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		return payWay;

	}

}
