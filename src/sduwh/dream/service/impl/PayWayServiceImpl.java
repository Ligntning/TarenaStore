package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.pojo.PayWay;
import sduwh.dream.service.PayWayService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class PayWayServiceImpl implements PayWayService {

	@Override
	public PayWay getPayWay(float paywayId) {
		return DaoFactory.getPayWayDao().getPayWay(paywayId);
	}

}
