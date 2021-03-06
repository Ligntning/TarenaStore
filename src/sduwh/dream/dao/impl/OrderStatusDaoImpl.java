package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.dao.OrderStatusDao;
import sduwh.dream.pojo.OrderStatus;
import sduwh.dream.util.JDBCTools;

public class OrderStatusDaoImpl implements OrderStatusDao {

	@Override
	public OrderStatus getOrderStaus(float statusid) {
		OrderStatus orderStatus=new OrderStatus();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM orderstatus where statusid = "+statusid;
			System.out.println(sql);	
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				orderStatus.setDescription(rs.getString("description"));
				orderStatus.setName(rs.getString("name"));
				orderStatus.setStatusId(rs.getFloat("statusid"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		return orderStatus;
	}

}
