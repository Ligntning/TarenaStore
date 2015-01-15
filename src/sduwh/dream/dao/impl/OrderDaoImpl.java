package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.dao.OrderDao;
import sduwh.dream.pojo.Order;
import sduwh.dream.pojo.OrderLine;
import sduwh.dream.util.JDBCTools;

public class OrderDaoImpl implements OrderDao {

	@Override
	public List getOrderList() {
		List orderList = new ArrayList();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;

		try {

			conn = JDBCTools.getConnection();
			statement = conn.createStatement();

			String sql = "SELECT *"+"FROM orders";
			System.out.println(sql);
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				Order order=new Order();
				order.setCost(rs.getFloat("cost"));
				order.setName(rs.getString("name"));
				order.setOrderId(rs.getInt("orderid"));
				order.setPaywayId(rs.getFloat("paywayid"));
				order.setStatusId(rs.getFloat("statusid"));
				order.setUserId(rs.getString("userid"));
				
				orderList.add(order);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JDBCTools.releaseDB(rs, statement, conn);
		}

		return orderList;
	}

}
