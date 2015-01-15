package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.pojo.Category;
import sduwh.dream.pojo.OrderStatus;
import sduwh.dream.service.OrderStatusService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class OrderStatusServiceImpl implements OrderStatusService {

	@Override
	public OrderStatus getOrderStaus(float statusid) {
		return DaoFactory.getOrderStatusDao().getOrderStaus(statusid);
	}

}
