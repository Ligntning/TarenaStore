package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.pojo.Order;
import sduwh.dream.pojo.Product;
import sduwh.dream.service.OrderService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class OrderServiceImpl implements OrderService {

	@Override
	public List getOrderList() {
		return DaoFactory.getOrderDao().getOrderList();
	}

}
