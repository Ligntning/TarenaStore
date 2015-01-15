package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.dao.OrderLineDao;
import sduwh.dream.pojo.OrderLine;
import sduwh.dream.util.JDBCTools;

public class OrderLineDaoImpl implements OrderLineDao {

	@Override
	public List getOrderLine(Integer orderid) {
		List orderLineList=new ArrayList();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM orderline where orderid = "+orderid;
			System.out.println(sql);	
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				OrderLine orderLine =new OrderLine();
				orderLine.setAmount(rs.getFloat("amount"));
				orderLine.setLineId(rs.getInt("lineid"));
				orderLine.setOrderId(rs.getInt("orderid"));
				orderLine.setProductId(rs.getInt("productid"));				
				orderLineList.add(orderLine);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		return orderLineList;
	}

}
