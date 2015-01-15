package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.pojo.OrderLine;
import sduwh.dream.service.OrderLineService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class OrderLineServiceImpl implements OrderLineService {

	@Override
	public List getOrderLine(Integer orderid) {
		return DaoFactory.getOrderLineDao().getOrderLine(orderid);
		
	}

}
